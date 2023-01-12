package com.backendportfolio.portfolioBackend.repository;

import com.backendportfolio.portfolioBackend.model.ERole;
import com.backendportfolio.portfolioBackend.model.Role;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
    Optional<Role> findByName(ERole name);
}
