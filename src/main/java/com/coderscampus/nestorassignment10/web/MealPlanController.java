package com.coderscampus.nestorassignment10.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.coderscampus.nestorassignment10.dto.WeekResponse;
import com.coderscampus.nestorassignment10.service.SpoonacularAPI;

public class MealPlanController {

	@Autowired
	SpoonacularAPI spoonacularApi;
	
	@GetMapping("mealplanner/week")
	public ResponseEntity<WeekResponse> getWeekMeals(String timeFrame, String numCalories, String diet, String exclusions, String responseType)
	
	//@GetMapping("mealplanner/day")
	
	
}
