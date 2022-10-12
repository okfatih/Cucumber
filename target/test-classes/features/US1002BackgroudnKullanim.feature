@wip
Feature: US1002 Kullanici ortak adimlari background ile calistirir
  Background: ortak adim
    Given Kullanici amazon anasayfasinda

    Scenario: TC04 amazon nutella arama
      And Kullanici Nutella icin arama yapar
      Then Sonuclarin Nutella icerdigini test eder
      Then sayfayi  kapatir

      Scenario: TC05 amazon java arama
        And Kullanici Java icin arama yapar
        And Sonuclarin Java icerdigini test eder
        And sayfayi  kapatir