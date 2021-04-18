Feature: Verify valid login (positive test), invalid login (negative test)


Background: 
	Given User is at the login page
	
	
	
	
@positiveTest
Scenario: successful login and verify success message displays
	
	When User enters valid username and password and click login
	Then User should be able to verify welcome text





@negativeTest
Scenario Outline: verify invalid login
    
	When User enters "<Invalid_Username>"  and "<Invalid_Password>" and click login
	Then User should be able to verify invalid text

	Examples:	
	
	| Invalid_Username         | Invalid_Password   |
	| user1                    |  testme1           |
    | Admin                    | blankusername      |
	
