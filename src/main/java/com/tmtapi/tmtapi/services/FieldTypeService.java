package com.tmtapi.tmtapi.services;

import java.util.ArrayList;
import java.util.Optional;

import com.tmtapi.tmtapi.models.FieldTypeModel;
import com.tmtapi.tmtapi.repositories.FieldTypeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FieldTypeService {
    @Autowired
    FieldTypeRepository fieldTypeRepository;
    
    public ArrayList<FieldTypeModel> getFieldTypes(){
        return (ArrayList<FieldTypeModel>) fieldTypeRepository.findAll();
    }

    public FieldTypeModel saveFieldType(FieldTypeModel fieldType){
        return fieldTypeRepository.save(fieldType);
    }

    public Optional<FieldTypeModel> getByFieldTypeId(Long fieldTypeId){
        return fieldTypeRepository.findById(fieldTypeId);
    }

    public ArrayList<FieldTypeModel> getByName(String name){
        return fieldTypeRepository.findByName(name);
    }

    public boolean deleteFieldType(Long fieldTypeId){
        try{
            fieldTypeRepository.deleteById(fieldTypeId);
            return true;
        }catch(Exception err){
            return false;
        }
    }

}
