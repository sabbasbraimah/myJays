package com.seidu.service;

import com.seidu.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImp implements EmployeeServiceInt{

    private List<Employee>employees = new ArrayList<>();

    @Override
    public List<Employee> createEmployee(Employee employee) {
        employees.add(employee);
        return employees;
    }
}
