@tag
Feature: TC1
 
  @tag1
  Scenario: Insurence base price
    Given Is the customer is a "<sex>"
    And Is "<age>" years old
    And Is "<married>"
    And Has license number "<licenseNumber>"
    When Calculate the insurance
    Then The insurance will cost "<insurance>"
    Examples:
        | sex | age | married | licenseNumber | insurance |
        | M | 20 | n | 0957303426 | 2000 |
        | M | 26 | n | 0957303426 | 500 |
        | F | 46 | y | 0957303426 | 200 |