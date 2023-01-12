package com.backendportfolio.portfolioBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
public class Project {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String image;
    private String content;
    private String link;
    
    public Project(){
        
    }

    public Project(Long id, String image, String content, String link) {
        this.id = id;
        this.image = image;
        this.content = content;
        this.link = link;
    }
}
