package com.tmtapi.tmtapi.models;

import javax.persistence.*;

@Entity
@Table( name = "projectStatuses" )
public class ProjectStatusModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long projectStatusId;
    
    private Long projectId;
    private String name;
    private String color;

    public Long getProjectStatusId() {
        return projectStatusId;
    }

    public void setProjectStatusId(Long projectStatusId){
        this.projectStatusId = projectStatusId;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId){
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

}