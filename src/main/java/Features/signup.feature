Feature: Whataburger Sign up Account 
#datadriven approach 

#@SmokeTest
Scenario: Whataburger Signup Test Sceanrio 

	Given User is in sign up page 
	When user enters details in all fields 
	    |FirstName| Last name|Phone number| Create Password|Confirm Password|
		|Den      |Dude		 |8496348534  |burger01		   |burger01        |
	#	|Devie    |denal     |8496348537  |burger01        |burger01        |
		
	Then user enters email id 
	Then user taps on email checkbox & tap on Signup button 
	Then user signout 

	