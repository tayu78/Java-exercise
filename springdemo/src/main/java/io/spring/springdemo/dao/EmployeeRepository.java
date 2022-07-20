package io.spring.springdemo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import io.spring.springdemo.entity.Employee;


public interface EmployeeRepository extends CrudRepository<Employee,Long> {
    
    @Override
    public List<Employee> findAll();
}
