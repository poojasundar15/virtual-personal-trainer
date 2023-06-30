package com.hackathon.vit.controller;

import com.hackathon.vit.entity.Exercise;
import com.hackathon.vit.entity.ExerciseLog;
import com.hackathon.vit.service.ExerciseLogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exercise-logs")
public class ExerciseLogController {

    private final ExerciseLogService exerciseLogService;

    public ExerciseLogController(ExerciseLogService exerciseLogService) {
        this.exerciseLogService = exerciseLogService;
    }

    @PostMapping
    public ResponseEntity<ExerciseLog> createExerciseLog(@RequestBody ExerciseLog exerciseLog) {
        ExerciseLog createdExerciseLog = exerciseLogService.createExerciseLog(exerciseLog);
        return ResponseEntity.ok(createdExerciseLog);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExerciseLog> getExerciseLogById(@PathVariable Long id) {
        ExerciseLog exerciseLog = exerciseLogService.getExerciseLogById(id);
        return ResponseEntity.ok(exerciseLog);
    }

    // Other CRUD operations and additional methods

}