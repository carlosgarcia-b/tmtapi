package com.tmtapi.tmtapi.repositories;

import java.util.ArrayList;

import com.tmtapi.tmtapi.models.EmployeeModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeModel, String> {
    public abstract ArrayList<EmployeeModel> findByName(String name);
}
