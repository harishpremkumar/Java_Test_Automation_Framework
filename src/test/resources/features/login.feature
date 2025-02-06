Feature: Login feature for Saucedemo

  Scenario: Valid user login
    Given the user is on the login page
    When the user enters a valid username and password
    Then the user should be logged in successfully
