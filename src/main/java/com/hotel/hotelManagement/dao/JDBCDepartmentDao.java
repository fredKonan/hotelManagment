package com.hotel.hotelManagement.dao;

import com.hotel.hotelManagement.model.Department;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JDBCDepartmentDao implements DepartmentDao{

    private  final JdbcTemplate jdbcTemplate;

    public JDBCDepartmentDao(DataSource dataSource) {
        this.jdbcTemplate =  new JdbcTemplate(dataSource);
    }

    @Override
    public List<Department> getAllDepartment() {
       List<Department> departmentList = new ArrayList<>();
       String sql = "SELECT * FROM department";
        SqlRowSet rs = jdbcTemplate.queryForRowSet(sql);
        while(rs.next()){
            Department department = rowMap(rs);
            departmentList.add(department);
        }
        return departmentList;
    }

    private Department rowMap(SqlRowSet rs) {
        long id = rs.getLong("department_id");
        String name = rs.getString("name");
        return new Department(id,name);
    }

    @Override
    public Department getDepartmentById(long id) {
        Department department = new Department();
        String sql="SELECT * FROM department WHERE department_id = ?";
        SqlRowSet rs = jdbcTemplate.queryForRowSet(sql,id);
        while(rs.next()){
            department= rowMap(rs);
        }
        return department;
    }

    @Override
    public Department getDepartmentByEmployeeId(long employeeId) {
        Department department = new Department();
        String sql ="SELECT * FROM department WHERE employee_id=?";
        SqlRowSet rs = jdbcTemplate.queryForRowSet(sql,employeeId);
        while(rs.next()){
            department = rowMap(rs);
        }
        return department;
    }

    @Override
    public int addDepartment(Department dto) {
    String sql ="INSERT INTO department(name) VALUES(?) RETURNING department_id";
    return jdbcTemplate.update(sql, Integer.class,dto.getName());
    }

    @Override
    public void deleteDepartment(long departmentId) {
    String sql ="DELETE FROM department WHERE department_id=?";
    jdbcTemplate.update(sql,departmentId);
    }
}
