package com.tmtapi.tmtapi.models;

import javax.persistence.*;

@Entity
@Table( name = "projectTaskTypes" )
public class ProjectTaskTypeModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long projectTaskTypeId;
    
    private Long projectId;
    private String name;
    private String color;

    public Long getprojectTaskTypeId() {
        return projectTaskTypeId;
    }

    public void setprojectTaskTypeId(Long projectTaskTypeId){
        this.projectTaskTypeId = projectTaskTypeId;
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