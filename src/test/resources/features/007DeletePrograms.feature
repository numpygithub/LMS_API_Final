Feature: Delete Program 

@s_001
Scenario Outline: Delete Program by Program ID
Given user is on DEL method 
When User send api request to Delete program with "<url>"
Then user validate the response status code is <statusCode>  

Examples:
|url									| statusCode|
|/deletebyprogid/4561	| 200				|


@s_001
Scenario Outline: Delete Program by Program Name
Given user is on DEL method 
When User send api request to Delete program with "<url>"
Then user validate the response status code is <statusCode>  
Then user validate the response body error  "<errormsg>"

Examples:
|url							| programName											|statusCode	|errormsg	|
|/deletebyprogname|Jan23-API Queen Bees-Selenium-011| 404				|Not Found|

  