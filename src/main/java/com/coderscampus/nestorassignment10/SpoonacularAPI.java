package com.coderscampus.nestorassignment10;

import java.net.URI;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.nestorassignment10.dto.DayResponse;

public class SpoonacularAPI {

	@Test
	public void callSpoonacularApi() {
		RestTemplate rt = new RestTemplate();
		
		URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
									 .queryParam("timeFrame", "day")
									 .queryParam("apiKey", "7b23b338c42f4c64b39b1e92c23c0f22")
									 .build()
									 .toUri();
		
		ResponseEntity<DayResponse> response = rt.getForEntity(uri, DayResponse.class);
		System.out.println(response.getBody());
	}
	
}
