package com.tmtapi.tmtapi.services;

import java.util.ArrayList;
import java.util.Optional;

import com.tmtapi.tmtapi.models.ProjectModel;
import com.tmtapi.tmtapi.repositories.ProjectRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    @Autowired
    ProjectRepository projectRepository;
    
    public ArrayList<ProjectModel> getProjects(){
        return (ArrayList<ProjectModel>) projectRepository.findAll();
    }

    public ProjectModel saveProject(ProjectModel project){
        return projectRepository.save(project);
    }

    public Optional<ProjectModel> getByProjectId(Long projectId){
        return projectRepository.findById(projectId);
    }

    public ArrayList<ProjectModel> getByName(String name){
        return projectRepository.findByName(name);
    }

    public boolean deleteProject(Long projectId){
        try{
            projectRepository.deleteById(projectId);
            return true;
        }catch(Exception err){
            return false;
        }
    }

}
