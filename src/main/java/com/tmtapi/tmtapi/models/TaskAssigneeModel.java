package com.tmtapi.tmtapi.models;

import javax.persistence.*;

@Entity
@Table( name = "taskAssignees" )
public class TaskAssigneeModel {
    
    @Id
    @Column(unique = true, nullable = false)
    private String taskAssigneeId;
    
    private Long taskId;
    private String assigneeId;
    
    public String gettaskAssigneeId() {
        return taskAssigneeId;
    }

    public void settaskAssigneeId(String taskAssigneeId){
        this.taskAssigneeId = taskAssigneeId;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId){
        this.taskId = taskId;
    }

    public String getAssigneeId() {
        return assigneeId;
    }

    public void setAssigneeId(String assigneeId){
        this.assigneeId = assigneeId;
    }

}