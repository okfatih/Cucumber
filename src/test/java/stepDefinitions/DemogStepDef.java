package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemogaPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class DemogStepDef {
    DemogaPage demogaPage = new DemogaPage();
    Actions actions = new Actions(Driver.getDriver());
    @And("User  clicks Alerts")
    public void userClicksAlerts() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        demogaPage.alerts.click();
    }

    @And("User clicks  On button click, next to click me button")
    public void userClicksOnButtonClickNextToClickMeButton() {
        demogaPage.timerAlert.click();
    }

    @Then("User waits until Alert is visible")
    public void userWaitsUntilAlertIsVisible() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.alertIsPresent());

    }

    @And("User verifies that   “This alert appeared after five seconds” text")
    public void userVerifiesThatThisAlertAppearedAfterFiveSecondsText() {

        String alertYazisi = Driver.getDriver().switchTo().alert().getText();
        String expectedAlertYazisi = "This alert appeared after 5 seconds";
        Assert.assertEquals(expectedAlertYazisi,alertYazisi);

    }


}
