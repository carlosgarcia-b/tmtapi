package com.tmtapi.tmtapi.services;

import java.util.ArrayList;
import java.util.Optional;

import com.tmtapi.tmtapi.models.EmployeeModel;
import com.tmtapi.tmtapi.repositories.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    
    public ArrayList<EmployeeModel> getEmployees(){
        return (ArrayList<EmployeeModel>) employeeRepository.findAll();
    }

    public EmployeeModel saveEmployee(EmployeeModel employee){
        return employeeRepository.save(employee);
    }

    public Optional<EmployeeModel> getByEmployeeId(String employeeId){
        return employeeRepository.findById(employeeId);
    }

    public ArrayList<EmployeeModel> getByName(String name){
        return employeeRepository.findByName(name);
    }

    public boolean deleteEmployee(String employeeId){
        try{
            employeeRepository.deleteById(employeeId);
            return true;
        }catch(Exception err){
            return false;
        }
    }

}
