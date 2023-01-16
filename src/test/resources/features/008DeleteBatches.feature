Feature: Delete Batch

@s_001
Scenario Outline: Delete batch by batch Id
Given user is on DEL method 
When user send api request to delete batch with "<url>"
Then user validate the response status code is <statusCode>
Then user validate the response body "<deleteMessage>"

Examples:
|url| statusCode|deleteMessage|
|/batches/batchId/|200|Deleted|

@s_001
Scenario Outline: Delete batch by null value
Given user is on DEL method 
When user send api request to delete batch with "<url>"
Then user validate the response status code is <statusCode>  
And user validate the response body error  "<error>"
Examples:
|url| statusCode|error|
|/batches/batchId/|400|Bad Request|

@s_001
Scenario Outline: Delete batch by invalid batch Id
Given user is on DEL method 
When user send api request to delete batch with "<url>"
Then user validate the response status code is <statusCode>  


Examples:
|url| statusCode|
|/batches/batchId/305|200|


