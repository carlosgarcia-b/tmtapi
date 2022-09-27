package com.tmtapi.tmtapi.repositories;

import java.util.ArrayList;

import com.tmtapi.tmtapi.models.ProjectPriorityModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectPriorityRepository extends CrudRepository<ProjectPriorityModel, Long> {
    public abstract ArrayList<ProjectPriorityModel> findByName(String name);
}
