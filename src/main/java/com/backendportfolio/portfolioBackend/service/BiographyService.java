package com.backendportfolio.portfolioBackend.service;

import com.backendportfolio.portfolioBackend.model.Biography;
import com.backendportfolio.portfolioBackend.repository.BiographyRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BiographyService implements IBiographyService{
    
    @Autowired
    public BiographyRepository bioRepository;

    @Override
    public Biography searchBiografia(Long id) {
        return bioRepository.findById(id).orElse(null);
    }

    @Override
    public void createBiography(Biography bio) {
        bioRepository.save(bio);
    }
}
