Feature: This feature is created to verify the scenarios for Office backpack feature

  Scenario: This scenario verifies the number of pockets in Office backpack
    Given when user launches backpacks application
    When user clicks on "Office backpack" link from the homepage
    When office backpack details are displayed
    Then office backpack is displayed wih number of pockets as 4
