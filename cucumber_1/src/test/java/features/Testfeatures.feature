#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login feature of zero bank 
  
  @tag1
  Scenario Outline: Login as authenticated user 
    Given Login page of zero bank on Browser "<Browser>"
    When  correct loginname "<loginname>" and password "<loginpassword>" is entered 
    And click on sign in button 
    Then Login is successful
   
  Examples: 
 |Browser|loginname|loginpassword|
 |Chrome |username |password     |
 
 


  
   
   
   
   
  