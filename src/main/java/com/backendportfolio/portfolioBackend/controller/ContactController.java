package com.backendportfolio.portfolioBackend.controller;

import com.backendportfolio.portfolioBackend.model.Contact;
import com.backendportfolio.portfolioBackend.service.IContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping ("/api")
public class ContactController {
    
    @Autowired
    private IContactService contactServ;
    
    @GetMapping ("/view/contact/{id}")
    @ResponseBody
    public Contact searchContact(@PathVariable Long id){
        return contactServ.searchContact(id);
    }
    
    @PutMapping ("/edit/contact")
    public void editContact (@RequestBody Contact con){
        contactServ.createContact(con);
    }
}
