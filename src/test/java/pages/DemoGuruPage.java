package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoGuruPage {
    public DemoGuruPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="(//a[@class='button button-orange'])[5]")
          public WebElement bankKutusu;

    @FindBy(xpath="//ol[@id='bank']")
            public WebElement debitSideAccount;

    @FindBy(xpath="(//a[@class='button button-orange'])[6]")
    public WebElement sales;

    @FindBy(xpath="//ol[@id='loan']")
    public WebElement creditSideAccount;
    @FindBy(xpath="(//a[@class='button button-orange'])[2]")
    public WebElement besBinButonu;
    @FindBy(id="amt7")
    public WebElement debitSideAmount;

    @FindBy(xpath="(//a[@class='button button-orange'])[4]")
    public WebElement ikinciBesBinButonu;
    @FindBy(id="amt8")
    public WebElement creditSideAmount;

    @FindBy(xpath="(//a[@class='button button-green'])[1]")
    public WebElement perfectButonu;


}
