package com.backendportfolio.portfolioBackend.service;

import com.backendportfolio.portfolioBackend.model.Project;
import com.backendportfolio.portfolioBackend.repository.ProjectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService implements IProjectService{
    
    @Autowired
    private ProjectRepository proRepository;

    @Override
    public List<Project> viewProject() {
        return proRepository.findAll();
    }

    @Override
    public void createProject(Project pro) {
        proRepository.save(pro);
    }

    @Override
    public void deleteProject(Long id) {
        proRepository.deleteById(id);
    }

    @Override
    public Project searchProject(Long id) {
        return proRepository.findById(id).orElse(null);
    }
}
