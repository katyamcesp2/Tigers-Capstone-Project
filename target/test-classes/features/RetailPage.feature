@retailPageFinalTest
Feature: Retail Page

  Background: 
    Given User is on Retail website
    And User click on My Account
    When User click on Login
    And User enter username 'userName' and password 'password'
    And User click on Login button
    Then User should be logged in to My Account dashboard

  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on Register for an Affiliate Account link
    And User fill affiliate form with below information
      | company | website     | taxID | paymentMethod | chequepayeename |
      | Tek     | www.tek.com | 56789 | Cheque        | Tigers          |
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message

  Scenario: Edit your affiliate information from Cheque payment to Bank Transfer
    When User click on Edit your affiliate information link
    And User click on Bank Transfer radio button
    And user fill bank information with below information
      | bankName | abaNumber | swiftCode | accountName | accountNumber |
      | TekBank  |       456 |  10111213 | saving      |      12345678 |
    And User click on Continue button
    Then User should see a success message

  Scenario: Edit your account Information
    When User click on Edit your account information link
    And User modify below information
      | firstname | lastName | email                  | telephone |
      | katya     | Cespedes | kmcesp22@gmail.com | 234567883 |
    And User click on continue button
    Then User should see a message 'Sucess:Your account has been successfully updated.'
