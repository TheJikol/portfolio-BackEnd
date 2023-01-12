package com.backendportfolio.portfolioBackend.service;

import com.backendportfolio.portfolioBackend.model.Education;
import com.backendportfolio.portfolioBackend.repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationService implements IEducationService{
    
    @Autowired
    private EducationRepository eduRepository;

    @Override
    public List<Education> viewEducation() {
        return eduRepository.findAll();
    }

    @Override
    public void createEducation(Education edu) {
        eduRepository.save(edu);
    }

    @Override
    public void deleteEducation(Long id) {
        eduRepository.deleteById(id);
    }

    @Override
    public Education searchEducation(Long id) {
        return eduRepository.findById(id).orElse(null);
    }
}
