Feature: BuyProduct

  @BuyProduct
  Scenario: Add Laptop to Car
    Given User selects laptop category
    When User selects first laptop on the list
    And User add product to car
    When User close the alert message
    And User goes to Car section
    Then Product is added to car
