Feature: Login into tutorials ninja application

@Ninja
Scenario: Login to application with valid credentials
Given I navigates to login page of the application
When I enter Username as "arun.selenium@gmail.com" and Password as "Second@123" into the fields
And I click on Login button
Then I should be successfully login