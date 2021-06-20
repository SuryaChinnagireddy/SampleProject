Feature: feature file to verify the total count of values
  @BalanceVerify

  Scenario: Verify the total value count
    Given the user is logged into the application
    When the user clicks on the page
    And get the values and total balance from the page
    Then verifies the total count oif values