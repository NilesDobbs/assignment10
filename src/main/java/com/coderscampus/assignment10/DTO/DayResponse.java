package com.coderscampus.assignment10.DTO;

import java.util.List;

public class DayResponse {
	
	//Retrieve the JSON data from both the Meals class
	//and object properties of Nutrients class.
	private List<Meals> meals;
	private Nutrients nutrients;
	
	public List<Meals> getMeals() {
		return meals;
	}
	public void setMeals(List<Meals> meals) {
		this.meals = meals;
	}
	public Nutrients getNutrients() {
		return nutrients;
	}
	public void setNutrients(Nutrients nutrients) {
		this.nutrients = nutrients;
	}
}