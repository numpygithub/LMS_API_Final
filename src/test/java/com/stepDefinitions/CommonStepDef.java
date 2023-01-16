package com.stepDefinitions;

import org.testng.Assert;

import com.utils.Base;
import com.utils.Loggerload;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CommonStepDef {
	private Base base;
	public CommonStepDef(Base base) {
		this.base = base;
		
	}
	@Given("user is on GET method")
	public void user_is_on_get_method() {
		
	  }
	
	@Given("user is on POST method")
	public void user_is_on_post_method() {
		
	  }
	@Given("user is on PUT method")
	public void user_is_on_put_method() {
    
	}
	@Given("user is on DEL method")
	public void user_is_on_del_method() {
		
	}
	
	@Then("user validate the response status code is {int}")
	public void user_validate_the_response_status_code_is(Integer statusCode) {
		int actualResponseCode = base.response.then().extract().statusCode();
		Assert.assertEquals(actualResponseCode, statusCode);
		Loggerload.info("Actual response code is  :" + actualResponseCode);
	}
	
	@Then("user validate response body batch status is {string}")
	public void user_validate_response_body_batch_status_is(String status) {
		String responseBody = base.response.getBody().asString();

		String actualStatus = base.response.then().extract().path("batchStatus");
		Assert.assertEquals(actualStatus, status);
		Loggerload.info("---------->Actual response status is  :" + actualStatus);

	}
	@Then("user validate header content-Type as {string}")
	public void user_validate_header_content_type_as(String contentType) {
		String contenttype = base.response.then().extract().header("content-Type");
		Assert.assertEquals(contenttype, contentType);
	}
	
	@Then("user validate the response body {string}")
	public void user_validate_the_response_body(String error) {
		String actualError = base.response.then().extract().path("errorCode");
		Assert.assertEquals(actualError, error);
	
	}
	
	@Then("user validate response body error message is {string}")
	public void user_validate_response_body_error_message_is(String errorMessage) {
		
		String actualMessage = base.response.then().extract().path("errorMessage");
		Assert.assertEquals(actualMessage, errorMessage+" ");
	    
	}
	@Then("user validate the response body error  {string}")
	public void user_validate_the_response_body_error(String error) {
		String actualMessage = base.response.then().extract().path("error");
		Assert.assertEquals(actualMessage, error);
	}

	@Then("user validate the response body as error {string}")
	public void user_validate_the_response_body_as_error(String error) {
		String errorMsg = base.response.then().extract().path("error");
		Assert.assertEquals(errorMsg, error);
	}
	
	


}
