@Smoke @Regression
Feature: Luma application Login function
  description: acceptance criteria test should pass

  @LP-18 @Positive
  Scenario: Check login with valid credential
    Given Go to application URL
    When click sign in button
    And put valid user
    And put valid password
    And click sign in
    Then check sign out button
