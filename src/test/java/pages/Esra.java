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

    @FindBy(id= "wcfm_coupon_manager_submit_button")
    public WebElement submitButton;

    @FindBy (xpath = "//*[text()='Coupon Successfully Published.']")
    public WebElement submitOnayYazisi;

    //=======================US_14===================================//

    @FindBy(xpath = "//input[@id='minimum_amount']")
    public WebElement minimumAmount;

    @FindBy(xpath = "//input[@id='maximum_amount']")
    public WebElement maximumAmount;

    @FindBy(xpath = "//input[@id='individual_use']")
    public WebElement individual_useCheckbox;

    @FindBy(xpath = "//input[@id='exclude_sale_items']")
    public WebElement excludeSaleItems;

    @FindBy(id = "exclude_product_categories")
    public WebElement excludeCategories;

    @FindBy(xpath = "//span[@class='select2 select2-container select2-container--default select2-container--above select2-container--focus']")
    public WebElement excategoriesddm;

    //=========================US_15====================================//

    @FindBy(xpath = "//label[@class='wcfmfa fa-user-times']")
    public WebElement limitlemeButon;

    @FindBy(xpath = "//input[@id='usage_limit']")
    public WebElement usageLimit;

    @FindBy(xpath = "//input[@id='limit_usage_to_x_items']")
    public WebElement limittoXitem;

    @FindBy(xpath = "//input[@id='usage_limit_per_user']")
    public WebElement limitPerUser;

    @FindBy(xpath = "//input[@id='wcfm_coupon_manager_submit_button']")
    public WebElement limitSubmitButton;

    //==========================US_08=====================================//

    @FindBy(xpath = "//span[normalize-space()='Ürün:% s']")
    public WebElement urunButon;

    @FindBy(xpath = "//span[@class='wcfmfa fa-database']")
    public WebElement stockManager;

    @FindBy(xpath = "//input[@name='stock_manage[11550][stock_qty]']")
    public WebElement stockMiktar;

    @FindBy(xpath = "//select[@name='stock_manage[11550][backorder]']")
    public WebElement backorders;

    @FindBy(xpath = "//*[@value='notify'] ")
    public WebElement geciciBackorder;

    @FindBy(id = "wcfm_stock_manager_submit_button")
    public WebElement stockManagerSubmitButton;




    


}
