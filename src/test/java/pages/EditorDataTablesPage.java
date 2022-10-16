package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EditorDataTablesPage {
    public EditorDataTablesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

     @FindBy (xpath = "//button[@class='dt-button buttons-create']")
     public WebElement newButton;

    @FindBy (xpath = "//*[text()='Create']")
    public WebElement createButton;

    @FindBy (xpath = "//*[@id='DTE_Field_first_name']")
    public WebElement firstName;

    @FindBy (xpath = "//*[@id='DTE_Field_last_name']")
    public WebElement LastName;

    @FindBy (xpath = "//*[@id='DTE_Field_position']")
    public WebElement position;

    @FindBy (xpath = "//*[@id='DTE_Field_office']")
    public WebElement office;

    @FindBy (xpath = "//*[@id='DTE_Field_extn']")
    public WebElement exension;

    @FindBy (xpath = "//*[@id='DTE_Field_start_date']")
    public WebElement startDate;

    @FindBy (xpath = "//*[@id='DTE_Field_salary']")
    public WebElement salary;

    @FindBy (xpath = "//input[@type='search']")
    public WebElement search;

    @FindBy (xpath = "//td[@class='sorting_1']")
    public WebElement aramaSonucilkElement;

}
