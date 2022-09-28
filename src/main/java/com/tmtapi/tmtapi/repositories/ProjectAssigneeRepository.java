package com.tmtapi.tmtapi.repositories;

import java.util.ArrayList;

import com.tmtapi.tmtapi.models.ProjectAssigneeModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectAssigneeRepository extends CrudRepository<ProjectAssigneeModel, String> {
    public abstract ArrayList<ProjectAssigneeModel> findByTeam(String team);
}
