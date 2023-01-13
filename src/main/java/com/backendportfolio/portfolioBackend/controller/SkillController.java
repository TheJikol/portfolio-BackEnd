package com.backendportfolio.portfolioBackend.controller;

import com.backendportfolio.portfolioBackend.model.Skill;
import com.backendportfolio.portfolioBackend.service.ISkillService;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "https://jeremiaspalettaportfolio.web.app", maxAge = 3600)
@RestController
@RequestMapping ("/api")
public class SkillController {
    
    @Autowired
    private ISkillService skiServ;
    
    @PostMapping ("/create/skill")
    public void createSkill(@RequestBody Skill ski){
        skiServ.createSkill(ski);
    }
    
    @GetMapping ("/view/skill")
    @ResponseBody
    public List<Skill> viewSkill(){
        return skiServ.viewSkill();
    }
    
    @DeleteMapping ("/delete/skill/{id}")
    public void deleteSkill(@PathVariable Long id){
        skiServ.deleteSkill(id);
    }
    
    @PutMapping ("/edit/skill/{id}")
    public void editSkill(@PathVariable Long id,
                          @RequestBody Skill ski){
        Skill oldSki = skiServ.searchSkill(id);
        
        oldSki.setImage(ski.getImage());
        oldSki.setPercent(ski.getPercent());
        
        skiServ.createSkill(oldSki);
    }
}
