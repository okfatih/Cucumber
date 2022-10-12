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


    @Then("User goes to {string}")
    public void userGoesTo(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
    }

    @Then("User verifies url contains {string}")
    public void userVerifiesUrlContains(String arananKelime) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(arananKelime));

    }

    @Given("User goes  {string}")
    public void userGoes(String istenenWebSitesi) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenWebSitesi));
    }
}
