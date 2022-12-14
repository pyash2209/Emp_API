package com.springbootcrud_jdbc.springboot_jdbc.controller;


import com.springbootcrud_jdbc.springboot_jdbc.Dao.DAO;
import com.springbootcrud_jdbc.springboot_jdbc.model.Department;
import com.springbootcrud_jdbc.springboot_jdbc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
private DAO<Department,Integer> dDAO;

    @GetMapping("/department")
    public List<Department> getDepartment() {
        return dDAO.getAll();
    }

    @GetMapping("/department/{id}")
    public Department getDepartmentById(@PathVariable int id)   {
        return dDAO.getById(id);
    }


    @PostMapping("/department")
    public  String saveDepartment(@RequestBody Department department){
        return dDAO.save(department)+" No.of rows saved to the database of department";

    }

    @PutMapping ("/department/{id}")
    public String updateDepartment(@RequestBody Department department,@PathVariable int id){
        return dDAO.update(department,id)+" NO.of row update to database of department";
    }

    @DeleteMapping("/department/{id}")
    public String deleteDepartmentById(@PathVariable int id){
        return dDAO.delete(id)+" NO.of row deleted from database department";
    }



}
