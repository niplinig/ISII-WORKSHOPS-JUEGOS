@tag
Feature: Calculate the insurance prime for a customer
 
  @tag1
  Scenario: The customer is older than 45 and younger than 65
    Given Is a middle age person (between 45 and 65 years old)
    When Calculate the premiun
    Then Substract $100 from the base insurance
 
  @tag2
  Scenario Outline: The customer is older than 45 and younger than 65
    Given Is a middle age person (between 45 and 65 years old)
    When Calculate the premiun
    Then Substract $100 from the base insurance
 
    Examples: 
      | name  | age | status  |
      | name1 |     45 | success |
      | name2 |     77 | Fail    |
