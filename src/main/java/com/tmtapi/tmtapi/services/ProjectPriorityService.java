package com.tmtapi.tmtapi.services;

import java.util.ArrayList;
import java.util.Optional;

import com.tmtapi.tmtapi.models.ProjectPriorityModel;
import com.tmtapi.tmtapi.repositories.ProjectPriorityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectPriorityService {
    @Autowired
    ProjectPriorityRepository projectPriorityRepository;
    
    public ArrayList<ProjectPriorityModel> getProjectPriorities(){
        return (ArrayList<ProjectPriorityModel>) projectPriorityRepository.findAll();
    }

    public ProjectPriorityModel saveProjectPriority(ProjectPriorityModel projectPriority){
        return projectPriorityRepository.save(projectPriority);
    }

    public Optional<ProjectPriorityModel> getByProjectPriorityId(Long projectPriorityId){
        return projectPriorityRepository.findById(projectPriorityId);
    }

    public ArrayList<ProjectPriorityModel> getByName(String name){
        return projectPriorityRepository.findByName(name);
    }

    public boolean deleteProjectPriority(Long projectPriorityId){
        try{
            projectPriorityRepository.deleteById(projectPriorityId);
            return true;
        }catch(Exception err){
            return false;
        }
    }

}
