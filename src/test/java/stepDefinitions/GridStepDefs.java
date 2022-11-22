package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class GridStepDefs {
    WebDriver driver;
    AmazonPage amazonPage = new AmazonPage();

    @Given("user is on the application_url {string}")
    public void user_is_on_the_application_url(String url) throws MalformedURLException {

        driver = new RemoteWebDriver(new URL("http://192.168.2.4:4444"), new ChromeOptions());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(url);


    }

    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String pageTitle) {
        String actualtitle = driver.getTitle();

        assertEquals("titles not match", pageTitle, actualtitle);


    }

    @Then("close the remote driver")
    public void close_the_remote_driver() {
        driver.quit();

    }

    @Given("user is on the application_url with Edge {string}")
    public void userIsOnTheApplication_urlWithEdge(String url) throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://192.168.2.4:4444"), new EdgeOptions());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(url);

        //Bunu SeleniumGrid için ayrıca oluşturdum



    }

    @Given("user is on amazon with Edge")
    public void userIsOnAmazonWithEdge() throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://192.168.2.4:4444"), new EdgeOptions());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
    }


    @Then("user searches for nutella")
    public void userSearchesForNutella() {
        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
    }
}