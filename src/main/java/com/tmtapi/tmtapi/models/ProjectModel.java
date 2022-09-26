package com.tmtapi.tmtapi.models;

import javax.persistence.*;

public class ProjectModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int projectId;
    
    private String name;
    private String description;

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId){
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

}
