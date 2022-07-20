package io.spring.springdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import io.spring.springdemo.dao.EmployeeRepository;
import io.spring.springdemo.entity.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    EmployeeRepository empRepo;

    @GetMapping
    public String displayEmployee(Model model) {
        List<Employee> employees = empRepo.findAll();
        model.addAttribute("employeeList", employees);
        return "employees/list-employees";
    }
    @GetMapping("/new")
    public String displayEmployeeForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "employees/new-employee";
    }

    @PostMapping("/save")
    public String createEmployee(Employee employee) {
        empRepo.save(employee);
        return "redirect:/employees";
    }
}
