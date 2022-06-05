package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class WepTablesPage {
    public WepTablesPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//input[@id='UserName']")
    public WebElement userName;

    @FindBy(xpath="//input[@id='Password']")
    public WebElement password;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath="//thead//tr[1]//th")
    public List<WebElement> sutun1;

    @FindBy(xpath="//tbody")
    public WebElement tumbody;

    @FindBy(xpath="//tbody//tr")
    public List<WebElement> toplamrow;

    @FindBy(xpath="//tr[4]//td")
    public List<WebElement> rowElement;

    @FindBy(xpath="//tbody//td")
    public WebElement cellSum;

    @FindBy(xpath="//tbody//td")
    public List<WebElement> cells;

    @FindBy(xpath="//th")
    public WebElement sutunSum;

    @FindBy(xpath="//th")
    public List<WebElement> sutuns;

    @FindBy(xpath="//tbody//td[5]")
    public List<WebElement> columnElement;

}
