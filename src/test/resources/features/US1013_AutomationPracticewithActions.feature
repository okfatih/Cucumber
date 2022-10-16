Feature:US1013 User could register
@aut
  Scenario: TC17 User should be able to register with the correct credentials

    Given User goes  "automationUrl"
    And   User click on sign in link
    And   User enters his or her email address on create an account part
    And   User  enters his credentials
    And   User clicks on register button
    Then  User verifies that account has been created
    And   User closes webpage