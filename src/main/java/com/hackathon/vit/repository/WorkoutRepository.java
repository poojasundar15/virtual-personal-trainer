package com.hackathon.vit.repository;

import com.hackathon.vit.entity.Workout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkoutRepository extends JpaRepository<Workout, Long> {
    // Custom query methods or additional CRUD operations if needed
}