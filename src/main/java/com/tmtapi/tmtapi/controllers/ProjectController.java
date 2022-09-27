package com.tmtapi.tmtapi.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.tmtapi.tmtapi.models.ProjectModel;
import com.tmtapi.tmtapi.services.ProjectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.bind.annotation.*;

@RestController
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    ProjectService projectService;
    
    @GetMapping()
    public ArrayList<ProjectModel> getProjects(){
        return projectService.getProjects();
    }

    @GetMapping( path = "/{projectId}")
    public Optional<ProjectModel> getProjectByProjectId(@PathVariable("projectId") Long projectId){
        return this.projectService.getByProjectId(projectId);
    }

    @GetMapping("/query")
    public ArrayList<ProjectModel> getProjectByName(@RequestParam("name") String name){
        return this.projectService.getByName(name);
    }

    @PostMapping()
    public ProjectModel saveProject(@RequestBody ProjectModel project){
        return this.projectService.saveProject(project);
    }

    @DeleteMapping( path = "/{projectId}")
    public String deleteByProjectId(@PathVariable("projectId") Long projectId){
        boolean ok = this.projectService.deleteProject(projectId);
        if (ok){
            return "Project deleted " + projectId;
        }else{
            return "This project could not be deleted " + projectId;
        }
    }

}