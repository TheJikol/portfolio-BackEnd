package com.backendportfolio.portfolioBackend.service;

import com.backendportfolio.portfolioBackend.model.Skill;
import java.util.List;

public interface ISkillService {
    public List<Skill> viewSkill();
    
    public void createSkill(Skill ski);
    
    public void deleteSkill(Long id);
    
    public Skill searchSkill(Long id);
}
