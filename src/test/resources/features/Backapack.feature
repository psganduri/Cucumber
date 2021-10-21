Feature: Backpack Feature
  In order to test Backpack Feature
  As user launches Backpack application
  I want to verify backpack details are displayed correctly

  Background:
    Given when user launches Backpack application
    And when user is on homepage

  Scenario: This scenario verifies that user is able to login to backpack application
    Given when user clicks on "SignIn" button
    When user enters valid "valid@user.com" in username txtbox
    And  user enters valid "passw0rd" in password txtbox
    And user clicks on "login" button
    Then user should be navigated to welcome page

  Scenario: This scenario verifies number of pockets displayed in Office backpack
    Given when user clicks on "Welcome to backpacks"
    When backapacks page is displayed
    And user clicks on "Men" button
    And user clicks on "Office backback" button
    Then user is displayed with "Office back" page is displayed
    And Number of pockets in office laptop are 8

  Scenario Outline: This scenario verifies backpack types displayed on backpacks page as a anonymous user
    Given when user clicks on Welcome to backpacks
    When backapacks page is displayed
    Then backpacks page should have <Backpacks>
    Examples:
      | Backpacks |
      | Kids      |
      | Men       |
      | Women     |
      | Unisex    |
      | Designer  |

    Scenario Outline: This scenario verifies backpack sizes displayed for each backpack type
      Given when user clicks on Welcome to backpacks
      When backapacks page is displayed
      And user clicks on <Backpacks>
      Then user is displayed with backpack <Sizes>
      Then
      Examples:
        | Backpacks |Sizes|
        | Kids      |Small|
        | Men       |Medium|
        | Women     |Large|
        | Unisex    |     |
        | Designer  |     |






