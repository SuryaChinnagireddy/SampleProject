Feature: feature file to verify the total balance
  @BalanceVerify

  Scenario: Verify the total balance matches with sum of values
    Given the user is logged into the application
    When the user clicks on the page
    And get the values and total balance from the page
    Then verifies whether the values matches