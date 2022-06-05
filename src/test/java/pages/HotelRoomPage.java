package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelRoomPage {
    public HotelRoomPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath="//input[@id='UserName']")
    public WebElement userName1;
    @FindBy(xpath="//input[@id='Password']")
    public WebElement password1;
    @FindBy(xpath="//button[@type='submit']")
    public WebElement submitButton1;
    @FindBy(xpath="//div[@class='actions']")
    public WebElement addButonu;
    @FindBy(xpath="(//select[@class='form-control input-lg required'])[1]")
    public WebElement selectHotel;

    @FindBy(xpath = "//input[@id='Code']")
    public WebElement code1;
    @FindBy(xpath = "//input[@id='Name']")
    public WebElement name1;
    @FindBy(xpath = "//input[@id='Location']")
    public WebElement location1;
    @FindBy(xpath = "//textarea[@dir='ltr']")
    public WebElement yaziPaneli;


    @FindBy(xpath = "//li[@data-id='500']")
    public WebElement besYuz;
    @FindBy(xpath = "//input[@id='Price']")
    public WebElement priceButton;
    @FindBy(xpath = "//select[@id='IDGroupRoomType']")
    public WebElement selectRoom;

    @FindBy(xpath = "//input[@id='MaxAdultCount']")
    public WebElement maxAdult;

    @FindBy(xpath = "//input[@id='MaxChildCount']")
    public WebElement cocukSayisi;
    @FindBy(xpath = "//input[@id='IsAvailable']")
    public WebElement approved;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement save;

    @FindBy(xpath ="//div[@class='bootbox-body']")
    public WebElement basariliText;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement okButonu;
    @FindBy(xpath = "//a[@href='/admin/HotelRoomAdmin']")
    public WebElement hotelRoom;

    @FindBy(xpath = "//span[@class='caption-subject font-green-sharp bold uppercase']")
    public WebElement title;


}

