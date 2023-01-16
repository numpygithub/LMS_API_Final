package com.stepDefinitions;

import org.testng.Assert;

import com.utils.Base;
import com.utils.Loggerload;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.Method;

public class GetProgramsStepDef {
	
	private Base base;

	public GetProgramsStepDef(Base base) {
		this.base = base;

	}

	@When("user send api request to get all programs with {string}")
	public void user_send_api_request_to_get_all_programs_with(String url) throws Exception {

		base.response = base.requestSpecification.request(Method.GET, url);
	}
	
	@Then("user validate response body program name is {string}")
	public void user_validate_response_body_program_name_is(String programName) {
		String actualName = base.response.then().extract().path("programName");
		Assert.assertEquals(actualName, programName);
		Loggerload.info("---------->Actual program name is  :" + actualName);
	}

	@Then("user validate response body program status is {string}")
	public void user_validate_response_body_program_status_is(String status) {
		String programStatus = base.response.then().extract().path("programStatus");
		Assert.assertEquals(programStatus, status);
	}


}
