package com.stepDefinitions;

import org.testng.Assert;

import com.utils.Base;
import com.utils.Loggerload;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.Method;

public class GetBatchesStepDef {
	
	private Base base;
	public GetBatchesStepDef(Base base) {
		this.base = base;
		
	}
	
	@When("User send api request to get all batches with {string}")
	public void user_send_api_request_to_get_all_batches_with(String url) {
		
		Loggerload.info("In user_send_api_request_to_get_all_batches_with");
		 base.response = base.requestSpecification.request(Method.GET,url);
	}
	
	@Then("user validate response body batch name is {string}")
	public void user_validate_response_body_batch_name_is(String name) {
		String responseBody = base.response.getBody().asString();
		String actualName = base.response.then().extract().path("batchName");
		Assert.assertEquals(actualName, name);
		Loggerload.info("Actual response status is  :" + actualName);
	}
	
	@Then("user validate response body error message is {string}")
	public void user_validate_response_body_error_message_is(String errorMessage) {
		
		String actualMessage = base.response.then().extract().path("errorMessage");
		Assert.assertEquals(actualMessage, errorMessage+" ");
	    
	}

}
