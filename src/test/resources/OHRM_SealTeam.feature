Feature: Verify valid login (positive test), invalid login (negative test)


Background: 
	Given User is at the login page
	
	
	
	
##@positiveTest
Scenario: successful login and verify success message displays
	
	When User enters valid username and password and click login
	Then User should be able to verify welcome text

##@blankTest
Scenario: Verify blank invalid
	When User enters a blank username and  valid password "admin123" then verify  disallowed username  password to be empty
	And  User enters a valid username "Admin" and  blank password then verify  disallowed   password to be empty

##@negativeTest
Scenario Outline: verify invalid login
    
	When User enters "<Username>"  and "<Password>" and click login
	Then User should be able to verify invalid text

	Examples:	
	
	|   Username        |   Password         |
	|   user1           |   admin123         |
    |   Admin           |   blankusername    |
    
	
	
	
	
