Feature: US1013 Data tables sitesinde 5 farkli data girisi

  Scenario Outline: TC01 DataTables Kayit girisi testi
    When User is on "dataTablesUrl"
    Then User clicks on New Button
    And  User enters "<firstName>" for name
    Then User waits for 1 seconds
    And  User enters "<lastName>" for last name
    Then User waits for 1 seconds
    And   User enters "<postion>" for position
    Then User waits for 1 seconds
    And  User  enters "<office>" for office

    And  User enter "<extension>" for extension

    And  User enters "<Start-Date>" for start-date

    And  User enters "<salary>" for Salary
    And  User cliks on create button

    When  user searches with the "<firstName>"
    Then  user validates "<firstName>" on the Names part
    And   User closes webpage
    Examples:
      | firstName | lastName | postion | office   | extension | Start-Date | salary |
      | Raci      | Takmaz   | post    | Ber      | UI        | 2023-10-11 | 15000  |
      | Faruk     | Bayindir | tost    | Amst     | QA        | 2023-09-11 | 4000   |
      | Ersan     | Kochali  | cost    | Ist      | amele     | 2023-08-11 | 5000   |
      | Teyfik    | Sari     | cart    | HongKong | takTuk    | 2023-07-12 | 20000  |