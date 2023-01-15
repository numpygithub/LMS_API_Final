package com.stepDefinitions;

import java.text.SimpleDateFormat;
import java.util.Calendar;

<<<<<<< HEAD
import org.json.simple.JSONObject;
import org.testng.Assert;

import com.utils.Base;
import com.utils.Loggerload;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.Method;

public class PostProgramStepDef {
	
	private Base base;
	public PostProgramStepDef(Base base) {
		this.base = base;
		}
	String timeStamp = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(Calendar.getInstance().getTime());
	
	
	@When("User send api request for save programs with {string}")
	public void user_send_api_request_for_save_programs_with(String url) {
		 JSONObject payload = new JSONObject();
	        payload.put("programName", "Jan23-API Queen Bees-Java-011");
	        payload.put("programDescription", "Learn api");
	        payload.put("programStatus", "Active");
	        payload.put("creationTime", timeStamp);
	        payload.put("lastModTime", timeStamp);
	        base.requestSpecification.body(payload);
	        base.requestSpecification.header("Content-Type","application/json");
		 base.response = base.requestSpecification.request(Method.POST,url);
	}
	
	@When("User send api request with {string} without programName")
	public void user_send_api_request_with_without_program_name(String url) {
		JSONObject payload = new JSONObject();
        payload.put("programDescription", "Learn api");
        payload.put("programStatus", "Active");
        payload.put("creationTime", timeStamp);
        payload.put("lastModTime", timeStamp);
        base.requestSpecification.body(payload);
        base.requestSpecification.header("Content-Type","application/json");
	 base.response = base.requestSpecification.request(Method.POST,url);
	}
	
	@When("User send api request to create program with {string} without header")
	public void user_send_api_request_to_create_program_with_without_header(String url) {
		JSONObject payload = new JSONObject();
        payload.put("programName", "Jan23-API Queen Bees-Java-011");
        payload.put("programDescription", "Learn api");
        payload.put("programStatus", "Active");
        payload.put("creationTime", timeStamp);
        payload.put("lastModTime", timeStamp);
        base.requestSpecification.body(payload);
       
	 base.response = base.requestSpecification.request(Method.POST,url);
	}
=======
import org.testng.Assert;

import com.utils.Base;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.JsonObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.http.Method;

public class PostProgramStepDef {

	private Base base;
	private String resource = "";

	public PostProgramStepDef(Base base) {
		this.base = base;
	}

	@Given("User sets the base API request {string}")
	public void user_sets_the_base_api_request_saveprogram(String url) {
		resource = url;
	}

	@When("User Send Post Request with {string}, {string}, {string}")
	public void user_send_post_request_with_jan23_api_queen_bees_selenium_learn_selenium_active(String name, String desc, String status) {
		String now = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")
				.format(Calendar.getInstance().getTime());
		
		JsonObject body = new JsonObject()
				.add("programName", name)
				.add("programDescription", desc)
				.add("programStatus", status)
				.add("creationTime", now)
				.add("lastModTime", now);
		
		base.response = base.requestSpecification
							.contentType(ContentType.JSON)
							.body(body.toString())
							.request(Method.POST, resource);
	}

	@Then("User Should receive {int} Created Status Code")
	public void user_should_receive_created_status_code(Integer code) {
		int programStatus = base.response.statusCode();
		Assert.assertEquals(programStatus, code);
	}
	
	@Then("Validate program name: {string}")
	public void validate_program_name(String name) {
		String programStatus = base.response.jsonPath().getString("programName");
		Assert.assertEquals(programStatus, name);
	}
	

	@Then("User Should receive {int} Bad Request and getting an error message cannot create program,since already exists.")
	public void user_should_receive_bad_request_and_getting_an_error_message_cannot_create_program_since_already_exists(Integer code) {
		int programStatus = base.response.statusCode();
		Assert.assertEquals(programStatus, code);
	}
}
