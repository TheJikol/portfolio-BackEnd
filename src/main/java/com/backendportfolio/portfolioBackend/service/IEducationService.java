package com.backendportfolio.portfolioBackend.service;

import com.backendportfolio.portfolioBackend.model.Education;
import java.util.List;

public interface IEducationService {
    
    public List<Education> viewEducation();
    
    public void createEducation(Education edu);
    
    public void deleteEducation(Long id);
    
    public Education searchEducation(Long id);
    
}
