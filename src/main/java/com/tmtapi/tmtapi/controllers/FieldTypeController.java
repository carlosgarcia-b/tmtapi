package com.tmtapi.tmtapi.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.tmtapi.tmtapi.models.FieldTypeModel;
import com.tmtapi.tmtapi.services.FieldTypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fieldType")
public class FieldTypeController {
    @Autowired
    FieldTypeService fieldTypeService;
    
    @GetMapping()
    public ArrayList<FieldTypeModel> getFieldTypes(){
        return fieldTypeService.getFieldTypes();
    }

    @GetMapping( path = "/{fieldTypeId}")
    public Optional<FieldTypeModel> getFieldTypeByFieldTypeId(@PathVariable("fieldTypeId") Long fieldTypeId){
        return this.fieldTypeService.getByFieldTypeId(fieldTypeId);
    }

    @GetMapping("/query")
    public ArrayList<FieldTypeModel> getFieldTypeByName(@RequestParam("name") String name){
        return this.fieldTypeService.getByName(name);
    }

    @PostMapping()
    public FieldTypeModel saveFieldType(@RequestBody FieldTypeModel fieldType){
        return this.fieldTypeService.saveFieldType(fieldType);
    }

    @DeleteMapping( path = "/{fieldTypeId}")
    public String deleteByFieldTypeId(@PathVariable("fieldTypeId") Long fieldTypeId){
        boolean ok = this.fieldTypeService.deleteFieldType(fieldTypeId);
        if (ok){
            return "FieldType deleted " + fieldTypeId;
        }else{
            return "This fieldType could not be deleted " + fieldTypeId;
        }
    }

}
