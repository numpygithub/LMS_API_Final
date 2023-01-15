Feature: Get Program
@s_001
Scenario Outline: Get all programs
Given user is on GET method 
When User send api request to get all programs with "<url>"
Then user validate the response status code is <statusCode> 
And user validate header content-Type as "<contentType>"

Examples:
|url| statusCode|contentType|
|/allPrograms| 200| application/json|

@s_001
Scenario Outline: Get program by programId
Given user is on GET method 
When User send api request to get program with "<url>" and id for "<programName>"
Then user validate the response status code is <statusCode>  
Then user validate response body program status is "<status>"
Then user validate response body program name is "<programName>"

Examples:
|url| statusCode| status|programName|
|/programs/1668| 200| Active|Jan23-API Queen Bees-Java-011|

@s_001
Scenario Outline: Get program by invalid progamId
Given user is on GET method 
When User send api request to get programs with "<url>"
Then user validate the response status code is <statusCode>  
And user validate the response body "<errorCode>"

Examples:
|url| statusCode| errorCode|
|/programs/9| 400|ENTITY_DOES_NOT_EXIST|

@s_001
Scenario Outline: Get program by not giving programId
Given user is on GET method 
When User send api request to get programs with "<url>"
Then user validate the response status code is <statusCode>  
And user validate the response body as error "<error>"
Examples:
|url| statusCode| error|
|/programs/| 404|Not Found|

@s_001
Scenario Outline: Get all program by invalid url
Given user is on GET method															
When User send api request to get programs with "<url>"
Then user validate the response status code is <statusCode>  
And user validate the response body as error "<error>"
Examples:
|url| statusCode| error|
|/allProgram| 404|Not Found|










