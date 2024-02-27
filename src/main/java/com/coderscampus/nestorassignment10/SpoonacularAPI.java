package com.coderscampus.nestorassignment10;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class SpoonacularAPI {

	
	public void callSpoonacularApi() {
		RestTemplate rt = new RestTemplate();
		
		URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
									 .queryParam("timeFrame", "day")
									 .build()
									 .toUri();
		
		ResponseEntity<String> response = rt.getForEntity(uri, String.class);
		System.out.println(response);
	}
	
}
