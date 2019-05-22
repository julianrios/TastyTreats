package com.julianrios.RecipeApplication.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class RecipeBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "recipeBook")
    @JsonIgnore
    private List<Recipe> recipes;

    public RecipeBook() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void add (Recipe recipe) {
        recipes.add(recipe);
    }

    public Boolean delete (Recipe recipe) {
        return recipes.remove(recipe);
    }

    public Recipe getRecipe(Recipe recipeToFind) {
        for(Recipe recipe : recipes) {
            if(recipe.equals(recipeToFind)) {
                return recipes.get(recipes.indexOf(recipe));
            }
        }
        throw new NullPointerException();
    }

    public Boolean containsRecipe(Recipe recipe) {
        return recipes.contains(recipe);
    }

    public List<Recipe> getRecipeBook() {
        return recipes;
    }

    public void setRecipeBook(List<Recipe> recipes) {
        this.recipes = recipes;
    }
}
