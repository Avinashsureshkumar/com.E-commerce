
Feature: Login

  Scenario: Login with valid pwd
    Given The user is on login page
    And The home page is visible
    When The user Clicks on Signup link
    Then Verify Login to your account should be visible
    When The usere Enters correct email address and password
    When Click login button
    Then Verify that Logged in as username is visible
    When The user clicks on delete acc button
    Then Verify that ACCOUNT DELETED is visible
