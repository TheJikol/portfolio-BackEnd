package com.backendportfolio.portfolioBackend.service;

import com.backendportfolio.portfolioBackend.model.Biography;

public interface IBiographyService {
    
    public Biography searchBiografia(Long id);
    
    public void createBiography(Biography bio);
}
