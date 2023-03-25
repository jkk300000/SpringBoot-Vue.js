package com.shopping.service;

import com.shopping.entity.Employee;
import com.shopping.mapper.EmployeeMapperInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeMapperInterface employeeMapperInterface ;

    public List<Employee> SelectAll(){
        return this.employeeMapperInterface.SelectAll() ;
    }

    
}
