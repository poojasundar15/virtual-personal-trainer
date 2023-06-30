package com.hackathon.vit.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "exercises")
@Data
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String videoUrl;

    // Constructors, getters, and setters
}