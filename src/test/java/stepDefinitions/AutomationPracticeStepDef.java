package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPracticePage;
import utilities.Driver;

public class AutomationPracticeStepDef {
    AutomationPracticePage aut = new AutomationPracticePage();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();
    @And("User click on sign in link")
    public void userClickOnSignInLink() {
        aut.signinButtonu.click();
    }

    @And("User enters his or her email address on create an account part")
    public void userEntersHisOrHerEmailAddressOnCreateAnAccountPart() {
        aut.emailKutusu.sendKeys(faker.internet().emailAddress(),Keys.ENTER);

    }

    @And("User  enters his credentials")
    public void userEntersHisCredentials() {
        actions.sendKeys(Keys.TAB).perform();
        actions.click(aut.genderMale)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys("10")
                .sendKeys(Keys.TAB)
                .sendKeys("January")
                .sendKeys(Keys.TAB)
                .sendKeys("2000")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)

                .sendKeys(faker.company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().buildingNumber())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().city())
                .sendKeys(Keys.TAB)
                .sendKeys("Alaska")
                .sendKeys(Keys.TAB)
                .sendKeys("99801")
                .sendKeys(Keys.TAB)
                .sendKeys("United States")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).perform();





    }

    @And("User clicks on register button")
    public void userClicksOnRegisterButton() {
        aut.registerButton.click();
    }

    @Then("User verifies that account has been created")
    public void userVerifiesThatAccountHasBeenCreated() {
        Assert.assertTrue(aut.successCreateAccount.isDisplayed());
    }



}
