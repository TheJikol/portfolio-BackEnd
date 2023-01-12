package com.backendportfolio.portfolioBackend.repository;

import com.backendportfolio.portfolioBackend.model.Biography;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BiographyRepository extends JpaRepository <Biography, Long> {
    
}
