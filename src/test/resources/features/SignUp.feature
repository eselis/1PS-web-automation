Feature: Creates account features

  Scenario: New User creates account
    Given homepage is opened
    When I select My Acoount button
    And I select Sign Up button
    And I enter first name
    And I enter last name
    And I enter mobile number
    And I enter phone number
    And I enter password
    And I enter password again
    And I select Sign up button
    Then new account is created