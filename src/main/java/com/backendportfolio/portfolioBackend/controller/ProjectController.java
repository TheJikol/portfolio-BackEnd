package com.backendportfolio.portfolioBackend.controller;

import com.backendportfolio.portfolioBackend.model.Project;
import com.backendportfolio.portfolioBackend.service.IProjectService;
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
public class ProjectController {
    
    @Autowired
    private IProjectService proServ;
    
    @PostMapping ("/create/project")
    public void createProject(@RequestBody Project pro){
        proServ.createProject(pro);
    }
    
    @GetMapping ("/view/project")
    @ResponseBody
    public List<Project> viewProject(){
        return proServ.viewProject();
    }
    
    @DeleteMapping ("/delete/project/{id}")
    public void deleteProject(@PathVariable Long id){
        proServ.deleteProject(id);
    }
    
    @PutMapping ("/edit/project/{id}")
    public void editProject (@PathVariable Long id,
                             @RequestBody Project pro){
        Project oldPro = proServ.searchProject(id);
        
        oldPro.setLink(pro.getLink());
        oldPro.setImage(pro.getImage());
        oldPro.setContent(pro.getContent());
        
        proServ.createProject(oldPro);
    }
}
