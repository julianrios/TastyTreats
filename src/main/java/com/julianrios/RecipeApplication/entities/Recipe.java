package com.julianrios.RecipeApplication.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String readyInMinutes;
    private Integer servings;
    private String image;
    private String instructions;

    public Recipe() {
    }

    public Recipe(String title, String readyInMinutes, Integer servings, String image, String instructions) {
        this.title = title;
        this.readyInMinutes = readyInMinutes;
        this.servings = servings;
        this.image = image;
        this.instructions = instructions;
    }
}