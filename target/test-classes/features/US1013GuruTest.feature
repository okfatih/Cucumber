Feature: US1013 WebTablosundaki istenen sutunu yazdirma
  @guru
  Scenario: TC16 Kullanici sutun basligi il tum degerleri alabilmeli

    Given User goes  "guruUrl"
    And   User waits for 3 seconds
    Then  if asked accepts cookies
    And    User gets all values printed under the "Prev Close (Rs)"

