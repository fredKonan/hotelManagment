package com.hotel.hotelManagement.dao;

import com.hotel.hotelManagement.model.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> getAllEmployee();
    List<Employee>getEmployeeByDepartment();
    Employee getEmployeeBySchedule(String schedule);
    void deleteEmployee(Employee dto);
    Employee addEmployee(Employee newEmployee,String departmentName);
    void raiseEmployee(double raiseAmount);

}
