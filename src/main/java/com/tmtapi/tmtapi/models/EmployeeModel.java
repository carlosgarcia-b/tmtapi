package com.tmtapi.tmtapi.models;

import javax.persistence.*;

@Entity
@Table( name = "employees" )
public class EmployeeModel {
    
    @Id
    @Column(unique = true, nullable = false)
    private String employeeId;
    
    private String name;
    private String knCode;
    private String email;

    public String getemployeeId() {
        return employeeId;
    }

    public void setemployeeId(String employeeId){
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getKNCode() {
        return knCode;
    }
    
    public void setKNCode(String knCode){
        this.knCode = knCode;
    }

    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
}