package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;

public class AmazonEngSearchStepDefinitions {
    AmazonPage amazonPage = new AmazonPage();
    @Given("User goes to AmazonWebPage")
    public void user_goes_to_amazon_web_page() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }
    @Then("User searches the word Nutella")
    public void user_searches_the_word_nutella() {
    amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
    }
    @Then("User checks if the results contain Nutella")
    public void user_checks_if_the_results_contain_nutella() {
        String arananKelime = "Nutella";
        String actualaramaSonucElementi = amazonPage.aramaSonucu.getText();
        Assert.assertTrue(actualaramaSonucElementi.contains(arananKelime));
    }
    @Then("User closes webpage")
    public void user_closes_webpage() {
        Driver.closeDriver();

    }

}
