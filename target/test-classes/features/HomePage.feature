@homePageFinalTest
Feature: Home Page

Background: 
Given User in on Retail website


Scenario: User verify currency values change
When User click on Currency
And User Chose Euro from dropdown
Then currency value should change to Euro

Scenario: User empty shopping cart message displays
When User click on shopping cart
Then 'Your shopping cart is empty!' message should display

