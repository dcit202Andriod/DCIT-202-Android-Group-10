package com.example.reciper.Models;

public class MyRecipeData {

    private String recipeName;
    private Integer recipeImage;

    public MyRecipeData(String recipeName, Integer recipeImage) {
        this.recipeName = recipeName;
        this.recipeImage = recipeImage;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public Integer getRecipeImage() {
        return recipeImage;
    }

    public void setRecipeImage(Integer recipeImage) {
        this.recipeImage = recipeImage;
    }
}
