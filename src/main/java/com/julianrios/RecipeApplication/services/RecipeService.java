package com.julianrios.RecipeApplication.services;

import com.julianrios.RecipeApplication.entities.Recipe;
import com.julianrios.RecipeApplication.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {

    private RecipeRepository repo;

    @Autowired
    public RecipeService(RecipeRepository repo) {
        this.repo = repo;
    }

    public Recipe createReecipe(Recipe recipe) {
        return repo.save(recipe);
    }

    public Recipe getRecipe(Integer id) {
        return repo.findById(id).get();
    }

//    public Recipe createRecipe(String recipe) {
//        return repo.save(recipe);
//    }


}
