package com.stepDefinitions;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.json.simple.JSONObject;

import com.utils.Base;

import io.cucumber.java.en.When;
import io.restassured.http.Method;

public class PutBatchesStepDef {
	
	public Base base;
	public PutBatchesStepDef(Base base) {
		this.base = base;
		}
	String timeStamp = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(Calendar.getInstance().getTime());

	@When("user send api request to update batch with {string}")
	public void user_send_api_request_to_update_batch_with(String url) {
		
		JSONObject payload = new JSONObject();
        
        payload.put("batchName", "Jan23-API Queen Bees-JAVA-SDET22-001");
        payload.put("batchDescription", "Selenium");
        payload.put("batchStatus", "Active");
        payload.put("batchNoOfClasses", "10");
        payload.put("programId", "1561");
	    payload.put("programName", "Jan23-API Queen Bees-JAVA-010");
        System.out.println(payload.toJSONString()); 
        base.requestSpecification.body(payload);
        base.requestSpecification.header("Content-Type","application/json");
		 base.response = base.requestSpecification.request(Method.PUT,url);
    
		
	}

}
