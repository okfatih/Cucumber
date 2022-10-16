package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.Driver;

public class FacebookStepDefinitions {
    @Given("Kullanici {string}  anasayfasinda")
    public void kullanici_anasayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));

    }
    @Then("url'in {string}  icerdigini test eder")
    public void url_in_icerdigini_test_eder(String string) {
        String actualUrl =Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("facebook"));
    }




    @Then("User verifies url contains {string}")
    public void userVerifiesUrlContains(String arananKelime) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(arananKelime));

    }

    @Given("User goes  {string}")
    public void userGoes(String istenenWebSitesi) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenWebSitesi));
    }


    @Then("User waits for {int} seconds")
    public void userWaitsForSeconds(int saniye) {

        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
    @Then("Kullanici {int} saniye bekler")
    public void kullanici_saniye_bekler(Integer istenenSaniye) {

        try {
            Thread.sleep(istenenSaniye*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

 */