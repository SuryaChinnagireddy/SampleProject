Feature: feature file to verify balance greater than zero
  @BalanceVerify

  Scenario: Verify the value is greater than zero
    Given the user is logged into the application
    When the user clicks on the page
    And get the values and total balance from the page
    Then verify the value is greater than zero