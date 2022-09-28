package com.tmtapi.tmtapi.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.tmtapi.tmtapi.models.TaskHistoryModel;
import com.tmtapi.tmtapi.services.TaskHistoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/taskHistory")
public class TaskHistoryController {
    @Autowired
    TaskHistoryService taskHistoryService;
    
    @GetMapping()
    public ArrayList<TaskHistoryModel> getTaskHistories(){
        return taskHistoryService.getTaskHistories();
    }

    @GetMapping( path = "/{taskHistoryId}")
    public Optional<TaskHistoryModel> getTaskHistoryByTaskHistoryId(@PathVariable("taskHistoryId") Long taskHistoryId){
        return this.taskHistoryService.getByTaskHistoryId(taskHistoryId);
    }

    @GetMapping("/query")
    public ArrayList<TaskHistoryModel> getTaskHistoryByTaskId(@RequestParam("taskId") Long taskId){
        return this.taskHistoryService.getByTaskId(taskId);
    }

    @PostMapping()
    public TaskHistoryModel saveTaskHistory(@RequestBody TaskHistoryModel taskHistory){
        return this.taskHistoryService.saveTaskHistory(taskHistory);
    }

    @DeleteMapping( path = "/{taskHistoryId}")
    public String deleteByTaskHistoryId(@PathVariable("taskHistoryId") Long taskHistoryId){
        boolean ok = this.taskHistoryService.deleteTaskHistory(taskHistoryId);
        if (ok){
            return "TaskHistory deleted " + taskHistoryId;
        }else{
            return "This taskHistory could not be deleted " + taskHistoryId;
        }
    }

}
