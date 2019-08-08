Feature: Whataburger Login Feature 

Scenario Outline: Whataburger Login Test Scenario

	Given user is in welcome page 
	Then user enters "<username>" and "<password>"
	Then user is on Home Page and verify wab logo 
	Then user signout the app 
	Then Close the browser 
	
	Examples: 
		| username            | password |
		|devangwa998@gmail.com| burger01 | 
		|wabburger@gmail.com  | burger01 |