Feature: This feature is created to perform a sanity test with Selenium
  Scenario: Application login
    Given Kmart application is launched on the browser
    When user clicks on "Signin" button on homepage
    And enters valid "username" in usermane txtbox
    And enters valid "password" in password txtbox
    And clicks on "Signin" button
    Then user is logged in sucessfully
