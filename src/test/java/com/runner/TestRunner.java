package com.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features/GetBatches.feature","src/test/resources/features/getProgram.feature"},glue ={"com.stepDefinitions"},monochrome = true,
plugin= {"pretty","html:target/cucumber-report/cucumber.html"})

public class TestRunner extends AbstractTestNGCucumberTests {
//tags= {"@DeleteBatch/program"}  compile test verify
}


