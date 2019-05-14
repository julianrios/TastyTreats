package com.julianrios.RecipeApplication.entities;


import java.util.List;

public class RecipeCollection {

    private Integer id;
    private Recipe recipe;
    private List<Recipe> recipesCollection;

    public RecipeCollection() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public void add (Recipe recipe) {
        recipesCollection.add(recipe);
    }

    public Boolean delete (Recipe recipe) {
        return recipesCollection.remove(recipe);
    }

    public Recipe getRecipe(Recipe recipeToFind) {
        for(Recipe recipe : recipesCollection) {
            if(recipe.equals(recipeToFind)) {
                return recipesCollection.get(recipesCollection.indexOf(recipe));
            }
        }
        throw new NullPointerException();
    }

    public Boolean containsRecipe(Recipe recipe) {
        return recipesCollection.contains(recipe);
    }

    public List<Recipe> getRecipesCollection() {
        return recipesCollection;
    }

    public void setRecipesCollection(List<Recipe> recipesCollection) {
        this.recipesCollection = recipesCollection;
    }
}
