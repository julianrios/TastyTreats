package com.julianrios.RecipeApplication.controllers;

import com.julianrios.RecipeApplication.entities.Recipe;
import com.julianrios.RecipeApplication.services.RecipeService;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recipes")
@CrossOrigin("*")
public class RecipeController {

    private RecipeService service;

    @Autowired
    public RecipeController(RecipeService service) {
        this.service = service;
    }


    @PostMapping()
    public ResponseEntity<Recipe> createRecipe(@RequestBody Recipe recipe) {
        return new ResponseEntity<>(service.createRecipe(recipe), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Recipe> getRecipe(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(service.getRecipe(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteRecipe(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(service.deleteRecipe(id));
    }

    @DeleteMapping("")

    @GetMapping()
    public ResponseEntity<Object> extractRecipeFromSite() throws UnirestException {
        return ResponseEntity.ok(service.extractRecipeFromSite());
    }

    @GetMapping("/randomRecipe")
    public ResponseEntity<String> getRandomRecipes() throws UnirestException {
        return ResponseEntity.ok(service.getRandomRecipe());
    }
}
