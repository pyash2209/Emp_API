package com.springbootcrud_jdbc.springboot_jdbc.Dao;

import com.springbootcrud_jdbc.springboot_jdbc.model.Department;
import com.springbootcrud_jdbc.springboot_jdbc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepartmeentDAOimp implements DAO<Department,Integer> {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int save(Department department) {
        return jdbcTemplate.update("INSERT INTO dep_data(id,d_id,d_name,years,position) VALUES(?,?,?,?,?)", new Object[] {department.getId(),department.getD_id(),department.getD_name(),department.getYears(),department.getPosition()});
    }

    @Override
    public int update(Department department, Integer id) {
       return jdbcTemplate.update("UPDATE dep_data SET d_id=?,d_name=?,years=?,position=? WHERE id=?", new Object[] { department.getD_id(),department.getD_name(),department.getYears(),department.getPosition(),id});
    }

    @Override
    public int delete(Integer id) {
        return jdbcTemplate.update("DELETE FROM dep_data WHERE id=?",id);
    }

    @Override
    public List<Department> getAll() {

        return jdbcTemplate.query("SELECT * FROM dep_data", new BeanPropertyRowMapper<Department>(Department.class)) ;
    }

    @Override
    public Department getById(Integer id) {
        return jdbcTemplate.queryForObject("SELECT * FROM dep_data  WHERE id=?;",new BeanPropertyRowMapper<Department>(Department.class),id);
    }


}
