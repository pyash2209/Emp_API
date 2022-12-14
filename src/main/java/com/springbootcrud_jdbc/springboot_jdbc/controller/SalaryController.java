package com.springbootcrud_jdbc.springboot_jdbc.controller;

import com.springbootcrud_jdbc.springboot_jdbc.Dao.DAO;
import com.springbootcrud_jdbc.springboot_jdbc.model.Department;
import com.springbootcrud_jdbc.springboot_jdbc.model.Salary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SalaryController {

    @Autowired
    private DAO<Salary,Integer> sDAO;

    @GetMapping("/salaryinfo")
    public List<Salary> getSalaryinfo() {
        return sDAO.getAll();
    }

    @GetMapping("/salaryinfo/{id}")
    public Salary getSalaryById(@PathVariable int id)   {
        return sDAO.getById(id);
    }


    @PostMapping("/salaryinfo")
    public  String saveSalary(@RequestBody Salary salary){
        return sDAO.save(salary)+" No.of rows saved to the database of salaryinfo";

    }

    @PutMapping("/salaryinfo/{id}")
    public String updateSalaryinfo(@RequestBody Salary salary,@PathVariable int id){
        return sDAO.update(salary,id)+" NO.of row update to database of salaryinfo";
    }

    @DeleteMapping("/salaryinfo/{id}")
    public String deleteSalaryinfoById(@PathVariable int id){
        return sDAO.delete(id)+" NO.of row deleted from database salaryinfo";
    }

}
