Feature:Us1010 BlueRentaCarNegativeTest

  Scenario Outline: TC01 Scenario OutLine ile negative test
    Given User goes  "blueCars"
    Then  kullanici bluerentacar ana sayfasinda
    Then  Login yazisina tiklar
    Then  "<gecersiz username>" girer

    And   "<gecersizPassword>" sifre girer
    Then  Login butonuna basar
    Then User closes webpage
    Examples:
      | gecersiz username | gecersizPassword |
      | Manager5          | sadasd1          |
      | Manager6          | gsadas2          |
      | Manager7          | gsadas3          |