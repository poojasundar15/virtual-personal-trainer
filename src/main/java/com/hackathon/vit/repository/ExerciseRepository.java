package com.hackathon.vit.repository;

import com.hackathon.vit.entity.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
    // Custom query methods or additional CRUD operations if needed
}
