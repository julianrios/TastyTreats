package com.julianrios.RecipeApplication.controllers;

import com.julianrios.RecipeApplication.services.RecipeService;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

    private RecipeService service;

    @Autowired
    public RecipeController(RecipeService service) {
        this.service = service;
    }

    @GetMapping()
    public ResponseEntity<Object> extractRecipeFromSite() throws UnirestException {
        return ResponseEntity.ok(service.extractRecipeFromSite());
    }

    @GetMapping("/randomRecipe")
    public ResponseEntity<String> getRandomRecipes() throws UnirestException, IOException {
        return ResponseEntity.ok(service.getRandomRecipe());
    }

}
