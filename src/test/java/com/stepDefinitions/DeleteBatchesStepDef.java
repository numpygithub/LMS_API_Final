package com.stepDefinitions;

import com.utils.Base;
import com.utils.Loggerload;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.http.Method;

public class DeleteBatchesStepDef {
	private Base base;
	public DeleteBatchesStepDef(Base base)
	{
	this.base = base;
				
	}

	@When("user send api request to delete batch with {string}")
	public void user_send_api_request_to_delete_batch_with(String url) {
		Loggerload.info("In user_send_api_request_to_del_batch");
		 base.response = base.requestSpecification.request(Method.DELETE,url);
	}
	
	}
