Feature: Login as different users using Scenario Outline
@ddf
  Scenario Outline: Login as student with parameters
    Given The user is on the login page
    When The user logs in using "<username>" and "<password>" credentials
    Then The user should be able to login
    Examples:
      | username           | password   |
      | eurotech@gmail.com | Test12345! |
      | keti@gmail.com     | Keti1234@  |
      | nhntsc@gmail.com   | N12345!    |
      | seyit@gmail.com    | Seyit!     |
      | 123456@gmail.com   | 123456     |