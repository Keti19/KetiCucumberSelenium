Feature: Data Driven Testing in Cucumber
  @ddf
  Scenario Outline: Login With DDF
    Given The user is on the login page
    When The user enters "<Sheet Name>" and row number <Username and Password>
    Then The welcome message contains in excel <Row Number for Name>
    Then The welcome message contains in excel <Row Number for Name>
    Then The date of the user experience is added to excel file with <Row Number for Date>

    Examples:
      | Sheet Name | Username and Password | Row Number for Name | Row Number for Company | Row Number for Date |
      | Test Data  | 0                     | 0                   | 0                      | 1                   |
      | Test Data  | 1                     | 1                   | 1                      | 2                   |
#      | Test Data  | 2                     | 2                   | 2                      | 3                   |
#      | Test Data  | 3                     | 3                   | 3                      | 4                   |
#      | Test Data  | 4                     | 4                   | 4                      | 5                   |
#      | Test Data  | 5                     | 5                   | 5                      | 6                   |
#      | Test Data  | 6                     | 6                   | 6                      | 7                   |
#      | Test Data  | 7                     | 7                   | 7                      | 8                   |
#      | Test Data  | 8                     | 8                   | 8                      | 9                   |
#      | Test Data  | 9                     | 9                   | 9                      | 10                  |
#      | Test Data  | 10                    | 10                  | 10                     | 11                  |


