Feature:  Account Management

  @CreateAccount
  Scenario: Create an Account
    Given User on create an account page
    When user enters first name
    And user enters last name
    And user enters an email
    And user enter password
    And user enetr confirm password
    Then user create account successful