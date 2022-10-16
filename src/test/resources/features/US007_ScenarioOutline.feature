Feature: US007 Scenario Outline

  Scenario Outline: TC01 ConfigReader ile Scenario Outline kullanim
    Given User goes  "<searchedUrl>"

    Then  User waits for 1 seconds
    Then  User verifies url contains "<searchedWord>"
    And  User closes webpage
    Examples:
      | searchedUrl | searchedWord   |
      | techProUrl  | techpro        |
      | facebookUrl | facebook       |
      | blueCars    | bluerentalcars |


