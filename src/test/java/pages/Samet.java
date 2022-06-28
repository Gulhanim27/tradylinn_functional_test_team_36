package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Samet {
    public Samet() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[@class='login inline-type']")
    public WebElement loginButonu;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@value='Giriş Yap']")
    public WebElement girisButonu;


    @FindBy(xpath = "(//*[text()='Hesabım'])[1]")
    public WebElement hesabimButonu;

    @FindBy(xpath = "//*[text()='Store Manager']")
    public WebElement storeManagerButonu;

    @FindBy(xpath = "(//span[@class='text'])[8]")
    public WebElement geriOdemeButonu;


    @FindBy(xpath = "//span[@class='wcfm_dashboard_item_title']")
    public WebElement requestId;
    @FindBy(xpath = "//*[@class='wcfm_dashboard_item_title transaction_order_id']")
    public WebElement orderId;
    @FindBy(xpath = "(//*[@class='woocommerce-Price-amount amount'])[3]")
    public WebElement amount;
    @FindBy(xpath = "//tr//td[5]")
    public WebElement type;
    @FindBy(xpath = "//tr//td[6]")
    public WebElement reason;


}
