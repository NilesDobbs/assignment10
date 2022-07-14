package com.coderscampus.assignment10.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meals {
	
	//Retrive the object properties from Nutrients in Meal Planner.
	//This will be recognized as a non-list object.
	
	@JsonProperty("id")
	private int id;
	@JsonProperty("title")
	private String title;
	@JsonProperty("imageType")
	private int imageType;
	@JsonProperty("readyInMinutes")
	private int readyInMinutes;
	@JsonProperty("servings")
	private int servings;
	@JsonProperty("sourceUrl")
	private int sourceUrl;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getImageType() {
		return imageType;
	}
	public void setImageType(int imageType) {
		this.imageType = imageType;
	}
	public int getReadyInMinutes() {
		return readyInMinutes;
	}
	public void setReadyInMinutes(int readyInMinutes) {
		this.readyInMinutes = readyInMinutes;
	}
	public int getServings() {
		return servings;
	}
	public void setServings(int servings) {
		this.servings = servings;
	}
	public int getSourceUrl() {
		return sourceUrl;
	}
	public void setSourceUrl(int sourceUrl) {
		this.sourceUrl = sourceUrl;
	}
} 