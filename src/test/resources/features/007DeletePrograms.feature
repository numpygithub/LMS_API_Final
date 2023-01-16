Feature: Delete Program 

#@s_001
#Scenario Outline: Delete Program by Program ID
#Given user is on DEL method 
#When User send api request to Delete program with "<url>"
#Then user validate the response status code is <statusCode>  
#
#Examples:
#|url									| statusCode|
#|/deletebyprogid/4561	| 200				|


@s_001
Scenario Outline: Delete Program by Program Name_1
Given user is on DEL method 
When User send api request to Delete program with "<url>"
Then user validate the response status code is <statusCode>  

Examples:
|url|statusCode	|
|/deletebyprogname/Jan23-API Queen Bees-SDET-001| 200	|

@s_001
Scenario Outline: Delete Program by Program Name_2
Given user is on DEL method 
When User send api request to Delete program with "<url>"
Then user validate the response status code is <statusCode>  

Examples:
|url							|statusCode	|
|/deletebyprogname/Jan23-API Queen Bees-SDET-002| 200	|

  