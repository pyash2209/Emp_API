package com.springbootcrud_jdbc.springboot_jdbc.controller;

import com.springbootcrud_jdbc.springboot_jdbc.Dao.DAO;
import com.springbootcrud_jdbc.springboot_jdbc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private DAO<Employee,Integer> eDAO;

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return eDAO.getAll();
    }

        @GetMapping("/employees/{id}")
          public Employee getEmployeeById(@PathVariable int id)   {
            return eDAO.getById(id);
        }


        @PostMapping("/employees")
        public  String saveEmployee(@RequestBody Employee employee){
        return eDAO.save(employee)+" No.of rows saved to the database";

        }

        @PutMapping ("/employees/{id}")
    public String updateEmployee(@RequestBody Employee employee,@PathVariable int id){
       return eDAO.update(employee,id)+" NO.of row update to database";
        }

        @DeleteMapping("/employees/{id}")
    public String deleteEmployeeById(@PathVariable int id){
        return eDAO.delete(id)+" NO.of row deleted from database";
        }







}
