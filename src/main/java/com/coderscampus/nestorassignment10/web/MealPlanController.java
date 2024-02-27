package com.coderscampus.nestorassignment10.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.nestorassignment10.dto.DayResponse;
import com.coderscampus.nestorassignment10.dto.WeekResponse;
import com.coderscampus.nestorassignment10.service.SpoonacularAPI;

@RestController
public class MealPlanController {

	@Autowired
	private SpoonacularAPI spoonacularApi;

	@GetMapping("mealplanner/week")
	public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, String diet, String exclusions) {
		return spoonacularApi.receiveMealPlan("week", numCalories, diet, exclusions, WeekResponse.class);
	}

	@GetMapping("mealplanner/day")
	public ResponseEntity<DayResponse> getDayMeals(String numCalories, String diet, String exclusions) {
		return spoonacularApi.receiveMealPlan("day", numCalories, diet, exclusions, DayResponse.class);
	}

}
