package io.spring.springdemo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import io.spring.springdemo.entity.Project;

public interface ProjectRepository extends CrudRepository<Project,Long> {
    
    @Override
    public List<Project> findAll();
}
