package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

<<<<<<<< HEAD:src/test/java/pages/Metin.java
public class Metin {
    public Metin() {
========
public class Samet {
    public Samet() {
>>>>>>>> origin:src/test/java/pages/Samet.java
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="locater")
    public WebElement locaterName;
}
