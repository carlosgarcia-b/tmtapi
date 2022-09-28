package com.tmtapi.tmtapi.services;

import java.util.ArrayList;
import java.util.Optional;

import com.tmtapi.tmtapi.models.TaskModel;
import com.tmtapi.tmtapi.repositories.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    TaskRepository taskRepository;
    
    public ArrayList<TaskModel> getTasks(){
        return (ArrayList<TaskModel>) taskRepository.findAll();
    }

    public TaskModel saveTask(TaskModel task){
        return taskRepository.save(task);
    }

    public Optional<TaskModel> getByTaskId(Long taskId){
        return taskRepository.findById(taskId);
    }

    public ArrayList<TaskModel> getByName(String name){
        return taskRepository.findByName(name);
    }

    public boolean deleteTask(Long taskId){
        try{
            taskRepository.deleteById(taskId);
            return true;
        }catch(Exception err){
            return false;
        }
    }

}
