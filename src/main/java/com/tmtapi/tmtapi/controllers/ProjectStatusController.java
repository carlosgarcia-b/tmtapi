package com.tmtapi.tmtapi.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.tmtapi.tmtapi.models.ProjectStatusModel;
import com.tmtapi.tmtapi.services.ProjectStatusService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/projectStatus")
public class ProjectStatusController {
    @Autowired
    ProjectStatusService projectStatusService;
    
    @GetMapping()
    public ArrayList<ProjectStatusModel> getProjectStatuses(){
        return projectStatusService.getProjectStatuses();
    }

    @GetMapping( path = "/{projectStatusId}")
    public Optional<ProjectStatusModel> getProjectStatusByProjectStatusId(@PathVariable("projectStatusId") Long projectStatusId){
        return this.projectStatusService.getByProjectStatusId(projectStatusId);
    }

    @GetMapping("/query")
    public ArrayList<ProjectStatusModel> getProjectStatusByName(@RequestParam("name") String name){
        return this.projectStatusService.getByName(name);
    }

    @PostMapping()
    public ProjectStatusModel saveProjectStatus(@RequestBody ProjectStatusModel projectStatus){
        return this.projectStatusService.saveProjectStatus(projectStatus);
    }

    @DeleteMapping( path = "/{projectStatusId}")
    public String deleteByProjectStatusId(@PathVariable("projectStatusId") Long projectStatusId){
        boolean ok = this.projectStatusService.deleteProjectStatus(projectStatusId);
        if (ok){
            return "ProjectStatus deleted " + projectStatusId;
        }else{
            return "This projectStatus could not be deleted " + projectStatusId;
        }
    }

}
