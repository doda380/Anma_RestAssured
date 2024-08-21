@smoke
Feature: Beneficiary User Login

  Scenario Outline: Verify that the Beneficiary user can Login successfully
    Given User Add a valid "<UserName>" & "<Password>"
    When  The user sends a POST request with the credentials
    Then  The Response body will return the token
    And   The Response body will return the HasOrderFree
    And   The Response body will return the UserType

    Examples:
      |UserName| Password|
      |Ahmed50|Ahmed50#|

  Scenario Outline: Unsuccessful login with invalid credentials
    Given User Add a valid "<UserName>" & "<Password>"
    When  The user sends a POST request with the credentials
    Then the response status should be 400
    Examples:
      | UserName | Password |
      |Ahmeddd50|Ahmed500#|


  Scenario Outline: Login with missing username
    Given User Add a valid "<UserName>" & "<Password>"
    When  The user sends a POST request with the credentials
    Then the response status should be 400
    Examples:
      | UserName | Password |
      ||Ahmed50#|

  Scenario Outline: Login with missing username
    Given User Add a valid "<UserName>" & "<Password>"
    When  The user sends a POST request with the credentials
    Then the response status should be 400
    Examples:
      | UserName | Password |
      |Ahmed50||