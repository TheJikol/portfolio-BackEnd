package com.backendportfolio.portfolioBackend.controller;

import com.backendportfolio.portfolioBackend.model.Education;
import com.backendportfolio.portfolioBackend.service.IEducationService;
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

@CrossOrigin(origins = "https://jeremiaspalettaportfolio.web.app", maxAge = 3600)
@RestController
@RequestMapping ("/api")
public class EducationController {
    
    @Autowired
    private IEducationService eduServ;
    
    @PostMapping ("/create/education")
    public void createEducation(@RequestBody Education edu){
        eduServ.createEducation(edu);
    }
    
    @GetMapping ("/view/education")
    @ResponseBody
    public List<Education> viewEducation(){
        return eduServ.viewEducation();
    }
    
    @DeleteMapping ("/delete/education/{id}")
    public void deleteEducation(@PathVariable Long id){
        eduServ.deleteEducation(id);
    }
    
    @PutMapping ("/edit/education/{id}")
    public void editEducation (@PathVariable Long id,
                               @RequestBody Education edu){
        Education oldEdu = eduServ.searchEducation(id);
        
        oldEdu.setContent(edu.getContent());
        oldEdu.setImage(edu.getImage());
        
        eduServ.createEducation(oldEdu);
    }
}
