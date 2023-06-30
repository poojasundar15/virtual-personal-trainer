package com.hackathon.vit.service;

import com.hackathon.vit.entity.Workout;
import com.hackathon.vit.repository.WorkoutRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class WorkoutService {

    private final WorkoutRepository workoutRepository;

    public WorkoutService(WorkoutRepository workoutRepository) {
        this.workoutRepository = workoutRepository;
    }

    public Workout createWorkout(Workout workout) {
        // Perform validation or additional logic if needed
        return workoutRepository.save(workout);
    }

    public Workout getWorkoutById(Long id) {
        return workoutRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Workout not found"));
    }

    // Other CRUD operations and additional methods

}