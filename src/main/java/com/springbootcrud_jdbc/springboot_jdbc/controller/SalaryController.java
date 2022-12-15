package com.springbootcrud_jdbc.springboot_jdbc.controller;

import com.springbootcrud_jdbc.springboot_jdbc.Service.SalaryService;
import com.springbootcrud_jdbc.springboot_jdbc.model.Salary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SalaryController {

    @Autowired
   private SalaryService salaryService;

    @GetMapping("/salaryinfo")
    public List<Salary> getSalaryinfo() {
        return salaryService.getSalaryinfo();
    }

    @GetMapping("/salaryinfo/{id}")
    public Salary getSalaryById(@PathVariable int id)   {
        return salaryService.getSalaryById(id);
    }


    @PostMapping("/salaryinfo")
    public  String saveSalary(@RequestBody Salary salary){
        return salaryService.saveSalary(salary)+" No.of rows saved to the database of salaryinfo";

    }

    @PutMapping("/salaryinfo/{id}")
    public String updateSalaryinfo(@RequestBody Salary salary,@PathVariable int id){
        return salaryService.updateSalaryinfo(salary,id)+" NO.of row update to database of salaryinfo";
    }

    @DeleteMapping("/salaryinfo/{id}")
    public String deleteSalaryinfoById(@PathVariable int id){
        return salaryService.deleteSalaryinfoById(id)+" NO.of row deleted from database salaryinfo";
    }

}
