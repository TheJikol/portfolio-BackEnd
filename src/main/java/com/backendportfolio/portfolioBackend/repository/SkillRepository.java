package com.backendportfolio.portfolioBackend.repository;

import com.backendportfolio.portfolioBackend.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SkillRepository extends JpaRepository <Skill, Long> {
    
}
