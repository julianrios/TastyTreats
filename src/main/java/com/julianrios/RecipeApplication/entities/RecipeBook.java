package com.julianrios.RecipeApplication.entities;


import java.util.List;

public class RecipeBook {

    private Integer id;
    private Recipe recipe;
    private List<Recipe> recipeBook;

    public RecipeBook() {
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
        recipeBook.add(recipe);
    }

    public Boolean delete (Recipe recipe) {
        return recipeBook.remove(recipe);
    }

    public Recipe getRecipe(Recipe recipeToFind) {
        for(Recipe recipe : recipeBook) {
            if(recipe.equals(recipeToFind)) {
                return recipeBook.get(recipeBook.indexOf(recipe));
            }
        }
        throw new NullPointerException();
    }

    public Boolean containsRecipe(Recipe recipe) {
        return recipeBook.contains(recipe);
    }

    public List<Recipe> getRecipeBook() {
        return recipeBook;
    }

    public void setRecipeBook(List<Recipe> recipeBook) {
        this.recipeBook = recipeBook;
    }
}
