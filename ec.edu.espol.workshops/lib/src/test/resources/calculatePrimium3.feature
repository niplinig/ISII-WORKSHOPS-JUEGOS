@tag
Feature: Calculate the insurance prime for a customer
 
  @tag1
  Scenario: The customer is male, and is younger than 25 and it isn't married
    Given Is a single young man
    When Calculate the premiun
    Then Add $1500 from the base insurance
 
  @tag2
  Scenario Outline: The customer is male, and is younger than 25 and it isn't married
    Given Is a single young man
    When Calculate the premiun
    Then Add $1500 from the base insurance
 
    Examples: 
      | name  |age | sex | married | status  |
      | name1 |23 | M |  n | success |
      | name2 |35 | M |  y | Fail    |
