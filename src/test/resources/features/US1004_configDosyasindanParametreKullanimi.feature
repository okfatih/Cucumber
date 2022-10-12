Feature: US1004 Kullanici paramatre ile config file ı kullanabilmeli


  @config
    @tech
  Scenario: TC07 configuration properties dosyasindan parametre kullanimi
    Given Kullanici "techProUrl" anasayfasinda
    Then Kullanici 3 saniye bekler
    And  url'in "techproeducation" icerdigini test eder
    Then sayfayi  kapatir
    @tech
    Scenario: TC08
      Given  Kullanici "feysbuka"  anasayfasinda
      Then   Kullanici 5 saniye bekler
      And    url'in "facebook"  icerdigini test eder
      Then  sayfayi  kapatir