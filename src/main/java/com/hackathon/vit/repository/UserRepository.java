package com.hackathon.vit.repository;

import com.hackathon.vit.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Custom query methods or additional CRUD operations if needed
}