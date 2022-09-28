package com.tmtapi.tmtapi.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.tmtapi.tmtapi.models.EmployeeModel;
import com.tmtapi.tmtapi.services.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    
    @GetMapping()
    public ArrayList<EmployeeModel> getEmployees(){
        return employeeService.getEmployees();
    }

    @GetMapping( path = "/{employeeId}")
    public Optional<EmployeeModel> getEmployeeByEmployeeId(@PathVariable("employeeId") String employeeId){
        return this.employeeService.getByEmployeeId(employeeId);
    }

    @GetMapping("/query")
    public ArrayList<EmployeeModel> getEmployeeByName(@RequestParam("name") String name){
        return this.employeeService.getByName(name);
    }

    @PostMapping()
    public EmployeeModel saveEmployee(@RequestBody EmployeeModel employee){
        return this.employeeService.saveEmployee(employee);
    }

    @DeleteMapping( path = "/{employeeId}")
    public String deleteByEmployeeId(@PathVariable("employeeId") String employeeId){
        boolean ok = this.employeeService.deleteEmployee(employeeId);
        if (ok){
            return "Employee deleted " + employeeId;
        }else{
            return "This employee could not be deleted " + employeeId;
        }
    }

}
