Feature: Get Batch
@s_001
Scenario Outline: Get all batches
Given user is on GET method
When User send api request to get all batches with "<url>"
Then user validate the response status code is <statusCode> 

Examples:
|url| statusCode|
|/batches| 200|
@s_001
Scenario Outline: Get batch by batchId
Given user is on GET method 
When User send api request to get all batches with "<url>"
Then user validate the response status code is <statusCode> 
Then user validate response body batch status is "<status>"
Then user validate response body batch name is "<batchName>"

Examples:
|url| statusCode| status|batchName|
|/batches/batchId/942| 200|Active|Batch-2023042051430|

@s_001
Scenario Outline: Get batch by batchName
Given user is on GET method 
When User send api request to get all batches with "<url>"
Then user validate the response status code is <statusCode>  
And user validate header content-Type as "<contentType>"

Examples:
|url| statusCode|contentType|
|/batches/batchName/Jan23-CRUDCarriers-SDET-853| 200|application/json|

@s_001
Scenario Outline: Get batch by programId
Given user is on GET method 
When User send api request to get all batches with "<url>"
Then user validate the response status code is <statusCode>  
And user validate header content-Type as "<contentType>"

Examples:
|url| statusCode|contentType|
|batches/program/1668| 200|application/json|

@s_001
Scenario Outline: Get batch by invalid programId
Given user is on GET method 
When User send api request to get all batches with "<url>"
Then user validate the response status code is <statusCode>  
And user validate the response body "<errorCode>"
And user validate header content-Type as "<contentType>"

Examples:
|url| statusCode| errorCode|contentType|
|batches/program/3| 400| ENTITY_DOES_NOT_EXIST|application/json|

@s_001
Scenario Outline: Get all batches by giving invalid URL
Given user is on GET method
When User send api request to get all batches with "<url>"
Then user validate the response status code is <statusCode> 
Then user validate the response body as error "<error>"

Examples:
|url| statusCode|error|
| /| 404|Not Found|

@s_001
Scenario Outline: Get batch by invalid batchId
Given user is on GET method 
When User send api request to get all batches with "<url>"
Then user validate the response status code is <statusCode>  
Then user validate response body error message is "<message>"


Examples:
|url| statusCode| message|
|/batches/batchId/2| 400|Batch not found with Id : 2 |

@s_001
Scenario Outline: Get batch by invalid batchName
Given user is on GET method 
When User send api request to get all batches with "<url>"
Then user validate the response status code is <statusCode>  
And user validate header content-Type as "<contentType>"
And user validate the response body "<errorCode>"

Examples:
|url| statusCode|contentType|errorCode|
|/batches/batchName/Jan23-CRUDCarriers-SDE| 400|application/json|ENTITY_DOES_NOT_EXIST|

@s_001
Scenario Outline: Get batch by not giving any batchName
Given user is on GET method 
When User send api request to get all batches with "<url>"
Then user validate the response status code is <statusCode>  
And user validate header content-Type as "<contentType>"
And user validate the response body error  "<errormsg>"

Examples:
|url| statusCode|contentType|errormsg|
|/batches/batchName/|405|application/json|Method Not Allowed|

@s_001
Scenario Outline: Get batch by not giving any batchId
Given user is on GET method 
When User send api request to get all batches with "<url>"
Then user validate the response status code is <statusCode>  
And user validate header content-Type as "<contentType>"
And user validate the response body error  "<errormsg>"

Examples:
|url| statusCode|contentType|errormsg|
|/batches/batchId/|405|application/json|Method Not Allowed|



