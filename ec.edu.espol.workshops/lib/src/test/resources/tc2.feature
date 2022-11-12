@tag
Feature: Calculate the insurance for a customer
 
  @tag1

  Scenario: The customer is female
    Given Is a female person
    When Calculate the insurance
    Then The insurance will cost "300"