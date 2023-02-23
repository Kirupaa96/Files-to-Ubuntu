                                  #Data Tables
                                                                 
Feature: Register for an account in Tutorials ninja application 

@Register
Scenario: Register for the application by providing valid credentials 
Given I navigate to the register page 
When I enter below details 
|FirstName   |kirupaa          |
|LastName    |Shankar          |
|Email       |krish96@gmail.com|
|Telephone   |9874561233       |
|Password    |krish96          |
And I select privacy policy option 
And I click on continue button 
Then User should be able to successfully register

