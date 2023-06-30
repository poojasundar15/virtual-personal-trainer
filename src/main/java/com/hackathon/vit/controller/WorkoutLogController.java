package com.hackathon.vit.controller;

import com.hackathon.vit.entity.ExerciseLog;
import com.hackathon.vit.entity.WorkoutLog;
import com.hackathon.vit.service.WorkoutLogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/workout-logs")
public class WorkoutLogController {

    private final WorkoutLogService workoutLogService;

    public WorkoutLogController(WorkoutLogService workoutLogService) {
        this.workoutLogService = workoutLogService;
    }

    @PostMapping
    public ResponseEntity<WorkoutLog> createWorkoutLog(@RequestBody WorkoutLog workoutLog) {
        WorkoutLog createdWorkoutLog = workoutLogService.createWorkoutLog(workoutLog);
        return ResponseEntity.ok(createdWorkoutLog);
    }

    @GetMapping("/{id}")
    public ResponseEntity<WorkoutLog> getWorkoutLogById(@PathVariable Long id) {
        WorkoutLog workoutLog = workoutLogService.getWorkoutLogById(id);
        return ResponseEntity.ok(workoutLog);
    }

    // Other CRUD operations and additional methods

}
