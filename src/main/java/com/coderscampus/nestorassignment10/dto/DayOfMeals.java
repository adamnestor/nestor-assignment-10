package com.coderscampus.nestorassignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DayOfMeals {

	@JsonProperty("meals")
	private Meals meals;
	
	@JsonProperty("nutrients")
	private Nutrients nutrients;
	
}
