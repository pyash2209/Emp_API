package com.springbootcrud_jdbc.springboot_jdbc.Service;

import com.springbootcrud_jdbc.springboot_jdbc.Dao.DAO;
import com.springbootcrud_jdbc.springboot_jdbc.model.Salary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@Transactional
public class SalaryService {

    @Autowired
    private DAO<Salary,Integer> sDAO;

    public List<Salary> getSalaryinfo(){

        return sDAO.getAll();
    }
    public Salary getSalaryById(Integer id){
        return sDAO.getById(id);
    }
    public  Integer saveSalary(Salary salary){
        return sDAO.save(salary);

    }
    public  Integer updateSalaryinfo(Salary salary,Integer id){
        return sDAO.update(salary,id);
    }

    public Integer deleteSalaryinfoById(Integer id){
        return sDAO.delete(id);
    }
}
