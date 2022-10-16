package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelStepDefinition {
    Workbook wb;
    @Given("User can make Excel File useable")
    public void user_can_make_excel_file_useable() throws IOException {
        String dosyaYolu = "src/test/resources/ulkeler.xlsx";
        FileInputStream fis = new FileInputStream(dosyaYolu);
        wb = WorkbookFactory.create(fis);
    }

    @Then("{int}.satirdaki {int}. hucreyi yazdirir")
    public void satirdaki_hucreyi_yazdirir(Integer satir, Integer sutun) {
        String istenenHucreYazisi = wb.getSheet("Sayfa1")
                .getRow(satir-1)
                .getCell(sutun-1)
                .toString();
        System.out.println("Satir: " + satir + ", Sutun: " + sutun + ", Sutundaki deger: " + istenenHucreYazisi);

    }

    @Then("baskenti Jakarta olan ulke ismini yazdirir")
    public void baskenti_jakarta_olan_ulke_ismini_yazdirir() {
        /*
        For loop ile tüm satirlari kontorl et
        Satir sayisina ihtiyacım var.
         */
        int satirSayisi = wb.getSheet("Sayfa1").getLastRowNum();
        for (int i = 0; i <=satirSayisi ; i++) {
         if (wb.getSheet("Sayfa1").getRow(i).getCell(1).toString().equals("Jakarta")){
             System.out.println("Baskenti Jakarta olan ulke: " +
                     wb.getSheet("Sayfa1").getRow(i).getCell(0));
         }

        }
        for (int i = 0; i <=satirSayisi; i++) {
            if (wb.getSheet("Sayfa1").getRow(i).getCell(1).toString().equals("Rabat")){
                System.out.println("Country woose captial is Rabat: " + wb.getSheet("Sayfa1").getRow(i).getCell(0));
            }

        }

    }

    @Then("ulke sayisinin {int} oldugunu test eder")
    public void ulke_sayisinin_oldugunu_test_eder(Integer ulkeSayisi) {
        int ActualulkeSayisi = wb.getSheet("Sayfa1").getLastRowNum();
        Assert.assertTrue(ulkeSayisi==ActualulkeSayisi);

    }

    @And("Fiziki olarak kullanilan satir sayisinin {int} oldugunu test eder")
    public void fizikiOlarakKullanilanSatirSayisininOldugunuTestEder(int fizikiKullanilanSatir) {
        int actualFizikiKullanilanSatir =wb.getSheet("Sayfa1").getPhysicalNumberOfRows();
        Assert.assertTrue(fizikiKullanilanSatir==actualFizikiKullanilanSatir);

    }

    @Then("{int}. satir {int}. sutundaki bilgiyi yazdirir")
    public void satir_sutundaki_bilgiyi_yazdirir(Integer satir, Integer sutun) {
        String istenenHucreYazisi = wb.getSheet("Sayfa1")
                .getRow(satir-1)
                .getCell(sutun-1)
                .toString();
        System.out.println(satir+ ".satirdaki ve "+ sutun +". sutundaki yer= "+istenenHucreYazisi);

    }


}
