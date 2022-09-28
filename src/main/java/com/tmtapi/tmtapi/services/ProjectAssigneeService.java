package com.tmtapi.tmtapi.services;

import java.util.ArrayList;
import java.util.Optional;

import com.tmtapi.tmtapi.models.ProjectAssigneeModel;
import com.tmtapi.tmtapi.repositories.ProjectAssigneeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectAssigneeService {
    @Autowired
    ProjectAssigneeRepository projectAssigneeRepository;
    
    public ArrayList<ProjectAssigneeModel> getProjectAssignees(){
        return (ArrayList<ProjectAssigneeModel>) projectAssigneeRepository.findAll();
    }

    public ProjectAssigneeModel saveProjectAssignee(ProjectAssigneeModel projectAssignee){
        return projectAssigneeRepository.save(projectAssignee);
    }

    public Optional<ProjectAssigneeModel> getByProjectAssigneeId(String projectAssigneeId){
        return projectAssigneeRepository.findById(projectAssigneeId);
    }

    public ArrayList<ProjectAssigneeModel> getByTeam(String team){
        return projectAssigneeRepository.findByTeam(team);
    }

    public boolean deleteProjectAssignee(String projectAssigneeId){
        try{
            projectAssigneeRepository.deleteById(projectAssigneeId);
            return true;
        }catch(Exception err){
            return false;
        }
    }

}
