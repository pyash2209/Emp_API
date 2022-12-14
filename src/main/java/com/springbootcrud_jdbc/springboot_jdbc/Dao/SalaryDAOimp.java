package com.springbootcrud_jdbc.springboot_jdbc.Dao;

import com.springbootcrud_jdbc.springboot_jdbc.model.Salary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SalaryDAOimp implements DAO<Salary,Integer> {

    @Autowired
    JdbcTemplate jdbcTemplate;


    @Override
    public int save(Salary salary) {
        return jdbcTemplate.update("INSERT INTO salary_info (id,joining_salary,curr_salary) VALUES(?,?,?)",new Object[]{salary.getId(),salary.getJoining_salary(),salary.getCurr_salary()}) ;
    }

    @Override
    public int update(Salary salary, Integer id) {
        return jdbcTemplate.update("UPDATE salary_info SET joining_salary=?,curr_salary=? WHERE id=?;", new Object[]{salary.getJoining_salary(),salary.getCurr_salary(),id});
    }

    @Override
    public int delete(Integer id) {
        return jdbcTemplate.update("DELETE FROM salary_info WHERE id=?",id);
    }

    @Override
    public List<Salary> getAll() {
        return jdbcTemplate.query("SELECT* FROM salary_info",new BeanPropertyRowMapper<Salary>(Salary.class));
    }

    @Override
    public Salary getById(Integer id) {
        return jdbcTemplate.queryForObject("SELECT * FROM salary_info WHERE id=?;", new BeanPropertyRowMapper<Salary>(Salary.class),id);
    }
}