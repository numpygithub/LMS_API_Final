package com.utils;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	@Before
	public void scenario(Scenario scenario) {
		Loggerload.info("===============================================================================================");
		Loggerload.info(scenario.getSourceTagNames() +" : "+scenario.getName());
		Loggerload.info("-----------------------------------------------------------------------------------------------");
		
	}

}
