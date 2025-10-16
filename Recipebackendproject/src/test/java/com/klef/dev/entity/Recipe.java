package com.klef.dev.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "recipe_table")
public class Recipe {

    @Id
    private int id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "ingredients", nullable = false, length = 500)
    private String ingredients;

    @Column(name = "instructions", nullable = false, length = 1000)
    private String instructions;

    @Column(name = "category", nullable = false, length = 50)
    private String category;

    @Column(name = "cooking_time", nullable = false, length = 50)
    private String cookingTime;

    @Column(name = "servings", nullable = false)
    private int servings;

    // Getters and setters..
    // Getters and Setters
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }
    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstructions() {
        return instructions;
    }
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public String getCookingTime() {
        return cookingTime;
    }
    public void setCookingTime(String cookingTime) {
        this.cookingTime = cookingTime;
    }

    public int getServings() {
        return servings;
    }
    public void setServings(int servings) {
        this.servings = servings;
    }

    @Override
    public String toString() {
        return "Recipe [id=" + id + ", name=" + name + ", ingredients=" + ingredients 
            + ", instructions=" + instructions + ", category=" + category 
            + ", cookingTime=" + cookingTime + ", servings=" + servings + "]";
    }
}