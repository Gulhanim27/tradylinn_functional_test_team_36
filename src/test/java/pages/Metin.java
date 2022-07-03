package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class Metin {
    public Metin() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="locater")
    public WebElement locaterName;


    @FindBy(xpath = "(//a[text()='Hesabım'])[1]")
    public WebElement hesabimButonu;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[text()='Giriş Yap']")
    public WebElement girisYapButonu;

    @FindBy(xpath = "//*[text()='Store Manager']")
    public WebElement storeManager;

    @FindBy(xpath = "(//span[@class='text'])[4]")
    public WebElement urunButonu;

    @FindBy(id = "add_new_product_dashboard")
    public WebElement yeniEkleButonu;

    @FindBy(id = "wcfm_products_manage_form_attribute_head")
    public WebElement attributesButonu;

    @FindBy(id = "attributes_is_active_1")
    public WebElement colorCheckBox;

    @FindBy(xpath = "(//*[text()='Select all'])[1]")
    public WebElement colorSelectAll;

    @FindBy(id = "attributes_is_active_2")
    public WebElement sizeCheckBox;

    @FindBy(xpath = "(//*[text()='Select all'])[2]")
    public WebElement sizeSelectAll;



}
