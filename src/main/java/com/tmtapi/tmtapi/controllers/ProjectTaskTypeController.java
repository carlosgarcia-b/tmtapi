package com.tmtapi.tmtapi.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.tmtapi.tmtapi.models.ProjectTaskTypeModel;
import com.tmtapi.tmtapi.services.ProjectTaskTypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/projectTaskType")
public class ProjectTaskTypeController {
    @Autowired
    ProjectTaskTypeService projectTaskTypeService;
    
    @GetMapping()
    public ArrayList<ProjectTaskTypeModel> getProjectTaskTypes(){
        return projectTaskTypeService.getProjectTaskTypes();
    }

    @GetMapping( path = "/{projectTaskTypeId}")
    public Optional<ProjectTaskTypeModel> getProjectTaskTypeByProjectTaskTypeId(@PathVariable("projectTaskTypeId") Long projectTaskTypeId){
        return this.projectTaskTypeService.getByProjectTaskTypeId(projectTaskTypeId);
    }

    @GetMapping("/query")
    public ArrayList<ProjectTaskTypeModel> getProjectTaskTypeByName(@RequestParam("name") String name){
        return this.projectTaskTypeService.getByName(name);
    }

    @PostMapping()
    public ProjectTaskTypeModel saveProjectTaskType(@RequestBody ProjectTaskTypeModel projectTaskType){
        return this.projectTaskTypeService.saveProjectTaskType(projectTaskType);
    }

    @DeleteMapping( path = "/{projectTaskTypeId}")
    public String deleteByProjectTaskTypeId(@PathVariable("projectTaskTypeId") Long projectTaskTypeId){
        boolean ok = this.projectTaskTypeService.deleteProjectTaskType(projectTaskTypeId);
        if (ok){
            return "ProjectTaskType deleted " + projectTaskTypeId;
        }else{
            return "This projectTaskType could not be deleted " + projectTaskTypeId;
        }
    }

}
