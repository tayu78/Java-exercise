package io.spring.springdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.spring.springdemo.dao.ProjectRepository;
import io.spring.springdemo.entity.Project;


@Controller
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    ProjectRepository projeRepo;
    
    // @RequestMapping(value="",method = RequestMethod.GET)
    @GetMapping
    public String displayProjects(Model model) {
        List<Project> projects = projeRepo.findAll();
        model.addAttribute("projectList", projects);
        return "projects/list-project";
    }

    @GetMapping("/new")
    public String displayProjectForm(Model model) {
        model.addAttribute("project", new Project());
        return "projects/new-project";
    }

    @PostMapping("/save")
    public String createProject(Project project) {
        // Project proj1 = new Project("Eating cookie project", "INPROGRESS", "nomnomnom");
        projeRepo.save(project);
        return "redirect:/projects";
    }


}
