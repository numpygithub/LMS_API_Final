package com.stepDefinitions;

import org.testng.Assert;

import com.utils.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.Method;

public class DeleteProgramStepDef {
	
	private Base base;

	public DeleteProgramStepDef(Base base) {
		this.base = base;

	}
	
	@When("User send api request to Delete program with {string}")
	public void user_send_api_request_to_delete_program_with(String url) {
		base.response = base.requestSpecification.request(Method.DELETE, url);
		
	}
	
	@Then("user validate the response body {string} is OK")
	public void user_validate_the_response_body_is_ok(String deleteMessage) {
		String deletedMsg = base.response.then().extract().path("deleteMessage");
		Assert.assertEquals(deletedMsg, deleteMessage);
		
		
	}



}
