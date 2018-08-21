Feature: LoginFeature 
	This feature deals with the login functionality of the application

Scenario: Login with correct username and password 
	Given I navigate to the login page 
	And I enter the following for Login 
		| username | password      |
		| Mark   | test |
	And I click login button
	Then I click on logout
	