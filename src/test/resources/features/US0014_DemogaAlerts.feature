Feature:US014

  Scenario:

    Given  User goes  "demoUrl"

    And    User  clicks Alerts

    And    User clicks  On button click, next to click me button
    Then   User waits until Alert is visible
    And   User verifies that   “This alert appeared after five seconds” text