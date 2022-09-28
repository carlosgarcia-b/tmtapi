package com.tmtapi.tmtapi.services;

import java.util.ArrayList;
import java.util.Optional;

import com.tmtapi.tmtapi.models.TaskFollowUpModel;
import com.tmtapi.tmtapi.repositories.TaskFollowUpRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskFollowUpService {
    @Autowired
    TaskFollowUpRepository taskFollowUpRepository;
    
    public ArrayList<TaskFollowUpModel> getTaskFollowUps(){
        return (ArrayList<TaskFollowUpModel>) taskFollowUpRepository.findAll();
    }

    public TaskFollowUpModel saveTaskFollowUp(TaskFollowUpModel taskFollowUp){
        return taskFollowUpRepository.save(taskFollowUp);
    }

    public Optional<TaskFollowUpModel> getByTaskFollowUpId(Long taskFollowUpId){
        return taskFollowUpRepository.findById(taskFollowUpId);
    }

    public ArrayList<TaskFollowUpModel> getByTaskId(Long taskId){
        return taskFollowUpRepository.findByTaskId(taskId);
    }

    public boolean deleteTaskFollowUp(Long taskFollowUpId){
        try{
            taskFollowUpRepository.deleteById(taskFollowUpId);
            return true;
        }catch(Exception err){
            return false;
        }
    }

}
