package io.spring.springdemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long projectId;
    private String name;
    private String stage;
    private String description;

    public Project(){

    }

    public Project( String name, String stage, String description) {
        this.name = name;
        this.stage = stage;
        this.description = description;
    }

    // public long getProjectId() {
    //     return projectId;
    // }

    public String getName() {
        return name;
    }

    public String getStage() {
        return stage;
    }

    public String getDescription() {
        return description;
    }

    // public void setProjectId(long projectId) {
    //     this.projectId = projectId;
    // }

    public void setName(String name) {
        this.name = name;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
}
