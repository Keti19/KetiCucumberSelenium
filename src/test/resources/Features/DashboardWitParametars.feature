Feature: Dashboard menu page

  Scenario: User should be able to see Dashboard Menu after login
    Given The user is on the login page
    When  The user logs in using "keti@gmail.com" and "Keti1234@" credentials
    Then  The welcome message contains "Keti"
    Then The user should be able to see following menu
      | Developers |
      | All Posts  |
      | My Account |


  Scenario: User should be able to see Dashboard Menu after login
    Given The user is on the login page

    When The user logs in using following credentials
      | username | keti@gmail.com |
      | password | Keti1234@      |
      | message  | Keti           |

    Then The user should be able to see following menu
      | Developers |
      | All Posts  |
      | My Account |