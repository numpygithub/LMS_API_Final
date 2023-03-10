Feature: Post program
@s_001
Scenario Outline: Post Req
Given user is on POST method
When user send api request for create program with "<url>"
Then user validate the response status code is <statusCode> 
And user validate header content-Type as "<contentType>"

Examples:
|url| statusCode|contentType|
|/saveprogram| 201 |application/json|

@s_001
Scenario Outline: Post Req
Given user is on POST method
When user send api request for create another program with "<url>"
Then user validate the response status code is <statusCode> 
And user validate header content-Type as "<contentType>"

Examples:
|url| statusCode|contentType|
|/saveprogram| 201 |application/json|

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
When user send api request with "<url>" without programName
Then user validate the response status code is <statusCode> 
And user validate header content-Type as "<contentType>"

Examples:
|url| statusCode|contentType|
|/batches| 400|application/json|

@s_001
Scenario Outline: Post Req without sending header
Given user is on POST method
When user send api request to create program with "<url>" without header
Then user validate the response status code is <statusCode> 
And user validate header content-Type as "<contentType>"
Then user validate the response body as error "<error>"

Examples:
|url| statusCode|contentType|error|
|/batches| 415|application/json|Unsupported Media Type|