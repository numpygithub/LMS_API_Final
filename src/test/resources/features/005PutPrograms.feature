Feature: Put Program
#@s_001
#Scenario Outline: Update Program with Program Id 
#Given user is on PUT method 
#When user send api request to update program with program id "<url>"
#Then user validate the response status code is <statusCode> 
#Then user validate response body program status is "<programStatus>"
#Then user validate response body program name is "<programName>"
#Examples:
#|url |statusCode|programStatus|programName|
#|/putprogram/6382 | 200 | Active |Jan23-API Queen Bees-SDET-002|

@s_001
Scenario Outline: Update Program with Program Name 
Given user is on PUT method 
When user send api request to update program with "<url>"
Then user validate the response status code is <statusCode> 
And user validate response body program status is "<programStatus>"
Examples:
|url |statusCode|programStatus|
|/program/Jan23-API Queen Bees-SDET-001 | 200 | Active | 

@s_001
Scenario Outline: Update Program with null program ID
Given user is on PUT method
When user send api request to update program with "<url>"
Then user validate the response status code is <statusCode> 
And user validate header content-Type as "<contentType>"
Then user validate the response body as error "<error>"

Examples:
|url| statusCode|contentType|error|
|/putprogram/| 404|application/json|Not Found|  
 

@s_001
Scenario Outline: Update Program with null program name
Given user is on PUT method
When user send api request to update program with "<url>"
Then user validate the response status code is <statusCode> 
And user validate header content-Type as "<contentType>"
Then user validate the response body as error "<error>"
Examples:
|url |statusCode|contentType|error|
|/program/ | 404 | application/json|Not Found|
