package com.backendportfolio.portfolioBackend.controller;

import com.backendportfolio.portfolioBackend.model.Biography;
import com.backendportfolio.portfolioBackend.service.IBiographyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "https://jeremiaspalettaportfolio.web.app", maxAge = 3600)
@RestController
@RequestMapping ("/api")
public class BiographyController {
    @Autowired
    private IBiographyService bioServ;
    
    @GetMapping ("/view/biography/{id}")
    @ResponseBody
    public Biography searchBiography(@PathVariable Long id){
        return bioServ.searchBiografia(id);
    }
    
    @PutMapping ("/edit/biography")
    public void editBiography (@RequestBody Biography bio){
        bioServ.createBiography(bio);
    }
}
