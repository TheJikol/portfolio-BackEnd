package com.backendportfolio.portfolioBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
public class Biography {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    @Size(max = 1000)
    private String content;
    
    public Biography(){
        
    }

    public Biography(Long id, String content) {
        this.id = id;
        this.content = content;
    }
}
