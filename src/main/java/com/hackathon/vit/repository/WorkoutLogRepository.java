package com.hackathon.vit.repository;

import com.hackathon.vit.entity.WorkoutLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkoutLogRepository extends JpaRepository<WorkoutLog, Long> {
    // Custom query methods or additional CRUD operations if needed
}
