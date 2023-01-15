package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features",glue ={"com.stepDefinitions"},monochrome = true,
plugin= {"pretty","html:target/cucumber-report/cucumber.html"}, tags ="@s_001")
public class TestRunner extends AbstractTestNGCucumberTests {
//tags= {"@DeleteBatch/program"}  compile test verify
}


