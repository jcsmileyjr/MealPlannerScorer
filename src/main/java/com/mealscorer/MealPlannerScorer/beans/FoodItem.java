package com.mealscorer.MealPlannerScorer.beans;

public class FoodItem {
    private String type;
    private String name;
    private int points;

    public int getPoints () {
        return points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
        if (type.equals("meat")) {this.points = 2;}
        if (type.equals("vegetable")) {this.points = 2;}
        if (type.equals("bread")) {this.points = 1;}
        if (type.equals("fruit")) {this.points = 3;}
        if (type.equals("dessert")) {this.points = 0;}
    }

    // Method to allow a user to create food item by setting its Name and Type
    public void createFoodItem(String name, String type) {
        setName(name);
        setType(type);

    }
}
