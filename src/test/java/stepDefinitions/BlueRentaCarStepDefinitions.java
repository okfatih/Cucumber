package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BluerentalcarPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BlueRentaCarStepDefinitions {

    BluerentalcarPage brc = new BluerentalcarPage();
    @Given("kullanici bluerentacar ana sayfasinda")
    public void kullanici_bluerentacar_ana_sayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("blueCars"));

    }

    @Then("Login yazisina tiklar")
    public void login_yazisina_tiklar() {
        brc.login.click();
    }

    @Then("gecersiz username girer")
    public void gecersiz_username_girer() {
        brc.login.sendKeys("wrongEmail");
    }

    @Then("gecersiz password girer")
    public void gecersiz_password_girer() {
        brc.pass.sendKeys("wrongPass");
    }

    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
       brc.login2.click();
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfaya_giris_yapilamadigini_kontrol_eder() {
        Assert.assertTrue(brc.failedLogin.isDisplayed());
    }

    @Then("kulllanici sayfayi kapatir")
    public void kulllanici_sayfayi_kapatir() {
      Driver.closeDriver();
    }


    @Then("{string} girer")
    public void girer(String username) {
        brc.login.sendKeys(username);
    }

    @And("{string} sifre girer")
    public void sifreGirer(String sifre) {
        brc.pass.sendKeys(sifre);
    }
}
