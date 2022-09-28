package com.tmtapi.tmtapi.services;

import java.util.ArrayList;
import java.util.Optional;

import com.tmtapi.tmtapi.models.CustomFieldModel;
import com.tmtapi.tmtapi.repositories.CustomFieldRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomFieldService {
    @Autowired
    CustomFieldRepository customFieldRepository;
    
    public ArrayList<CustomFieldModel> getCustomFields(){
        return (ArrayList<CustomFieldModel>) customFieldRepository.findAll();
    }

    public CustomFieldModel saveCustomField(CustomFieldModel customField){
        return customFieldRepository.save(customField);
    }

    public Optional<CustomFieldModel> getByCustomFieldId(Long customFieldId){
        return customFieldRepository.findById(customFieldId);
    }

    public ArrayList<CustomFieldModel> getByTaskId(Long taskId){
        return customFieldRepository.findByTaskId(taskId);
    }

    public boolean deleteCustomField(Long customFieldId){
        try{
            customFieldRepository.deleteById(customFieldId);
            return true;
        }catch(Exception err){
            return false;
        }
    }

}
