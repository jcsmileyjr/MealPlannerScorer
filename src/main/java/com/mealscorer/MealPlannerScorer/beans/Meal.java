package com.mealscorer.MealPlannerScorer.beans;

import java.util.ArrayList;

public class Meal {
    private ArrayList<FoodItem> meal;

    public Meal () {
        this.meal = new ArrayList<>();
    }

    // Scores the meal based on 1pt = bread, 2pt = meat or Fruit, 3pt = vegetables
    public int scoreMeal () {
        int score = 0;

        for (FoodItem foodItem : meal) {
            score += foodItem.getPoints();
        }

        System.out.println("This meal score is: " + score);
        return score;
    }
    
    // Method to add the chosen FoodItem to the Meal array
    public void createMeal (FoodItem fooditem) {
    	this.meal.add(fooditem);
    }
}
