Feature: Login to the omayo application 

#This is a comment 

@All @omayo
Scenario Outline: Users should be able to login only with correct credentials 
Given I navigate to application url
When I enter username as "<someusername>" and password as "<somepassword>" 
And I click on login button 
Then User should be able to login based on "<expected>" login status 

Examples:
  |someusername  |somepassword|expected|
	|kirupaa       |45678       |failure |
	|SeleniumByArun|Test143$    |success |
	|test          |7896        |failure |
	