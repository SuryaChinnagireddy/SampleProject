Feature: feature file to verify the format of the balance

  @FormatVerify

  Scenario: Verify the values are formatted as currencies

    Given the user is logged into the application
    When the user clicks on the page
    And get the values and total balance from the page
    Then verify the format of the balance