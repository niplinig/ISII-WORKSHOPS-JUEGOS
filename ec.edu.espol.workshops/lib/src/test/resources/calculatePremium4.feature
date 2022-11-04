@tag
Feature: Calculate the insurance prime for a customer
 
  @tag1
  Scenario: The customer dosen't have licensed
    Given The company obeys the national laws
    When Calculate the premiun
    Then Show a message of error
 
  @tag2
  Scenario Outline: The customer dosen't have licensed
    Given The company obeys the national laws
    When Calculate the premiun
    Then Show a message of error
 
    Examples: 
      | name  |licensed| status  |
      | name1 | y | success |
      | name2 | n | Fail    |