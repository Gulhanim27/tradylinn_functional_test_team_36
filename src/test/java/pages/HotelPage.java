package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelPage {
    public HotelPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
        @FindBy(xpath="//input[@id='UserName']")
    public WebElement userName;
    @FindBy(xpath="//input[@id='Password']")
    public WebElement password;
    @FindBy(xpath="//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(id="Code")
    public WebElement code;

    @FindBy(id="Name")
    public WebElement name;

    @FindBy(id="Address")
    public WebElement address;


    @FindBy(id = "Phone")
    public WebElement phone;

    @FindBy(id="Email")
    public WebElement email;

    @FindBy(id="IDGroup")
    public WebElement IDGroup;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement butonSubmit;
    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement yaziGoruntusu;
    @FindBy(xpath = "//button[@data-bb-handler='ok']")
    public WebElement ok;
}
