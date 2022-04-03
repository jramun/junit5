Feature: Basic Arithmetic

  Background: A Cucumber test
    Given Cucumber test is turned on

  Scenario: Addition
    When I add 4 and 5
    Then the result is 9

  Scenario: Subtraction
    When I subtract 7 and 2
    Then the result is 5

  Scenario Outline: Several additions
    When I add <a> and <b>
    Then the result is <c>

    Examples: Single digits
      | a | b | c  |
      | 1 | 2 | 3  |
      | 3 | 7 | 10 |
