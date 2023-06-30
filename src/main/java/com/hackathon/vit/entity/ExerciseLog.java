package com.hackathon.vit.entity;

import lombok.Data;

import javax.persistence.*;
@Entity
@Data
@Table(name = "exercise_logs")
public class ExerciseLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "exercise_id")
    private Exercise exercise;

    private int sets;
    private int reps;
    private double weight;
    private int duration;

    // Constructors, getters, and setters
}