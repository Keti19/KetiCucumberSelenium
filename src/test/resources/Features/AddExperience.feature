Feature: Add experience scenario
   @wip

  Scenario: Login as student with parameters
    Given The user is on the login page
    When The user logs in using "keti@gmail.com" and "Keti1234@" credentials
    Then The user should be able to login
    Then The welcome message contains "Keti"
     When The user clicks "Add Experience"
     Then The user should land on Add An Experience page
     And The user fills "Job Title" field as "QA Test Engineer"
     And The user fills "Company" field as "Oracle"
     And The user fills "Location" field as "New York"
     And The user picks "From Date" as "01/05/2021"
     And The user picks "To Date" as "04/08/2023"
     And The user fills "Job Description" field as "Quality Assurance"
     And The user submits the experience form
     Then The user should see the experience added message


  @wip
  Scenario: Add experience positive test 2
    Given The user is on the login page
    When The user logs in using "keti@gmail.com" and "Keti1234@" credentials
    Then The user should be able to login
    Then The welcome message contains "Keti"
    When The user clicks "Add Experience"
    Then The user should land on Add An Experience page
    When The user fills the experience form and submits
      | Job Title       | QA Test Engineer  |
      | Company         | Oracle            |
      | Location        | New York          |
      | From Date       | 01/05/2021        |
      | To Date         | 04/08/2023        |
      | Job Description | Quality Assurance |
    Then The user should see the experience added message