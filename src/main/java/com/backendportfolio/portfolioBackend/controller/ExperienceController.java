package com.backendportfolio.portfolioBackend.controller;

import com.backendportfolio.portfolioBackend.model.Experience;
import com.backendportfolio.portfolioBackend.service.IExperienceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping ("/api")
public class ExperienceController {
    
    @Autowired
    private IExperienceService expServ;
    
    @PostMapping ("/create/experience")
    public void createExperience(@RequestBody Experience exp){
        expServ.createExperience(exp);
    }
    
    @GetMapping ("/view/experience")
    @ResponseBody
    public List<Experience> viewExperience(){
        return expServ.viewExperience();
    }
    
    @DeleteMapping("/delete/experience/{id}")
    public void deleteExperience(@PathVariable Long id){
        expServ.deleteExperience(id);
    }
    
    @PutMapping ("/edit/experience/{id}")
    public void editExperience (@PathVariable Long id,
                                @RequestBody Experience exp){
        Experience oldExp = expServ.searchExperience(id);
        
        oldExp.setImage(exp.getImage());
        oldExp.setContent(exp.getContent());
        
        expServ.createExperience(oldExp);
    }
}
