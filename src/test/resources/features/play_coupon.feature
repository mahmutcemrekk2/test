Feature: Betting Coupon Play

  Scenario: User plays a betting coupon successfully
    Given The kiosk screen is opened
    When The league and match are selected
    And The bet type and amount are entered
    And The coupon is confirmed
    Then The success message should be displayed
