Feature: Get Program
@s_002
Scenario Outline: Get all programs
Given User is on GET method 
When User send api request to get all programs with "<url>"
Then User validate the response status code is <statusCode> 
And User validate header content-Type as "<contentType>"

Examples:
|url				 | statusCode|contentType			 |
|/allPrograms| 200			 | application/json|

@s_002
Scenario Outline: Get program by programId
Given User is on GET method 
When User send api request to get all programs with "<url>"
Then User validate the response status code is <statusCode>  
Then User validate response body program status is "<status>"
Then User validate response body program name is "<programName>"

Examples:
|url					 | statusCode| status|programName										|
|/programs/1668| 200			 | Active|Jan23-API Queen Bees-Java-011	|

 @s_002
Scenario Outline: Get program by invalid progamId
Given User is on GET method 
When User send api request to get all programs with "<url>"
Then User validate the response status code is <statusCode>  
And User validate the response body "<errorCode>"

Examples:
|url				| statusCode| errorCode						|
|/programs/9| 400				|ENTITY_DOES_NOT_EXIST|

@s_002
Scenario Outline: Get program by not giving programId
Given User is on GET method 
When User send api request to get all programs with "<url>"
Then User validate the response status code is <statusCode>  
And User validate the response body as error "<error>"
Examples:
|url			 | statusCode| error	 |
|/programs/| 404			 |Not Found|
	
@s_002
Scenario Outline: Get all program by invalid url
Given User is on GET method															
When User send api request to get all programs with "<url>"
Then User validate the response status code is <statusCode>  
And User validate the response body as error "<error>"
Examples:
|url				| statusCode| error		|
|/allProgram| 404				|Not Found|










