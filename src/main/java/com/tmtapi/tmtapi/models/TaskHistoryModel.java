package com.tmtapi.tmtapi.models;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table( name = "taskHistories" )
public class TaskHistoryModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long taskHistoryId;
    
    private Long taskId;
    private Date taskHistoryDate;
    private String note;
    
    public Long getTaskHistoryId() {
        return taskHistoryId;
    }

    public void setTaskHistoryId(Long taskHistoryId){
        this.taskHistoryId = taskHistoryId;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId){
        this.taskId = taskId;
    }

    public Date getTaskHistoryDate() {
        return taskHistoryDate;
    }

    public void setTaskHistoryDate(Date taskHistoryDate){
        this.taskHistoryDate = taskHistoryDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note){
        this.note = note;
    }

}