package com.julianrios.RecipeApplication.services;

import com.julianrios.RecipeApplication.entities.Recipe;
import com.julianrios.RecipeApplication.repositories.RecipeRepository;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RecipeService {

    private RecipeRepository repo;

    @Autowired
    public RecipeService(RecipeRepository repo) {
        this.repo = repo;
    }

    // TODO allow user to save recipes to a collection

    public Recipe createRecipe(Recipe recipe) {
        return repo.save(recipe);
    }

    public Recipe getRecipe(Integer id) {
        return repo.findById(id).get();
    }

    public Object extractRecipeFromSite() throws UnirestException {
        HttpResponse<JsonNode> response;
        String address = "https://spoonacular-recipe-food-nutrition-v1.p.rapidapi.com/recipes/extract?url=https://www.recipetineats.com/oven-baked-chicken-and-rice/";

        response = Unirest.get(address)
                .header("X-RapidAPI-Host", "spoonacular-recipe-food-nutrition-v1.p.rapidapi.com")
                .header("X-RapidAPI-Key", "148f5c027fmsh8b71649419483ebp1299acjsn6968d17bbce4")
                .asJson();

        return response.getBody().getObject().toString();
    }

    public String getRandomRecipe() throws UnirestException {
        HttpResponse<JsonNode> response;
        response = Unirest.get("https://spoonacular-recipe-food-nutrition-v1.p.rapidapi.com/recipes/random?number=1&tags=vegetarian%2Cdessert")
                .header("X-RapidAPI-Host", "spoonacular-recipe-food-nutrition-v1.p.rapidapi.com")
                .header("X-RapidAPI-Key", "148f5c027fmsh8b71649419483ebp1299acjsn6968d17bbce4")
                .asJson();

        return response.getBody().getObject().toString();
    }


}
