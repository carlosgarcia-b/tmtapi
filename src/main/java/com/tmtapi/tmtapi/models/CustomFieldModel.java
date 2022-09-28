package com.tmtapi.tmtapi.models;

import javax.persistence.*;

@Entity
@Table( name = "customFields" )
public class CustomFieldModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long customFieldId;
    
    private Long taskId;
    private Long fieldTypeId;
    private String name;
    private String value;

    public Long getCustomFieldId() {
        return customFieldId;
    }

    public void setCustomFieldId(Long customFieldId){
        this.customFieldId = customFieldId;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId){
        this.taskId = taskId;
    }

    public Long getFieldTypeId() {
        return fieldTypeId;
    }

    public void setFieldTypeId(Long fieldTypeId){
        this.fieldTypeId = fieldTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value){
        this.value = value;
    }

}