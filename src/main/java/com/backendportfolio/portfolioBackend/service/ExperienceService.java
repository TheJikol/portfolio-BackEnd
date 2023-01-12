package com.backendportfolio.portfolioBackend.service;

import com.backendportfolio.portfolioBackend.model.Experience;
import com.backendportfolio.portfolioBackend.repository.ExperienceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService implements IExperienceService{
    
    @Autowired
    private ExperienceRepository expRepository;

    @Override
    public List<Experience> viewExperience() {
        return expRepository.findAll();
    }

    @Override
    public void createExperience(Experience exp) {
        expRepository.save(exp);
    }

    @Override
    public void deleteExperience(Long id) {
        expRepository.deleteById(id);
    }

    @Override
    public Experience searchExperience(Long id) {
        return expRepository.findById(id).orElse(null);
    }
}
