
package com.example.jpa.controller;

import com.example.jpa.model.Employee;
//import com.example.jpa.repository.EmployeeRepository;
import com.example.jpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    // use to create a sql below
//    @Autowired
//    JdbcTemplate jdbcTemplate;
    @Autowired
    EmployeeRepository repo;
    @GetMapping("")
    public List<Employee> getListUser() {
        // use to select all element in the table employees
//        String sql = "SELECT * FROM Employees";
//        return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Employee.class));
        return repo.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Employee> findUserById(@PathVariable("id") Long id){
        return repo.findById(id);
    }
//    @PostMapping("/{id}")
//    public Optional<Employee> updateUserById(@PathVariable("id") Long id){
//        return repo.
//    }
}

