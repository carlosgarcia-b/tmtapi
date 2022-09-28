package com.tmtapi.tmtapi.repositories;

import java.util.ArrayList;

import com.tmtapi.tmtapi.models.ProjectTaskTypeModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectTaskTypeRepository extends CrudRepository<ProjectTaskTypeModel, Long> {
    public abstract ArrayList<ProjectTaskTypeModel> findByName(String name);
}
