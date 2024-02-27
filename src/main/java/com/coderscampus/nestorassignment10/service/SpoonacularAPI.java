package com.coderscampus.nestorassignment10.service;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class SpoonacularAPI {
	
	@Value("${spoonacular.url.base}")
	private String base;
	@Value("${spoonacular.url.mealplan}")
	private String mealPlan;
	@Value("${spoonacular.apikey}")
	private String apiKey;
	
	
	
	RestTemplate rt = new RestTemplate();
	
	public <T> ResponseEntity<T> receiveMealPlan(String timeFrame, String numCalories, String diet, String exclude, Class <T> responseType) {
		
		URI uri = UriComponentsBuilder.fromHttpUrl(base + mealPlan)
										.queryParam("apiKey", apiKey)
										.queryParam("timeFrame", timeFrame)
										.queryParamIfPresent("targetCalories", Optional.ofNullable(numCalories))
										.queryParamIfPresent("diet", Optional.ofNullable(diet))
										.queryParamIfPresent("exclude", Optional.ofNullable(exclude))
										.build()
										.toUri();
		
		return rt.getForEntity(uri, responseType);
										
	}
	
}
