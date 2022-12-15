package com.springbootcrud_jdbc.springboot_jdbc.controller;

import com.springbootcrud_jdbc.springboot_jdbc.Dao.DAO;
import com.springbootcrud_jdbc.springboot_jdbc.Service.EmployeeService;
import com.springbootcrud_jdbc.springboot_jdbc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
   private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

        @GetMapping("/employees/{id}")
          public Employee getEmployeeById(@PathVariable int id)   {
            return employeeService.getEmployeeById(id);
        }


        @PostMapping("/employees")
        public  String saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee)+" No.of rows saved to the database";

        }

        @PutMapping ("/employees/{id}")
    public String updateEmployee(@RequestBody Employee employee,@PathVariable int id){
       return employeeService.updateEmployee(employee,id)+" NO.of row update to database";
        }

        @DeleteMapping("/employees/{id}")
    public String deleteEmployeeById(@PathVariable int id){
        return employeeService.deleteEmployeeById(id)+" NO.of row deleted from database";
        }







}
