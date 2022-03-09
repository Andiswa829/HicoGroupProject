package com.andiswa.app.rest.Controller;

import com.andiswa.app.rest.Models.Employee;
import com.andiswa.app.rest.Repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @GetMapping(value="/")
    public String getPage(){
        return "Welcome ";
    }

    @GetMapping(value = "/employees")
    public List<Employee> getEmployees(){
        return employeeRepo.findAll();
    }

    @PostMapping(value = "/save")
    public String saveEmployee(Employee employee){
        employeeRepo.save(employee);
        return "Saved gain.";
    }
}
