
@cross_browser_test
Feature: app_title_verification
  @grid_chrome
  Scenario: TC01_title_on_chrome
    Given user is on the application_url "https://www.bluerentalcars.com/"
    Then verify the page title is "Blue Rental Cars | Cheap, Hygienic, VIP Car Hire"
    Then close the remote driver
    @grid_Edge
    Scenario: TC01_title_on_Edge
      Given user is on the application_url with Edge "https://www.bluerentalcars.com/"
      Then verify the page title is "Blue Rental Cars | Cheap, Hygienic, VIP Car Hire"
      Then close the remote driver

     @grid_Edge
     Scenario: TC01_title_on_Edge
       Given user is on amazon with Edge
       Then  user searches for nutella

