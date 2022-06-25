package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Esra {
    public Esra() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="locater")
    public WebElement locaterName;

    @FindBy(xpath="//span[contains(text(),'Giriş Yap')]")
    public WebElement girisYap;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement mailTextBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement girisYapButon;

    @FindBy(xpath = "//li[@id='menu-item-1074']//a[contains(text(),'Hesabım')]")
    public WebElement hesabimButonu;

    @FindBy(xpath = "//a[normalize-space()='Store Manager']")
    public WebElement storeManagerButton;

    @FindBy(xpath = "(//span[@class='text'])[6]")
    public WebElement kuponlarButonu;

    @FindBy (xpath = "//a[@id='add_new_coupon_dashboard']")
    public WebElement kuponlarYeniEkleButonu;

    @FindBy (xpath = "//input[@id='title']")
    public WebElement code;

    @FindBy(xpath = "//input[@id='coupon_amount']")
    public WebElement kuponMiktari;

    @FindBy(xpath = "//input[@id='expiry_date']")
    public WebElement sonKullanmaTarih;

    @FindBy(xpath = "//input[@id='free_shipping']")
    public WebElement freeShippingCheckbox;

    @FindBy (xpath = "//*[text()='Coupon Successfully Published.']")
    public WebElement submitOnayYazisi;


    //=======================US_14===================================//

    @FindBy(xpath = "//input[@id='minimum_amount']")
    public WebElement minimumAmount;

    @FindBy(xpath = "//input[@id='maximum_amount']")
    public WebElement maximumAmount;

    @FindBy(xpath = "//input[@id='individual_use']")
    public WebElement individual_useCheckbox;

    @FindBy(xpath = "//span[@aria-expanded='true']//input[@placeholder='Filter by product ...']")
    public WebElement excludeSaleItems;

    @FindBy(xpath = "//input[@placeholder='No categories']")
    public WebElement excludeCategories;


    //=========================US_15====================================//






}
