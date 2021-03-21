Feature: SignUp

  @SingUp @SmokeTest
  Scenario Outline: Sign Up User
    When User sign up in portal with <username> and <password>
    Then User is signed in portal
    Examples:
      |username|password  |
      |fefe    |fefe      |
