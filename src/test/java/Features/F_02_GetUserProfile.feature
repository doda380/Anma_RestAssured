@smoke
Feature: Get Service provider profile
@ServiceProvider
  Scenario: User should be able to see his profile
    Given The user send a GET request
    Then  The user will be able to see his profile data

  @Beneficiary
  Scenario: User should be able to see the profile data
    Given The user send a GET request with the credentials
    Then  The user will be able to see the profile data


