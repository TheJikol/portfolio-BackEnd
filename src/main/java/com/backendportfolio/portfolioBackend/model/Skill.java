package com.backendportfolio.portfolioBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skill {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String image;
    private int percent;
    
    public Skill(){
        
    }

    public Skill(Long id, String image, int percent) {
        this.id = id;
        this.image = image;
        this.percent = percent;
    }
}
