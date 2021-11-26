package com.hotel.hotelManagement.dao;

import com.hotel.hotelManagement.model.Department;

import java.util.List;

public interface DepartmentDao {
    List<Department> getAllDepartment();
    Department getDepartmentById(long id);
    Department getDepartmentByEmployeeId(long employeeId);
    int addDepartment(Department dto);
    void deleteDepartment(long departmentId);
}
