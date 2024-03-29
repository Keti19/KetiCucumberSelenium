Feature: Eurotech Login Test
  Background:
    Given The user is on the login page

  @teacher @smoke
  Scenario: Login As Teacher
    When  The user enters teacher credentials
    Then  The user should be able to login

  @student @db
  Scenario: Login As Student
    When  The user enters student credentials
    Then  The user should be able to login

  @developer @Eurotech1
  Scenario: Login As Developer
    When  The user enters developer credentials
    Then The user should be able to login
