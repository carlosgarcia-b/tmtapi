package com.tmtapi.tmtapi.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.tmtapi.tmtapi.models.TaskFollowUpModel;
import com.tmtapi.tmtapi.services.TaskFollowUpService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/taskFollowUp")
public class TaskFollowUpController {
    @Autowired
    TaskFollowUpService taskFollowUpService;
    
    @GetMapping()
    public ArrayList<TaskFollowUpModel> getTaskFollowUps(){
        return taskFollowUpService.getTaskFollowUps();
    }

    @GetMapping( path = "/{taskFollowUpId}")
    public Optional<TaskFollowUpModel> getTaskFollowUpByTaskFollowUpId(@PathVariable("taskFollowUpId") Long taskFollowUpId){
        return this.taskFollowUpService.getByTaskFollowUpId(taskFollowUpId);
    }

    @GetMapping("/query")
    public ArrayList<TaskFollowUpModel> getTaskFollowUpByTaskId(@RequestParam("taskId") Long taskId){
        return this.taskFollowUpService.getByTaskId(taskId);
    }

    @PostMapping()
    public TaskFollowUpModel saveTaskFollowUp(@RequestBody TaskFollowUpModel taskFollowUp){
        return this.taskFollowUpService.saveTaskFollowUp(taskFollowUp);
    }

    @DeleteMapping( path = "/{taskFollowUpId}")
    public String deleteByTaskFollowUpId(@PathVariable("taskFollowUpId") Long taskFollowUpId){
        boolean ok = this.taskFollowUpService.deleteTaskFollowUp(taskFollowUpId);
        if (ok){
            return "TaskFollowUp deleted " + taskFollowUpId;
        }else{
            return "This taskFollowUp could not be deleted " + taskFollowUpId;
        }
    }

}
