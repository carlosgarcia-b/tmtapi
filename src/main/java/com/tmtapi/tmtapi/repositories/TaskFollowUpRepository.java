package com.tmtapi.tmtapi.repositories;

import java.util.ArrayList;

import com.tmtapi.tmtapi.models.TaskFollowUpModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskFollowUpRepository extends CrudRepository<TaskFollowUpModel, Long> {
    public abstract ArrayList<TaskFollowUpModel> findByTaskId(Long taskId);
}
