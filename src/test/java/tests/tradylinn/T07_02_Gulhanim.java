package tests.tradylinn;


import BaseClass
        .Gulhanim_Base_Class;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.Gulhanim;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class T07_02_Gulhanim extends Gulhanim_Base_Class {
   Gulhanim site;

    @Test
    public void test03() throws InterruptedException {

       site = new Gulhanim();
        Actions actions = new Actions(Driver.getDriver());
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,200)");
        if (site.checkboxButonu.isSelected()) {
            Thread.sleep(5000);
            site.checkboxButonu.click();
            site.firstName3.sendKeys(ConfigReader.getProperty("firstName2"));
            actions.sendKeys(Keys.TAB)
                    .sendKeys(ConfigReader.getProperty("lastName2"))
                    .sendKeys(Keys.TAB)
                    .sendKeys(ConfigReader.getProperty("companyName2"))
                    .sendKeys(Keys.TAB)
                    .sendKeys(ConfigReader.getProperty("address2"))
                    .sendKeys(Keys.TAB)
                    .sendKeys(Keys.TAB)
                    .sendKeys(ConfigReader.getProperty("country2"))
                    .sendKeys(Keys.TAB)
                    .sendKeys(ConfigReader.getProperty("city2"))
                    .sendKeys(Keys.TAB)
                    .sendKeys(ConfigReader.getProperty("state2"))
                    .sendKeys(Keys.TAB)
                    .sendKeys(ConfigReader.getProperty("postcode2")).perform();

            js.executeScript("arguments[0].scrollIntoView(true);", site.submitButonu);
            js.executeScript("arguments[0].click()", site.submitButonu);
        }
     }

}
