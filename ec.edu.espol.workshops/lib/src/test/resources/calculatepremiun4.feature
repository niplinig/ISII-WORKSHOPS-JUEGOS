
@tag
Feature: Calculate the insurance prime for a customer
 
  @tag1
  Scenario: The customer is married 
    Then Substract $200 from the base insurance
    given married is true
    When Calculate the premium
    Then Substract $200 from the base insurance
 
  @tag2
  Scenario Outline: The customer is married
    Given Is "married"
    When Calculate the premiun
    Then Substract "money" from the base insurance
 
    Examples: 
      | married  | money |
      | true |     200 |
      | false |     0 |
      
  