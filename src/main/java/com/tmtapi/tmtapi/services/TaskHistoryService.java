package com.tmtapi.tmtapi.services;

import java.util.ArrayList;
import java.util.Optional;

import com.tmtapi.tmtapi.models.TaskHistoryModel;
import com.tmtapi.tmtapi.repositories.TaskHistoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskHistoryService {
    @Autowired
    TaskHistoryRepository taskHistoryRepository;
    
    public ArrayList<TaskHistoryModel> getTaskHistories(){
        return (ArrayList<TaskHistoryModel>) taskHistoryRepository.findAll();
    }

    public TaskHistoryModel saveTaskHistory(TaskHistoryModel taskHistory){
        return taskHistoryRepository.save(taskHistory);
    }

    public Optional<TaskHistoryModel> getByTaskHistoryId(Long taskHistoryId){
        return taskHistoryRepository.findById(taskHistoryId);
    }

    public ArrayList<TaskHistoryModel> getByTaskId(Long taskId){
        return taskHistoryRepository.findByTaskId(taskId);
    }

    public boolean deleteTaskHistory(Long taskHistoryId){
        try{
            taskHistoryRepository.deleteById(taskHistoryId);
            return true;
        }catch(Exception err){
            return false;
        }
    }

}
