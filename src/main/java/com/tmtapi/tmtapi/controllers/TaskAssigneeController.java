package com.tmtapi.tmtapi.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.tmtapi.tmtapi.models.TaskAssigneeModel;
import com.tmtapi.tmtapi.services.TaskAssigneeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/taskAssignee")
public class TaskAssigneeController {
    @Autowired
    TaskAssigneeService taskAssigneeService;
    
    @GetMapping()
    public ArrayList<TaskAssigneeModel> getTaskAssignees(){
        return taskAssigneeService.getTaskAssignees();
    }

    @GetMapping( path = "/{taskAssigneeId}")
    public Optional<TaskAssigneeModel> getTaskAssigneeByTaskAssigneeId(@PathVariable("taskAssigneeId") String taskAssigneeId){
        return this.taskAssigneeService.getByTaskAssigneeId(taskAssigneeId);
    }

    @GetMapping("/query")
    public ArrayList<TaskAssigneeModel> getTaskAssigneeByAssigneeId(@RequestParam("assigneeId") String assigneeId){
        return this.taskAssigneeService.getByAssigneeId(assigneeId);
    }

    @PostMapping()
    public TaskAssigneeModel saveTaskAssignee(@RequestBody TaskAssigneeModel taskAssignee){
        return this.taskAssigneeService.saveTaskAssignee(taskAssignee);
    }

    @DeleteMapping( path = "/{taskAssigneeId}")
    public String deleteByTaskAssigneeId(@PathVariable("taskAssigneeId") String taskAssigneeId){
        boolean ok = this.taskAssigneeService.deleteTaskAssignee(taskAssigneeId);
        if (ok){
            return "TaskAssignee deleted " + taskAssigneeId;
        }else{
            return "This taskAssignee could not be deleted " + taskAssigneeId;
        }
    }

}
