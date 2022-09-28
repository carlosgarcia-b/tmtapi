package com.tmtapi.tmtapi.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.tmtapi.tmtapi.models.ProjectAssigneeModel;
import com.tmtapi.tmtapi.services.ProjectAssigneeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/projectAssignee")
public class ProjectAssigneeController {
    @Autowired
    ProjectAssigneeService projectAssigneeService;
    
    @GetMapping()
    public ArrayList<ProjectAssigneeModel> getProjectAssignees(){
        return projectAssigneeService.getProjectAssignees();
    }

    @GetMapping( path = "/{projectAssigneeId}")
    public Optional<ProjectAssigneeModel> getProjectAssigneeByProjectAssigneeId(@PathVariable("projectAssigneeId") String projectAssigneeId){
        return this.projectAssigneeService.getByProjectAssigneeId(projectAssigneeId);
    }

    @GetMapping("/query")
    public ArrayList<ProjectAssigneeModel> getProjectAssigneeByTeam(@RequestParam("team") String team){
        return this.projectAssigneeService.getByTeam(team);
    }

    @PostMapping()
    public ProjectAssigneeModel saveProjectAssignee(@RequestBody ProjectAssigneeModel projectAssignee){
        return this.projectAssigneeService.saveProjectAssignee(projectAssignee);
    }

    @DeleteMapping( path = "/{projectAssigneeId}")
    public String deleteByProjectAssigneeId(@PathVariable("projectAssigneeId") String projectAssigneeId){
        boolean ok = this.projectAssigneeService.deleteProjectAssignee(projectAssigneeId);
        if (ok){
            return "ProjectAssignee deleted " + projectAssigneeId;
        }else{
            return "This projectAssignee could not be deleted " + projectAssigneeId;
        }
    }

}
