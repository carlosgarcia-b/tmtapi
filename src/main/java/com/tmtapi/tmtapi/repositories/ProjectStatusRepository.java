package com.tmtapi.tmtapi.repositories;

import java.util.ArrayList;

import com.tmtapi.tmtapi.models.ProjectStatusModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectStatusRepository extends CrudRepository<ProjectStatusModel, Long> {
    public abstract ArrayList<ProjectStatusModel> findByName(String name);
}
