Feature: This feature is created to verify table data
  Scenario Outline: This scenario verifies data in HTML table on w3schools website
    Given w3schools application is launched successfully
    When HTML table is displayed
#    Then data in HTML table is displayed as below
    Examples:
    |Company|Contact|Country|
    |Alfreds Futterkiste	|Maria Anders	|Germany|
    |Centro comercial Moctezuma	|Francisco Chang	|Mexico|
    |Ernst Handel	|Roland Mendel	|Austria|
