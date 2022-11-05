@tag
Feature: Calculate the insurance prime for a customer
 
  @tag1
  Scenario: The customer is famale 
    Then Substract $200 from the base insurance
    given sex is female
    When Calculate the premium
    Then Substract $200 from the base insurance
 
  @tag2
  Scenario Outline: The customer is younger than 18 years olf
    Given Is "age"
    When Calculate the premiun
    Then should be told "message"
 
    Examples: 
      | age  | message | 
      | 0 |     cant have insurance | 
      | 17 |     cant have insurance | 
      | 18 |     can have insurance | 
      
      
      
