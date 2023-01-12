package com.backendportfolio.portfolioBackend.service;

import com.backendportfolio.portfolioBackend.model.Experience;
import java.util.List;

public interface IExperienceService {
   
    public List<Experience> viewExperience();
    
    public void createExperience(Experience exp);
    
    public void deleteExperience(Long id);
    
    public Experience searchExperience(Long id);
    
}
