
@tumu
Feature: US1001 Kullanici Amazon Sayfasinda arama yapar
  @nutella @ikisi
  Scenario: TC01 Kullanici amazonda kelime aratır

    Given Kullanici amazon anasayfasinda
    Then Kullanici Nutella icin arama yapar
    Then Sonuclarin Nutella icerdigini test eder
    And sayfayi  kapatir

  @java @ikisi
    Scenario: TC02 Kullanici amazonda Java aratır
      Given Kullanici amazon anasayfasinda
      Then Kullanici Java icin arama yapar
       Then Sonuclarin Java icerdigini test eder
      And sayfayi  kapatir
      @iphone
      Scenario: TC03 Kullanici Iphone aratir
        When Kullanici amazon anasayfasinda
        And Kullanici Iphone icin arama yapar
        Then Sonuclarin Iphone icerdigini test eder
        And sayfayi  kapatir