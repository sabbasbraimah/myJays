package com.seidu;

import com.seidu.model.Employee;
import com.seidu.service.EmployeeServiceImp;
import com.seidu.service.EmployeeServiceInt;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpTest {
    private EmployeeServiceInt employeeServiceInt;

    @Test
    public void createEmployee(){

        Employee employee = new Employee("Jakes");
        List<Employee> expectedEmployees = new ArrayList<>();
        expectedEmployees.add(employee);
        employeeServiceInt = new EmployeeServiceImp();
        List<Employee> actualEmployee = employeeServiceInt.createEmployee(employee);
        assertEquals(expectedEmployees,actualEmployee);
    }
}
