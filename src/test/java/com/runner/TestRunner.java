package com.runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
//Feature file sequence order need to be added
@CucumberOptions(features="src/test/resources",
plugin ="json:target/jsonReports/cucumber-report.json",
glue= {"stepDefinations"}
)
public class TestRunner {
//tags= {"@DeleteBatch/program"}  compile test verify
}


