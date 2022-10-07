Feature: Amazon Search Eng
  Scenario: T1 User does a search
    Given User goes to AmazonWebPage
    Then User searches the word Nutella
    Then User checks if the results contain Nutella
    And  User closes webpage