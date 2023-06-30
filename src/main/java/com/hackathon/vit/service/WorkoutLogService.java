package com.hackathon.vit.service;

import com.hackathon.vit.entity.WorkoutLog;
import com.hackathon.vit.repository.WorkoutLogRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class WorkoutLogService {

    private final WorkoutLogRepository workoutLogRepository;

    public WorkoutLogService(WorkoutLogRepository workoutLogRepository) {
        this.workoutLogRepository = workoutLogRepository;
    }

    public WorkoutLog createWorkoutLog(WorkoutLog workoutLog) {
        // Perform validation or additional logic if needed
        return workoutLogRepository.save(workoutLog);
    }

    public WorkoutLog getWorkoutLogById(Long id) {
        return workoutLogRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Workout Log not found"));
    }

    // Other CRUD operations and additional methods

}
