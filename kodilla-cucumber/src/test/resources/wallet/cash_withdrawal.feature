Feature: Cash Withdrawal
  Scenario: Successful withdrawal from wallet in credit
    Given I have deposited $200 in my wallet
    When I requested $30
    Then $30 should be dispensed

  Scenario: Failed withdrawal from wallet in credit with not enough money
    Given I have deposited $400 in my wallet
    When I requested $500
    Then I should get balance $400
    
    
  Scenario: Failed withdrawal from wallet in credit with zero balance
    Given I have deposited $0
    When  I have requested $50
    Then  I should get balance $0"

    Scenario: Successful withdrawal from wallet in credit total amount of money
      Given I have deposited $500 in my wallet
      When  I have requested $500
      Then  $500 should be dispensed
