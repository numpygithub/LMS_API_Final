package com.stepDefinitions;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.json.simple.JSONObject;

import com.utils.Base;

import io.cucumber.java.en.When;
import io.restassured.http.Method;

public class PutProgramStepDef {
	
	public Base base;
	public PutProgramStepDef(Base base) {
		this.base = base;
		}
	String timeStamp = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(Calendar.getInstance().getTime());


	@When("user send api request to update program with {string}")
	public void user_send_api_request_to_update_program_with(String url) {
		JSONObject payload = new JSONObject();
        payload.put("programName", "Jan23-API Queen Bees-SDET-001");
        payload.put("programDescription", "Learn API");
        payload.put("programStatus", "Active");
        payload.put("creationTime", timeStamp);
        payload.put("lastModTime", timeStamp);
        base.requestSpecification.body(payload);
        base.requestSpecification.header("Content-Type","application/json");
	 base.response = base.requestSpecification.request(Method.PUT,url);

	}
	@When("user send api request to update program with program id {string}")
	public void user_send_api_request_to_update_program_with_program_id(String url) {
		JSONObject payload = new JSONObject();
        payload.put("programName", "Jan23-API Queen Bees-ApiTesting-003");
        payload.put("programDescription", "Learn SQL");
        payload.put("programStatus", "Active");
        payload.put("creationTime", timeStamp);
        payload.put("lastModTime", timeStamp);
        base.requestSpecification.body(payload);
        base.requestSpecification.header("Content-Type","application/json");
	 base.response = base.requestSpecification.request(Method.PUT,url);

	}
	
}
