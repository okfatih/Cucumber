Feature:US1012 Facebook parametre ile negative kullanim testi

  Scenario Outline: TC01 Negative Test
    Given User goes  "facebookUrl"
    Then User accept cookies
    And  User waits for 1 seconds
    Then User enters wrong "<email>"
    And User enters wrong pass "<pass>"
    And  User waits for 1 seconds
    Then User click on login button
    And  User waits for 1 seconds
    And  User seer forgetPass text
    Then User closes webpage
    Examples:
      | email | pass |
      | email | pass |
      | email | pass |



