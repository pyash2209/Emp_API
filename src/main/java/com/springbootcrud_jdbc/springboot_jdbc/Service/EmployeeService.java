package com.springbootcrud_jdbc.springboot_jdbc.Service;

import com.springbootcrud_jdbc.springboot_jdbc.Dao.DAO;
import com.springbootcrud_jdbc.springboot_jdbc.model.Employee;
import com.springbootcrud_jdbc.springboot_jdbc.model.Salary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService {

@Autowired
    private DAO<Employee,Integer> eDAO;

    public List<Employee> getEmployees(){

        return eDAO.getAll();
    }
    public Employee getEmployeeById(Integer id){
        return eDAO.getById(id);
    }
    public  Integer saveEmployee(Employee employee){
        return eDAO.save(employee);

    }
    public  Integer updateEmployee(Employee employee,Integer id){
        return eDAO.update(employee,id);

    }

    public  Integer deleteEmployeeById(Integer id){
        return eDAO.delete(id);

    }

}
