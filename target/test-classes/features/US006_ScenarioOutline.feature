Feature: US006 Kullanici Amazonda istedigi kelimeleri aratir

  Scenario Outline: TC001 Kullanici istedigi kelimeleri aratir
    Given User goes to AmazonWebPage

    Then  User searches the word "<istenenKelime>"
    And   User checks if the results contain "<istenenKelimeKontol>"

    And   User closes webpage
    Examples:
      | istenenKelime | istenenKelimeKontol |
      | Nutella       | Nutella             |
      | SQL           | SQL                 |
      | Java          | Java                |
#TestNg deki data provider kullanımıdaki gibi Cucumberda Scenario Outline kullaniriz


