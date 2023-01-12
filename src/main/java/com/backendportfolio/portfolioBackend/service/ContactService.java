package com.backendportfolio.portfolioBackend.service;

import com.backendportfolio.portfolioBackend.model.Contact;
import com.backendportfolio.portfolioBackend.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService implements IContactService{
    
    @Autowired
    private ContactRepository contactRepository;

    @Override
    public Contact searchContact(Long id) {
        return contactRepository.findById(id).orElse(null);
    }

    @Override
    public void createContact(Contact bio) {
        contactRepository.save(bio);
    }
}
