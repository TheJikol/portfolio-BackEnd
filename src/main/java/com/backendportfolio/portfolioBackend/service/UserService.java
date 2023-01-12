package com.backendportfolio.portfolioBackend.service;

import com.backendportfolio.portfolioBackend.model.User;
import com.backendportfolio.portfolioBackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public User searchUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
