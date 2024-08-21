@smoke
Feature: Forget Password

  Scenario Outline: User Forgets their password and requests a reset
    Given User Add his "<Email>"
    When  The user send a POST request with the credentials
    Then  The response status should be 200

    Examples:
      |Email|
      |Ahmed50@grr.la|


  Scenario Outline: User add an Email does not exist
    Given User Add his "<Email>"
    When  The user send a POST request with the credentials
    Then  The response status should be 400

    Examples:
      |Email|
      |Ahmed501@grr.la|


  Scenario Outline: User add an invalid Email
    Given User Add his "<Email>"
    When  The user send a POST request with the credentials
    Then  The response status should be 400

    Examples:
      |Email|
      |Ahmed50grr.la|

  Scenario Outline: User add empty Email
    Given User Add his "<Email>"
    When  The user send a POST request with the credentials
    Then  The response status should be 400

    Examples:
      |Email|
      ||

