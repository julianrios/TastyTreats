package com.julianrios.RecipeApplication.controllers;

import com.julianrios.RecipeApplication.services.RecipeService;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

    private RecipeService service;

    @Autowired
    public RecipeController(RecipeService service) {
        this.service = service;
    }

    @PostMapping()
    public HttpResponse<JsonNode> siteRecipeGen() throws UnirestException {
        HttpResponse<JsonNode> response = Unirest.get("https://spoonacular-recipe-food-nutrition-v1.p.rapidapi.com/recipes/extract?url=https%3A%2F%2Fwww.recipetineats.com%2Foven-baked-chicken-and-rice%2F")
                .header("X-RapidAPI-Host", "spoonacular-recipe-food-nutrition-v1.p.rapidapi.com")
                .header("X-RapidAPI-Key", "148f5c027fmsh8b71649419483ebp1299acjsn6968d17bbce4")
                .asJson();
        return response;
    }

}
