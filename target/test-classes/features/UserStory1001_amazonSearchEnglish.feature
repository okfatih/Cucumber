Feature: US1001 User can do a search in AmazonWeb Page

  Scenario: T1 User does a search
    Given User goes to AmazonWebPage
    Then User searches the word Nutella
    Then User checks if the results contain Nutella
    And  User closes webpage

    Scenario: T2 User searches the word Java
      Given User goes to AmazonWebPage
      Then User searches the word Java
      Then User checks if the results contain Java
      And  User closes webpage
