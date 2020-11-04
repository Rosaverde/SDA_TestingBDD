Feature: As a user I want to use a calculator to divide numbers
  so that I don't need to calculate in manually
  Scenario: Divide two numbers 6 & 3
    Given I have a calculator
    When I divide 6.0 by 3.0
    Then the result should be 2.0

  Scenario Outline: Divide two numbers a & b
    Given I have a calculator
    When I divide <v1> by <v2>
    Then the result should be <result>
    Examples:
      | v1 | v2 | result |
      | 6.0| 3.0| 2.0    |
      |10.0|2.0 |5.0     |
      |50.0|10.0|5.0     |

  Scenario: Divide by 0
    Given I have a calculator
    When I divide 6.0 by 0.0
    Then the error message "cannot divide by 0!" should appear