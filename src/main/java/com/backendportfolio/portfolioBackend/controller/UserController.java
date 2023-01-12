package com.backendportfolio.portfolioBackend.controller;

import com.backendportfolio.portfolioBackend.model.User;
import com.backendportfolio.portfolioBackend.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @Autowired
    private IUserService userServ;
    
    @GetMapping ("view/user/{id}")
    @ResponseBody
    public User viewUser(@PathVariable Long id){
        return userServ.searchUser(id);
    }
}
