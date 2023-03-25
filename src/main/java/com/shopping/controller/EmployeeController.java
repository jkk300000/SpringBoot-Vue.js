package com.shopping.controller;

import com.shopping.entity.Employee;
import com.shopping.service.EmployeeService;
import lombok.RequiredArgsConstructor;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController{
    private final EmployeeService employeeService ;

    // RowBounds 공부 요망
    
    @GetMapping(value = {"/list"})
    public List<Employee> employeeList(){ // 게시물 목록 보기
        
        
        return employeeService.SelectAll();
        
    }

    
}




