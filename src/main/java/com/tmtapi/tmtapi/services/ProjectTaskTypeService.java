package com.tmtapi.tmtapi.services;

import java.util.ArrayList;
import java.util.Optional;

import com.tmtapi.tmtapi.models.ProjectTaskTypeModel;
import com.tmtapi.tmtapi.repositories.ProjectTaskTypeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectTaskTypeService {
    @Autowired
    ProjectTaskTypeRepository projectTaskTypeRepository;
    
    public ArrayList<ProjectTaskTypeModel> getProjectTaskTypes(){
        return (ArrayList<ProjectTaskTypeModel>) projectTaskTypeRepository.findAll();
    }

    public ProjectTaskTypeModel saveProjectTaskType(ProjectTaskTypeModel projectTaskType){
        return projectTaskTypeRepository.save(projectTaskType);
    }

    public Optional<ProjectTaskTypeModel> getByProjectTaskTypeId(Long projectTaskTypeId){
        return projectTaskTypeRepository.findById(projectTaskTypeId);
    }

    public ArrayList<ProjectTaskTypeModel> getByName(String name){
        return projectTaskTypeRepository.findByName(name);
    }

    public boolean deleteProjectTaskType(Long projectTaskTypeId){
        try{
            projectTaskTypeRepository.deleteById(projectTaskTypeId);
            return true;
        }catch(Exception err){
            return false;
        }
    }

}
