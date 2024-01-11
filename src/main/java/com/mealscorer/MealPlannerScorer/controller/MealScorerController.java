package com.mealscorer.MealPlannerScorer.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mealscorer.MealPlannerScorer.beans.FoodItem;
import com.mealscorer.MealPlannerScorer.beans.Meal;
import com.mealscorer.MealPlannerScorer.beans.Menu;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class MealScorerController {
	
	Menu courses = new Menu(); // Array of FoodItems created by the user
    Meal meal = new Meal(); // Array of FoodItems picked by the user
	
    // Test message to ensure server is running
	@GetMapping("/")
	public String TestMessage() {
		return "Hello World";
	}
	
	// API to send the list of create food to the UI
	// http://localhost:8080/getFoodItems
	@GetMapping("/getFoodItems")
	public ArrayList<FoodItem> getFoodItems() {
		return courses.getFoodItems();
	}
	
	//http://localhost:8080/createFoodItem
	@PostMapping("/createFoodItem")
	public void createFoodItem(@RequestBody FoodItem foodItem) {
		FoodItem food = new FoodItem();
		food.createFoodItem(foodItem.getName(), foodItem.getType());
		courses.addFoodItem(food); // Adds the FoodItem to the Menu array
		System.out.println("it works: " + food.getPoints());
	}

	// API allowing user to add a FoodItem to the meal and get the entire meal scored.
	// http://localhost:8080/createMeal
	@PostMapping("/createMeal")
	public int createMeal(@RequestBody FoodItem foodItem) {
		meal.createMeal(foodItem);
		return meal.scoreMeal();
	}
	
}
