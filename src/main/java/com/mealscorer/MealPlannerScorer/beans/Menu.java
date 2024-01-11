package com.mealscorer.MealPlannerScorer.beans;

import java.util.ArrayList;

public class Menu {
    private ArrayList<FoodItem> courses;

    public Menu () {
        this.courses = new ArrayList<>(); // must have this to initlize the courses variable when the object is created
    }

    // Add a FoodItem object to the courses array
    public void addFoodItem (FoodItem item) {
        this.courses.add(item);
    }
    
    // Method to get the array of FoodItems
    public ArrayList<FoodItem> getFoodItems(){
    	return courses;
    }
}
