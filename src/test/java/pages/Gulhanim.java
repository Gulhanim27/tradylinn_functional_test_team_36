package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


import java.util.List;


public class Gulhanim {
    public Gulhanim() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//span[contains(text(),'Giriş Yap')]")
    public WebElement girisYap;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement mailTextBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement girisYapButon;

    @FindBy(xpath="(//*[text()='Hesabım'])[1]")
    public WebElement hesabimButonu;
    @FindBy(xpath="//a[@href='https://tradylinn.com/store-manager/']")
    public WebElement storeManagerButonu;

    @FindBy(xpath="(//span[@class='text'])[7]")
    public WebElement customersButton;

    @FindBy(xpath="(//div[@class='wcfm-clearfix'])")
    public WebElement managerCustomer;

    @FindBy(xpath="//thead//tr[1]//th")
    public List<WebElement> sutunBasliklari;

    @FindBy(xpath="//span[text()='Excel']")
    public WebElement excelDosyasi;

    @FindBy(xpath="//a[@class='add_new_wcfm_ele_dashboard text_tip']")
    public WebElement addCustomerButonu;
    @FindBy(xpath="//input[@id='user_name']")
    public WebElement userNameButonu;




}
