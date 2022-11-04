@tag
Feature: Calculate the insurance prime for a customer
 
  @tag1
  Scenario: The customer is famale 
    Then Substract $200 from the base insurance
    given sex is female
    When Calculate the premium
    Then Substract $200 from the base insurance
 
  @tag2
  Scenario Outline: The customer is female
    Given Is <sex>
    When Calculate the premiun
    Then Substract <money> from the base insurance
 
    Examples: 
      | sex  | money | status  |
      | female |     200 | success |
      | masculine |     0 | fail    |
      
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
    Given Is <married>
    When Calculate the premiun
    Then Substract <money> from the base insurance
 
    Examples: 
      | married  | money | status  |
      | true |     200 | success |
      | false |     0 | fail    |
      
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
    Given Is age
    When Calculate the premiun
    Then should be told <message>
 
    Examples: 
      | age  | message | status  |
      | 0 |     cant have insurance | fail |
      | 17 |     cant have insurance | fail |
      | 18 |     can have insurance | success |
      
      
      
