package com.hackathon.vit.service;

import com.hackathon.vit.entity.ExerciseLog;
import com.hackathon.vit.repository.ExerciseLogRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ExerciseLogService {

    private final ExerciseLogRepository exerciseLogRepository;

    public ExerciseLogService(ExerciseLogRepository exerciseLogRepository) {
        this.exerciseLogRepository = exerciseLogRepository;
    }

    public ExerciseLog createExerciseLog(ExerciseLog exerciseLog) {
        // Perform validation or additional logic if needed
        return exerciseLogRepository.save(exerciseLog);
    }

    public ExerciseLog getExerciseLogById(Long id) {
        return exerciseLogRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Exercise Log not found"));
    }

    // Other CRUD operations and additional methods

}
