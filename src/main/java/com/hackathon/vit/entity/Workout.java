package com.hackathon.vit.entity;


import lombok.Data;

import javax.persistence.*;
@Entity
@Data
@Table(name = "workouts")
public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private int duration;
    private String difficultyLevel;
    private String equipmentNeeded;

    // Constructors, getters, and setters
}