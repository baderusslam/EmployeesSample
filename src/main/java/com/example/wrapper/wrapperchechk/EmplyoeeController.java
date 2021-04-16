package com.example.wrapper.wrapperchechk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmplyoeeController {

    @GetMapping(path = "/emp")
    public Employee getemplpyee(){
        return  new Employee(1,"ahmad");
    }
    @GetMapping(path = "/emps")
    public Employees getemplpyees(){
         Employees employees= new Employees();
         employees.setEmployees(Arrays.asList(new Employee(1,"ahmad")));
        return employees;
    }


}
