Feature: String based calculator

  Scenario: Adding two numbers
    Given that the String Calculator is initialized
    When I input the string "3,4"
    Then the result should show 7