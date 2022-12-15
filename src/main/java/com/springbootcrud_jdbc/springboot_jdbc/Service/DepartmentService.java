package com.springbootcrud_jdbc.springboot_jdbc.Service;

import com.springbootcrud_jdbc.springboot_jdbc.Dao.DAO;
import com.springbootcrud_jdbc.springboot_jdbc.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DAO<Department,Integer> dDAO;

    public List<Department>getDepartment(){
        return dDAO.getAll();

    }

    public Department getDepartmentById(Integer id){
        return  dDAO.getById(id);
    }

    public Integer saveDepartment(Department department){
        return dDAO.save(department);
    }

    public Integer updateDepartment(Department department,Integer id){
        return dDAO.update(department,id);

    }

    public Integer deleteDepartmentById(Integer id){
        return dDAO.delete(id);
    }

}
