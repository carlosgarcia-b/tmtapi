package com.tmtapi.tmtapi.repositories;

import java.util.ArrayList;

import com.tmtapi.tmtapi.models.TaskHistoryModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskHistoryRepository extends CrudRepository<TaskHistoryModel, Long> {
    public abstract ArrayList<TaskHistoryModel> findByTaskId(Long taskId);
}
