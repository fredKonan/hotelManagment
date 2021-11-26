package com.hotel.hotelManagement.dao;

import com.hotel.hotelManagement.model.Employee;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.util.List;

public class JDBCEmployeeDao implements EmployeeDao{
    private final JdbcTemplate jdbcTemplate;

    public JDBCEmployeeDao(DataSource dataSource) {
        this.jdbcTemplate= new JdbcTemplate(dataSource);
    }


    @Override
    public List<Employee> getAllEmployee() {
        return null;
    }

    @Override
    public List<Employee> getEmployeeByDepartment() {
        return null;
    }

    @Override
    public Employee getEmployeeBySchedule(String schedule) {
        return null;
    }

    @Override
    public void deleteEmployee(Employee dto) {

    }

    @Override
    public Employee addEmployee(Employee newEmployee, String departmentName) {
        return null;
    }

    @Override
    public void raiseEmployee(double raiseAmount) {

    }
}
