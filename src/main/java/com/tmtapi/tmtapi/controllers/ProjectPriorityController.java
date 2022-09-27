package com.tmtapi.tmtapi.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.tmtapi.tmtapi.models.ProjectPriorityModel;
import com.tmtapi.tmtapi.services.ProjectPriorityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/projectPriority")
public class ProjectPriorityController {
    @Autowired
    ProjectPriorityService projectPriorityService;
    
    @GetMapping()
    public ArrayList<ProjectPriorityModel> getProjectPriorities(){
        return projectPriorityService.getProjectPriorities();
    }

    @GetMapping( path = "/{projectPriorityId}")
    public Optional<ProjectPriorityModel> getProjectPriorityByProjectPriorityId(@PathVariable("projectPriorityId") Long projectPriorityId){
        return this.projectPriorityService.getByProjectPriorityId(projectPriorityId);
    }

    @GetMapping("/query")
    public ArrayList<ProjectPriorityModel> getProjectPriorityByName(@RequestParam("name") String name){
        return this.projectPriorityService.getByName(name);
    }

    @PostMapping()
    public ProjectPriorityModel saveProjectPriority(@RequestBody ProjectPriorityModel projectPriority){
        return this.projectPriorityService.saveProjectPriority(projectPriority);
    }

    @DeleteMapping( path = "/{projectPriorityId}")
    public String deleteByProjectPriorityId(@PathVariable("projectPriorityId") Long projectPriorityId){
        boolean ok = this.projectPriorityService.deleteProjectPriority(projectPriorityId);
        if (ok){
            return "ProjectPriority deleted " + projectPriorityId;
        }else{
            return "This projectPriority could not be deleted " + projectPriorityId;
        }
    }

}
