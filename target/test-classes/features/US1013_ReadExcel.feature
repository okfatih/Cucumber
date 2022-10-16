Feature: US1013 User accesses tje excel table
@excel
  Scenario: TC18 User can use the excel

    Given User can make Excel File useable

    Then 1.satirdaki 2. hucreyi yazdirir

    And  baskenti Jakarta olan ulke ismini yazdirir

    And  ulke sayisinin 190 oldugunu test eder

    And  Fiziki olarak kullanilan satir sayisinin 191 oldugunu test eder

    Then 3. satir 2. sutundaki bilgiyi yazdirir

  And User closes webpage