Feature: User Registration

  Scenario: ACCOUNT INFORMATION is visible
    Given The user is on home page
    And The home page is visible
    When The user Clicks on Signup link
    Then The New User Signup! text is visible
    And The user enters name and email address
    And The user Clicks on Signup button
    Then Verify that ENTER ACCOUNT INFORMATION is visible
    Given The user is on Reg page
    When The user clicks on title radio button
    And The user enters new password "DemoTest1234"
    When The user selects date of birth
    And The user clicks on NewsLetter checkbox
    And The user clicks on SpecialOffer checkbox
    When The user fill all the required details
      | Firstname | Lastname | Company | Address         | Address2  | State     | city     | zipcode | mobileno   |
      | test      | Demo     | Google  | Dowining Street | Mid State | Las Vegas | Mid town |  123456 | 1254785696 |
    And The user clicks on Create Account button
    Then Verify Account Created is visible
