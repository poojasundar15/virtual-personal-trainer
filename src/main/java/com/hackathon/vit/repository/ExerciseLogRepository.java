package com.hackathon.vit.repository;

import com.hackathon.vit.entity.ExerciseLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseLogRepository extends JpaRepository<ExerciseLog, Long> {
    // Custom query methods or additional CRUD operations if needed
}
