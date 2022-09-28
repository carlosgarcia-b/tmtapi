package com.tmtapi.tmtapi.repositories;

import java.util.ArrayList;

import com.tmtapi.tmtapi.models.FieldTypeModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FieldTypeRepository extends CrudRepository<FieldTypeModel, Long> {
    public abstract ArrayList<FieldTypeModel> findByName(String name);
}
