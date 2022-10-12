Feature: US1003 User should be able to search using parameters

  Background: ortak adim
    Given User goes to AmazonWebPage
  @parametre
  Scenario: TC06 User can do a search with parameter

    And   User searches the word "Java"
    And   User checks if the results contain "Java"
    Then User closes webpage

  Scenario: TC07 User can do a search with parameter

    And   User searches the word "Nike"
    And   User checks if the results contain "Nike"
    Then User closes webpage