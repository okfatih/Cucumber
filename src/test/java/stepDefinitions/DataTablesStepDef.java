package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.EditorDataTablesPage;
import utilities.ConfigReader;
import utilities.Driver;

public class DataTablesStepDef {
    EditorDataTablesPage dataTablesPage = new EditorDataTablesPage();
    Faker faker = new Faker();
    @When("User is on {string}")
    public void userIsOn(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @Then("User clicks on New Button")
    public void userClicksOnNewButton() {
        dataTablesPage.newButton.click();
        
    }
    @And("User enters {string} for name")
    public void userEntersForName(String firstName) {
        dataTablesPage.firstName.sendKeys(firstName);
    }

    @And("User enters {string} for last name")
    public void userEntersForLastName(String surname) {
        dataTablesPage.LastName.sendKeys(surname);
    }
   

    @And("User enters {string} for position")
    public void userEntersForPosition(String position) {
        dataTablesPage.position.sendKeys(position);
    }

    @And("User  enters {string} for office")
    public void userEntersForOffice(String office) {
        dataTablesPage.office.sendKeys(office);
    }

    @And("User enter {string} for extension")
    public void userEnterForExtension(String ext) {
        dataTablesPage.exension.sendKeys(ext);
    }

    @And("User enters {string} for start-date")
    public void userEntersForStartDate(String stardate) {
        dataTablesPage.startDate.sendKeys(stardate);
    }

    @And("User enters {string} for Salary")
    public void userEntersForSalary(String salary) {
        dataTablesPage.salary.sendKeys(salary);
    }

    @And("User cliks on create button")
    public void userCliksOnCreateButton() {
        dataTablesPage.createButton.click();
    }

    @When("user searches with the {string}")
    public void userSearchesWithThe(String firstName) {
        dataTablesPage.search.sendKeys(firstName);

    }

    @Then("user validates {string} on the Names part")
    public void userValidatesOnTheNamesPart(String firstName) {
        Assert.assertTrue(dataTablesPage.aramaSonucilkElement.getText().contains(firstName));
    }




}
