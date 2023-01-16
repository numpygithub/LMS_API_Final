Feature: Put Batch
@s_001
Scenario Outline: Update Batch with Batch Id 
Given user is on PUT method 
When user send api request to update batch with "<url>"
Then user validate the response status code is <statusCode> 
Then user validate response body program status is "<batchStatus>"
Then user validate response body program name is "<batchName>"
Examples:
|url |statusCode|batchStatus|batchName|
|/batches/batchId/1563| 200 | Active | Jan23-API Queen Bees-JAVA-SDET22-001|

@s_001
Scenario Outline: Update Program with invalid Batch ID
Given user is on PUT method
When user send api request to update batch with "<url>"
Then user validate the response status code is <statusCode> 
And user validate header content-Type as "<contentType>"
Then user validate the response body as error "<error>"

Examples:
|url| statusCode|contentType|error|
|/batches/batchId/| 400|application/json|Bad Request|  
|/batches/batchId/&%*%**| 400|application/json|Bad Request|   