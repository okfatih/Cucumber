Feature: US1004 Kullanici paramatre ile config file ı kullanabilmeli



    @pr1
  Scenario: TC07 configuration properties dosyasindan parametre kullanimi
    Given Kullanici "techProUrl" anasayfasinda
    Then Kullanici 3 saniye bekler
    And  url'in "techproeducation" icerdigini test eder
    Then sayfayi  kapatir

    Scenario: TC08
      Given  Kullanici "feysbuka"  anasayfasinda
      Then   Kullanici 5 saniye bekler
      And    url'in "facebook"  icerdigini test eder
      Then  sayfayi  kapatir