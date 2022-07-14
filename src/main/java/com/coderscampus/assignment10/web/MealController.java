package com.coderscampus.assignment10.web;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.assignment10.DTO.DayResponse;
import com.coderscampus.assignment10.DTO.WeekResponse;

@RestController
public class MealController {
	
	//Add base for the unchanging part of your web address.
	@Value("${spoonacular.urls.baseurl}")
	private String baseURL;
	
	@Value("${apikey}")
	private String apiKey;
	
	@GetMapping("/mealplanner/day")
	//Well use a ResponseEntity extension as the return value
	public ResponseEntity<DayResponse> getDayMeals(Optional<String> targetCalories, Optional<String> diet, Optional<String> exclusions) {
		RestTemplate rt = new RestTemplate();
		
		URI uri = UriComponentsBuilder.fromHttpUrl(baseURL)
									  .queryParam("timeframe", "day")
									  .queryParamIfPresent("targetCalories", targetCalories)
									  .queryParamIfPresent("diet", diet)
									  .queryParamIfPresent("exclude", exclusions)
									  .queryParam("apiKey", "afde66dab03e40eeb69381e09d93a00c")
									  .build()
									  .toUri();
		
	//In RestTemplate, this class is returned by getForEntity and response.
		ResponseEntity<DayResponse> response = rt.getForEntity(uri, DayResponse.class);
		return response;
	}
	
	@GetMapping("/mealplanner/week")
	public ResponseEntity<WeekResponse> getWeekMeals(Optional<String> targetCalories, Optional<String> diet, Optional<String> exclusions) {
		RestTemplate rt = new RestTemplate();
		URI uri = UriComponentsBuilder.fromHttpUrl(baseURL)
									  .queryParam("timeframe", "week")
									  .queryParamIfPresent("targetCalories", targetCalories)
									  .queryParamIfPresent("diet", diet)
									  .queryParamIfPresent("exclude", exclusions)
									  .queryParam("apiKey", "afde66dab03e40eeb69381e09d93a00c")
									  .build()
									  .toUri();
		ResponseEntity<WeekResponse> response = rt.getForEntity(uri, WeekResponse.class);
		return response;
	}
}