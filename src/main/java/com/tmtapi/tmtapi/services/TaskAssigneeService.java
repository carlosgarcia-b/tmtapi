package com.tmtapi.tmtapi.services;

import java.util.ArrayList;
import java.util.Optional;

import com.tmtapi.tmtapi.models.TaskAssigneeModel;
import com.tmtapi.tmtapi.repositories.TaskAssigneeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskAssigneeService {
    @Autowired
    TaskAssigneeRepository taskAssigneeRepository;
    
    public ArrayList<TaskAssigneeModel> getTaskAssignees(){
        return (ArrayList<TaskAssigneeModel>) taskAssigneeRepository.findAll();
    }

    public TaskAssigneeModel saveTaskAssignee(TaskAssigneeModel taskAssignee){
        return taskAssigneeRepository.save(taskAssignee);
    }

    public Optional<TaskAssigneeModel> getByTaskAssigneeId(String taskAssigneeId){
        return taskAssigneeRepository.findById(taskAssigneeId);
    }

    public ArrayList<TaskAssigneeModel> getByAssigneeId(String assigneeId){
        return taskAssigneeRepository.findByAssigneeId(assigneeId);
    }

    public boolean deleteTaskAssignee(String taskAssigneeId){
        try{
            taskAssigneeRepository.deleteById(taskAssigneeId);
            return true;
        }catch(Exception err){
            return false;
        }
    }

}
