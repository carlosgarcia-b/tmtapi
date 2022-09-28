package com.tmtapi.tmtapi.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.tmtapi.tmtapi.models.TaskModel;
import com.tmtapi.tmtapi.services.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    TaskService taskService;
    
    @GetMapping()
    public ArrayList<TaskModel> getTasks(){
        return taskService.getTasks();
    }

    @GetMapping( path = "/{taskId}")
    public Optional<TaskModel> getTaskByTaskId(@PathVariable("taskId") Long taskId){
        return this.taskService.getByTaskId(taskId);
    }

    @GetMapping("/query")
    public ArrayList<TaskModel> getTaskByName(@RequestParam("name") String name){
        return this.taskService.getByName(name);
    }

    @PostMapping()
    public TaskModel saveTask(@RequestBody TaskModel task){
        return this.taskService.saveTask(task);
    }

    @DeleteMapping( path = "/{taskId}")
    public String deleteByTaskId(@PathVariable("taskId") Long taskId){
        boolean ok = this.taskService.deleteTask(taskId);
        if (ok){
            return "Task deleted " + taskId;
        }else{
            return "This task could not be deleted " + taskId;
        }
    }

}
