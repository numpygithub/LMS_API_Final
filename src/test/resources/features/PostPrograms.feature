#Author: your.email@your.domain.com

Feature: Validating Create Program
@AddProgram
Scenario Outline: Verify if Program is being Succesfully added using AddProgramAPI
	Given Add Place Payload with "<name>"  "<language>" "<address>"
	When user calls "AddProgramAPI" with "POST" http request
	Then the API call got success with status code 200
	And "status" in response body is "OK"
	And "scope" in response body is "APP"
	And verify place_Id created maps to "<name>" using "AddProgramAPI"
	
Examples:
	| 	 |  |		   |
	


