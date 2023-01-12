package com.backendportfolio.portfolioBackend.repository;

import com.backendportfolio.portfolioBackend.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContactRepository extends JpaRepository <Contact, Long> {
    
}
