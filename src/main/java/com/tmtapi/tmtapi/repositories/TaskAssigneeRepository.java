package com.tmtapi.tmtapi.repositories;

import java.util.ArrayList;

import com.tmtapi.tmtapi.models.TaskAssigneeModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskAssigneeRepository extends CrudRepository<TaskAssigneeModel, String> {
    public abstract ArrayList<TaskAssigneeModel> findByAssigneeId(String assigneeId);
}
