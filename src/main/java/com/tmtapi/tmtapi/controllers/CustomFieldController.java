package com.tmtapi.tmtapi.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.tmtapi.tmtapi.models.CustomFieldModel;
import com.tmtapi.tmtapi.services.CustomFieldService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customField")
public class CustomFieldController {
    @Autowired
    CustomFieldService customFieldService;
    
    @GetMapping()
    public ArrayList<CustomFieldModel> getCustomFields(){
        return customFieldService.getCustomFields();
    }

    @GetMapping( path = "/{customFieldId}")
    public Optional<CustomFieldModel> getCustomFieldByCustomFieldId(@PathVariable("customFieldId") Long customFieldId){
        return this.customFieldService.getByCustomFieldId(customFieldId);
    }

    @GetMapping("/query")
    public ArrayList<CustomFieldModel> getCustomFieldByTaskId(@RequestParam("taskId") Long taskId){
        return this.customFieldService.getByTaskId(taskId);
    }

    @PostMapping()
    public CustomFieldModel saveCustomField(@RequestBody CustomFieldModel customField){
        return this.customFieldService.saveCustomField(customField);
    }

    @DeleteMapping( path = "/{customFieldId}")
    public String deleteByCustomFieldId(@PathVariable("customFieldId") Long customFieldId){
        boolean ok = this.customFieldService.deleteCustomField(customFieldId);
        if (ok){
            return "CustomField deleted " + customFieldId;
        }else{
            return "This customField could not be deleted " + customFieldId;
        }
    }

}
