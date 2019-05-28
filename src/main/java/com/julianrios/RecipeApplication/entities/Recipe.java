package com.julianrios.RecipeApplication.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Recipe {

    @Id
    @Column(name= "recipe_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String readyInMinutes;
    private Integer servings;
    private String image;
    private String instructions;

    @Column(name = "profile_id")
    private Integer profile_id;

//    @ManyToOne(fetch = FetchType.LAZY)
//    private RecipeBook recipeBook;

    public Recipe() {
    }

    public Recipe(String title, String readyInMinutes, Integer servings, String image, String instructions, Integer profile_id) {
        this.title = title;
        this.readyInMinutes = readyInMinutes;
        this.servings = servings;
        this.image = image;
        this.instructions = instructions;
        this.profile_id = profile_id;
    }
}
