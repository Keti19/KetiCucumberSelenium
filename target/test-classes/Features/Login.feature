Feature: Eurotech Login Test
  Background:
    Given The user is on the login page

  @teacher
  Scenario: Login As Teacher
    When  The user enters teacher credentials
    Then  The user should be able to login


  Scenario: Login As Student
    When  The user enters student credentials
    Then  The user should be able to login
