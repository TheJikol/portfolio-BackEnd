package com.backendportfolio.portfolioBackend.service;

import com.backendportfolio.portfolioBackend.model.Contact;

public interface IContactService {
    
    public Contact searchContact(Long id);
    
    public void createContact(Contact bio);
}
