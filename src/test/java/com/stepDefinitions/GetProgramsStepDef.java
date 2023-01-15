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

	@When("User send api request to get all programs with {string}")
	public void user_send_api_request_to_get_all_programs_with(String url) throws Exception {

		base.response = base.requestSpecification.request(Method.GET, url);
	}

	@When("User send api request to get programs with {string}")
	public void user_send_api_request_to_get_programs_with(String url) {
		base.response = base.requestSpecification.request(Method.GET, url);
	}

	@When("User send api request to get program with {string} and id for {string}")
	public void user_send_api_request_to_get_program_with_and_id_for(String url, String programName) {
		System.out.println("programName name is :"+programName);
		

		base.response = base.requestSpecification.request(Method.GET, url);
	}

	@Then("user validate response body program name is {string}")
	public void user_validate_response_body_program_name_is(String programName) {
		String actualName = base.response.then().extract().path("programName");
		Assert.assertEquals(actualName, programName);
		Loggerload.info("---------->Actual program name is  :" + actualName);
	}

	@Then("user validate the response body as error {string}")
	public void user_validate_the_response_body_as_error(String error) {
		String errorMsg = base.response.then().extract().path("error");
		Assert.assertEquals(errorMsg, error);
	}

	@Then("user validate response body program status is {string}")
	public void user_validate_response_body_program_status_is(String status) {
		String programStatus = base.response.then().extract().path("programStatus");
		Assert.assertEquals(programStatus, status);
	}

}
