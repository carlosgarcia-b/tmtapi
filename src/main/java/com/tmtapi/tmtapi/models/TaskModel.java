package com.tmtapi.tmtapi.models;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table( name = "tasks" )
public class TaskModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long taskId;
    
    private Long projectId;
    private Long statusId;
    private Long priorityId;
    private Long taskTypeId;
    private String name;
    private String abbreviatedName;
    private String description;
    private String category;
    private Date creationDate;
    private Date startDate;
    private Date dueDate;
    private String sprint;
    private Long parentTaskId;
    private Long progress;

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId){
        this.taskId = taskId;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId){
        this.projectId = projectId;
    }

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId){
        this.statusId = statusId;
    }

    public Long getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(Long priorityId){
        this.priorityId = priorityId;
    }

    public Long getTaskTypeId() {
        return taskTypeId;
    }

    public void setTaskTypeId(Long taskTypeId){
        this.taskTypeId = taskTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAbbreviatedName() {
        return abbreviatedName;
    }

    public void setAbbreviatedName(String abbreviatedName){
        this.abbreviatedName = abbreviatedName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate){
        this.creationDate = creationDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate){
        this.startDate = startDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate){
        this.dueDate = dueDate;
    }

    public String getSprint() {
        return sprint;
    }

    public void setSprint(String sprint){
        this.sprint = sprint;
    }

    public Long getParentTaskId() {
        return parentTaskId;
    }

    public void setPärentTaskId(Long parentTaskId){
        this.parentTaskId = parentTaskId;
    }

    public Long getProgress() {
        return progress;
    }

    public void setProgress(Long progress){
        this.progress = progress;
    }
}