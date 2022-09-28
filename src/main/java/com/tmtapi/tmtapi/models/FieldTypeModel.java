package com.tmtapi.tmtapi.models;

import javax.persistence.*;

@Entity
@Table( name = "fieldTypes" )
public class FieldTypeModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long fieldTypeId;
    
    private String name;
    
    public Long getfieldTypeId() {
        return fieldTypeId;
    }

    public void setfieldTypeId(Long fieldTypeId){
        this.fieldTypeId = fieldTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}