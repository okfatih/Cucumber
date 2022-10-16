package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class FacebookNegativeTestStepDef {

    FacebookPage fbp = new FacebookPage();
    Faker faker = new Faker();
    @Then("User accept cookies")
    public void userAcceptCookies() {
        fbp.cookies.click();

    }
    @Then("User enters wrong {string}")
    public void userEntersWrong(String arg0) {
        fbp.email.sendKeys(faker.internet().emailAddress());
    }

    @And("User enters wrong pass {string}")
    public void userEntersWrongPass(String arg0) {
        fbp.password.sendKeys(faker.internet().password());
    }


    @Then("User click on login button")
    public void userClickOnLoginButton() {
        fbp.loginButton.click();
    }

    @And("User seer forgetPass text")
    public void userSeerForgetPassText() {
        Assert.assertTrue(fbp.forgetPasswordUyarisi.isDisplayed());
    }



}
