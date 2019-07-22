Feature: search the product
  @smoke
  Scenario: search the product to buy
    Given user is on home page
    When user search for product
    Then user can see respective products

    @department
    Scenario: search products under selected department
      Given user search for product
      Given user can see respective products
      When user select a department from filter
      Then user can see all products reletive to selcted department

      @starrating
      Scenario: user want to search the product from customer rating
        Given user is on home page
        And user search for product
        And user can see respective products
        When user select a customer rating from filter
        Then user can able to see all products under selected ratings