package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
        AmazonPage amazonPage = new AmazonPage();

    @Given("Kullanici amazon anasayfasinda")
    public void kullanici_amazon_anasayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }
    @Then("Kullanici Nutella icin arama yapar")
    public void kullanici_nutella_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
    }
    @Then("Sonuclarin Nutella icerdigini test eder")
    public void sonuclarin_nutella_icerdigini_test_eder() {
    String arananKelima = "Nutella";
    String actualaramaSonucElementi = amazonPage.aramaSonucu.getText();
        Assert.assertTrue(actualaramaSonucElementi.contains(arananKelima));
    }

    @Then("sayfayi  kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();

    }
    @Then("Kullanici Java icin arama yapar")
    public void kullanici_java_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Java",Keys.ENTER);
    }

    @Then("Sonuclarin Java icerdigini test eder")
    public void sonuclarin_java_icerdigini_test_eder() {
        String arananKelima = "Java";
        String actualaramaSonucElementi = amazonPage.aramaSonucu.getText();
        Assert.assertTrue(actualaramaSonucElementi.contains(arananKelima));
    }

    @And("Kullanici Iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Iphone"+ Keys.ENTER);
    }

    @Then("Sonuclarin Iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        String arananKelima = "Iphone";
        String actualaramaSonucElementi = amazonPage.aramaSonucu.getText();
        Assert.assertTrue(actualaramaSonucElementi.contains(arananKelima));
    }


    @Given("Kullanici {string} anasayfasinda")//amazonUrl
    public void kullanici_anasayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));


    }
    @Given("url'in {string} icerdigini test eder")
    public void url_in_icerdigini_test_eder(String istenenKelime) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenKelime));
    }
    @Then("Kullanici {int} saniye bekler")
    public void kullanici_saniye_bekler(Integer istenenSaniye) {

        try {
            Thread.sleep(istenenSaniye*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
