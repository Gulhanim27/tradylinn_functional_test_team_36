package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

<<<<<<<< HEAD:src/test/java/pages/Zulal.java
public class Zulal {
    public Zulal() {
========
public class Ismail {
    public Ismail() {
>>>>>>>> origin:src/test/java/pages/Ismail.java
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="locater")
    public WebElement locaterName;
}
