package com.hackathon.vit.service;

import com.hackathon.vit.entity.Exercise;
import com.hackathon.vit.repository.ExerciseRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ExerciseService {

    private final ExerciseRepository exerciseRepository;

    public ExerciseService(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }

    public Exercise createExercise(Exercise exercise) {
        // Perform validation or additional logic if needed
        return exerciseRepository.save(exercise);
    }

    public Exercise getExerciseById(Long id) {
        return exerciseRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Exercise not found"));
    }

    // Other CRUD operations and additional methods

}