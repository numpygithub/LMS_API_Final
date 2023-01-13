package com.utils;


import io.cucumber.java.Scenario;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Utilities {
	public final String baseURL = "https://lms-backend-service.herokuapp.com/lms";
	public  Response response;
	public Scenario scenario;
	public RequestSpecification requestSpecification;
	
	public Utilities(){
		requestSpecification = RestAssured.given();
		
	}
	

}


