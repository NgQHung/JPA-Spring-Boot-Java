
package com.example.jpa.controller;

import com.example.jpa.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/users")
public class UserController {

//    @Autowired
//    private UserService userService;
    @Autowired
    JdbcTemplate jdbcTemplate;
    @GetMapping("/employees")
    public List<Employee> getListUser() {
        String sql = "SELECT * FROM Employees";
        return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Employee.class));
    }
}

