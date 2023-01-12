package com.backendportfolio.portfolioBackend.service;

import com.backendportfolio.portfolioBackend.model.Skill;
import com.backendportfolio.portfolioBackend.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService{
    
    @Autowired
    private SkillRepository skiRepository;

    @Override
    public List<Skill> viewSkill() {
        return skiRepository.findAll();
    }

    @Override
    public void createSkill(Skill ski) {
        skiRepository.save(ski);
    }

    @Override
    public void deleteSkill(Long id) {
        skiRepository.deleteById(id);
    }

    @Override
    public Skill searchSkill(Long id) {
        return skiRepository.findById(id).orElse(null);
    }
}
