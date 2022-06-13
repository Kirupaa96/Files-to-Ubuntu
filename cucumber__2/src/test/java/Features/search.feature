Feature: Searching of various categories should be possible along with product search


Background: visiting the website as a guest user
Given I visit the website as the guest user

@All @Books
Scenario: user should be able to search for the products under Books category 
When I select the books option from the search dropdown 
And I click on search icon 
Then I should see the page having Amazon Bookstore displayed 
But I should not see other category products 


@All @Baby 
Scenario: user should be able to search for the products under Baby category 
 When I select the Baby option from the search dropdown 
And I click on search icon 
Then I should see the page having Countdown deals on baby products displayed 
But I should not see other category products 




