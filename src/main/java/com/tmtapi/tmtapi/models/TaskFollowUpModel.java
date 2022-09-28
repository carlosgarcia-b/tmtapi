package com.tmtapi.tmtapi.models;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table( name = "taskFollowUps" )
public class TaskFollowUpModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long taskFollowUpId;
    
    private Long taskId;
    private Date followUpDate;
    private String managerComment;
    private String assigneesComment;

    public Long getTaskFollowUpId() {
        return taskFollowUpId;
    }

    public void setTaskFollowUpId(Long taskFollowUpId){
        this.taskFollowUpId = taskFollowUpId;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId){
        this.taskId = taskId;
    }

    public Date getFollowUpDate() {
        return followUpDate;
    }

    public void setFollowUpDate(Date followUpDate){
        this.followUpDate = followUpDate;
    }

    public String getManagerComment() {
        return managerComment;
    }

    public void setManagerComment(String managerComment){
        this.managerComment = managerComment;
    }

    public String getAssigneesComment() {
        return assigneesComment;
    }

    public void setAssigneesComment(String assigneesComment){
        this.assigneesComment = assigneesComment;
    }

}