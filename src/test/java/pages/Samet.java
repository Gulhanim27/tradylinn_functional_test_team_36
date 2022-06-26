package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Samet {
    public Samet() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="locater")
    public WebElement locaterName;
}
