Feature: US007 Scenario Outline

  Scenario Outline: TC01 ConfigReader ile Scenario Outline kullanim
    Given User goes  "<searchedUrl>"

    Then  Kullanici 1 saniye bekler
    Then  User verifies url contains "<searchedWord>"
    And  User closes webpage
    Examples:
      | searchedUrl | searchedWord   |
      | techProUrl  | techpro        |
      | facebookUrl | facebook       |
      | blueCars    | bluerentalcars |


