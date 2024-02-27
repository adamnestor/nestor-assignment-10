package com.coderscampus.nestorassignment10.service;

import java.net.URI;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class SpoonacularAPI {
	
	RestTemplate rt = new RestTemplate();
	
	public <T> ResponseEntity <T> receiveMealPlan(String timeFrame, String numCalories, String diet, String exclude, Class <T> responseType) {
		
		URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
										.queryParam("apiKey", "7b23b338c42f4c64b39b1e92c23c0f22")
										.queryParam("timeFrame", timeFrame)
										.queryParamIfPresent("targetCalories", Optional.ofNullable(numCalories))
										.queryParamIfPresent("diet", Optional.ofNullable(diet))
										.queryParamIfPresent("exclude", Optional.ofNullable(exclude))
										.build()
										.toUri();
		
		return rt.getForEntity(uri, responseType);
										
	}
	
}
