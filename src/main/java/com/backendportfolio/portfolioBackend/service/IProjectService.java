package com.backendportfolio.portfolioBackend.service;

import com.backendportfolio.portfolioBackend.model.Project;
import java.util.List;

public interface IProjectService {
    
    public List<Project> viewProject();
    
    public void createProject(Project pro);
    
    public void deleteProject(Long id);
    
    public Project searchProject(Long id);
    
}
