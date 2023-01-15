package com.utils;


import io.cucumber.java.Scenario;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Base {
	public final String baseURL = "https://lms-backend-service.herokuapp.com/lms";
	public Response response;
	public Scenario scenario;
	public RequestSpecification requestSpecification;
	
	public Base(){
		RestAssured.baseURI = baseURL;
		requestSpecification = RestAssured.given();
	}
	

}


