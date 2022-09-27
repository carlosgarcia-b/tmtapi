package com.tmtapi.tmtapi.services;

import java.util.ArrayList;
import java.util.Optional;

import com.tmtapi.tmtapi.models.ProjectStatusModel;
import com.tmtapi.tmtapi.repositories.ProjectStatusRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectStatusService {
    @Autowired
    ProjectStatusRepository projectStatusRepository;
    
    public ArrayList<ProjectStatusModel> getProjectStatuses(){
        return (ArrayList<ProjectStatusModel>) projectStatusRepository.findAll();
    }

    public ProjectStatusModel saveProjectStatus(ProjectStatusModel projectStatus){
        return projectStatusRepository.save(projectStatus);
    }

    public Optional<ProjectStatusModel> getByProjectStatusId(Long projectStatusId){
        return projectStatusRepository.findById(projectStatusId);
    }

    public ArrayList<ProjectStatusModel> getByName(String name){
        return projectStatusRepository.findByName(name);
    }

    public boolean deleteProjectStatus(Long projectStatusId){
        try{
            projectStatusRepository.deleteById(projectStatusId);
            return true;
        }catch(Exception err){
            return false;
        }
    }

}
