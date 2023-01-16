package com.stepDefinitions;

import org.json.simple.JSONObject;
import org.testng.Assert;

import com.utils.Base;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.Method;

public class PostBatchesStepDef {
	
	private Base base;
	public PostBatchesStepDef(Base base) {
		this.base = base;
		}
	
	@When("user send api request with {string}")
	public void user_send_api_request_with(String url) {
		 JSONObject payload = new JSONObject();
	        payload.put("batchName", "Jan23-API Queen Bees-ApiLearning-SDET11-110");
	        payload.put("batchDescription", "Selenium");
	        payload.put("batchStatus", "Active");
	        payload.put("batchNoOfClasses", "12");
	        payload.put("programId", "1668");
	        base.requestSpecification.body(payload);
	        base.requestSpecification.header("Content-Type","application/json");
		 base.response = base.requestSpecification.request(Method.POST,url);
		System.out.println("response batch 1 :"+base.response.asString());
		}
	
	@When("user send api request with {string} to create another batch")
	public void user_send_api_request_with_to_create_another_batch(String url) {
		 JSONObject payload = new JSONObject();
	        payload.put("batchName", "Jan23-API Queen Bees-ApiLearning-SDET11-100");
	        payload.put("batchDescription", "Selenium");
	        payload.put("batchStatus", "Active");
	        payload.put("batchNoOfClasses", "12");
	        payload.put("programId", "1668");
	        base.requestSpecification.body(payload);
	        base.requestSpecification.header("Content-Type","application/json");
		 base.response = base.requestSpecification.request(Method.POST,url);
		 System.out.println("response batch 2 :"+base.response.asString());
		}
	
	
	@When("user send api request with {string} without header")
	public void user_send_api_request_with_without_header(String url) {
		JSONObject payload = new JSONObject();
        payload.put("batchName", "Jan23-API Queen Bees-SDET-SDET11-001");
        payload.put("batchDescription", "Selenium");
        payload.put("batchStatus", "Active");
        payload.put("batchNoOfClasses", "12");
        payload.put("programId", "1668");
        base.requestSpecification.body(payload);
        
	 base.response = base.requestSpecification.request(Method.POST,url);
	}

@When("user send api request with {string} with invalid body")
public void user_send_api_request_with_with_invalid_body(String url) {
	JSONObject payload = new JSONObject();
    payload.put("batchName", "Jan23-API Queen Bees-SDET-SDET11-001");
    payload.put("batchDescription", "Selenium");
    payload.put("batchStatus", "Active");
    payload.put("batchNoOfClasses", "12");
    base.requestSpecification.header("Content-Type","application/json");
    base.requestSpecification.body(payload);
    
 base.response = base.requestSpecification.request(Method.POST,url);
}
@Then("user validate response body message is {string}")
public void user_validate_response_body_message_is(String errorMessage) {
	String actualMessage = base.response.then().extract().path("errorMessage");
	Assert.assertEquals(actualMessage, " "+errorMessage+" ");
}

}
