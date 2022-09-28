package com.tmtapi.tmtapi.repositories;

import java.util.ArrayList;

import com.tmtapi.tmtapi.models.CustomFieldModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomFieldRepository extends CrudRepository<CustomFieldModel, Long> {
    public abstract ArrayList<CustomFieldModel> findByTaskId(Long taskId);
}
