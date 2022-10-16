package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPracticePage {
    public AutomationPracticePage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy (xpath = "//a[@class='login']")
    public WebElement signinButtonu;

    @FindBy (xpath = "//input[@id='email_create']")
    public WebElement emailKutusu;

    @FindBy (xpath = "//div[@class='submit']")
    public WebElement emailSubmit;

    @FindBy (xpath = "//div[@id='uniform-id_gender1']")
    public WebElement genderMale;

    @FindBy (xpath = "//*[@id='customer_firstname']")
    public WebElement firstName;

    @FindBy (xpath = "//*[@id='customer_lastname']")
    public WebElement lastName;

    @FindBy (xpath = "//*[@id='passwd']")
    public WebElement passWord;

    @FindBy (xpath = "//*[@id='company']")
    public WebElement company;

    @FindBy (xpath = "//*[@id='address1']")
    public WebElement address;

    @FindBy (xpath = "//*[@id='address2']")
    public WebElement address2;

    @FindBy (xpath = "//*[@id='city']")
    public WebElement city;

    @FindBy (xpath = "//*[@id='id_state']")
    public WebElement state;

    @FindBy (xpath = "//*[@id='postcode']")
    public WebElement postCode;

    @FindBy (xpath = "//*[@id='phone']")
    public WebElement phone;

    @FindBy(xpath = "//*[@id='submitAccount']")
    public WebElement registerButton;

    @FindBy (xpath = "//p[@class='info-account']")
    public WebElement successCreateAccount;



}
