Feature: Post Batch 
@s_001
Scenario Outline: Post Req
Given user is on POST method
When user send api request with "<url>"
Then user validate the response status code is <statusCode> 
And user validate header content-Type as "<contentType>"
Examples:
|url| statusCode|contentType|
|/batches| 201|application/json|

@s_001
Scenario Outline: Post Req without sending header
Given user is on POST method
When user send api request with "<url>" without header
Then user validate the response status code is <statusCode> 
And user validate header content-Type as "<contentType>"
Then user validate the response body as error "<error>"

Examples:
|url| statusCode|contentType|error|
|/batches| 415|application/json|Unsupported Media Type|

@s_001
Scenario Outline: Post Req with invalid url
 Given user is on POST method
When user send api request with "<url>"
Then user validate the response status code is <statusCode> 
And user validate header content-Type as "<contentType>"
Then user validate the response body as error "<error>"

Examples:
|url| statusCode|contentType|error|
|/| 404|application/json|Not Found|

@s_001
Scenario Outline: Post Req with invalid body
Given user is on POST method
When user send api request with "<url>" with invalid body
Then user validate the response status code is <statusCode> 
And user validate header content-Type as "<contentType>"
And user validate the response body "<errorCode>"
Then user validate response body message is "<message>"
Examples:
|url| statusCode|contentType|errorCode|message|
|/batches| 400|application/json|VALIDATION_FAILED| ProgramId field is needed; It should be a positive number |



