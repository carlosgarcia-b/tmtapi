package com.tmtapi.tmtapi.models;

import javax.persistence.*;

@Entity
@Table( name = "projectAssignees" )
public class ProjectAssigneeModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private String projectAssigneeId;
    
    private Long projectId;
    private Long assigneeId;
    private String team;

    public String getProjectAssigneeId() {
        return projectAssigneeId;
    }

    public void setProjectAssigneeId(String projectAssigneeId){
        this.projectAssigneeId = projectAssigneeId;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId){
        this.projectId = projectId;
    }

    public Long getAssigneeId() {
        return assigneeId;
    }

    public void setAssigneeId(Long assigneeId){
        this.assigneeId = assigneeId;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team){
        this.team = team;
    }

}