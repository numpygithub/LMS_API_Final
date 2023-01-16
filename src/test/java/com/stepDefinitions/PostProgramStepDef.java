package com.stepDefinitions;

import java.text.SimpleDateFormat;
import java.util.Calendar;

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
	
	
	@When("user send api request for save programs with {string}")
	public void user_send_api_request_for_save_programs_with(String url) {
		 JSONObject payload = new JSONObject();
	        payload.put("programName", "Jan23-API Queen Bees-Java-012");
	        payload.put("programDescription", "Learn api");
	        payload.put("programStatus", "Active");
	        payload.put("creationTime", timeStamp);
	        payload.put("lastModTime", timeStamp);
	        base.requestSpecification.body(payload);
	        base.requestSpecification.header("Content-Type","application/json");
		 base.response = base.requestSpecification.request(Method.POST,url);
	}
	
	@When("user send api request with {string} without programName")
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
	
	@When("user send api request to create program with {string} without header")
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
}
