package com.springbootcrud_jdbc.springboot_jdbc.Dao;


import com.springbootcrud_jdbc.springboot_jdbc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.util.List;

@Repository
public class EmployeeDAOimp implements EmployeeDAO{

    @Autowired
  JdbcTemplate jdbcTemplate;
    @Override
    public int save(Employee employee) {
        return jdbcTemplate.update("INSERT INTO Emp_data(name,email,department) VALUES(?,?,?)", new Object[]{employee.getName(),employee.getEmail(),employee.getDepartment()});
    }

    @Override
    public int update(Employee employee, int id) {
        return jdbcTemplate.update("UPDATE Emp_data SET name=?,email=?,department=? WHERE id=?", new Object[] {employee.getName(),employee.getEmail(),employee.getDepartment(),id});
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update("DELETE FROM Emp_data WHERE id=?",id);
    }

    @Override
    public List<Employee> getAll() {

        return jdbcTemplate.query("SELECT * FROM Emp_data", new BeanPropertyRowMapper<Employee>(Employee.class)) ;
    }

    @Override
    public Employee getById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM emp_data  WHERE id=?;",new BeanPropertyRowMapper<Employee>(Employee.class),id);
    }
}
