package com.coderscampus.nestorassignment10.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.coderscampus.nestorassignment10.dto.WeekResponse;
import com.coderscampus.nestorassignment10.service.SpoonacularAPI;

public class MealPlanController {

	@Autowired
	private SpoonacularAPI spoonacularApi;
	
	@GetMapping("mealplanner/week")
	public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, String diet, String exclusions){
		return 
	}
	
	//@GetMapping("mealplanner/day")
	
	
}
