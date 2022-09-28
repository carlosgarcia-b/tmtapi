package com.tmtapi.tmtapi.models;

import javax.persistence.*;

@Entity
@Table( name = "projectAssignees" )
public class ProjectAssigneeModel {
    
    @Id
    @Column(unique = true, nullable = false)
    private String projectAssigneeId;
    
    private Long projectId;
    private String assigneeId;
    private String team;

    public String getprojectAssigneeId() {
        return projectAssigneeId;
    }

    public void setprojectAssigneeId(String projectAssigneeId){
        this.projectAssigneeId = projectAssigneeId;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId){
        this.projectId = projectId;
    }

    public String getAssigneeId() {
        return assigneeId;
    }

    public void setAssigneeId(String assigneeId){
        this.assigneeId = assigneeId;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team){
        this.team = team;
    }

}