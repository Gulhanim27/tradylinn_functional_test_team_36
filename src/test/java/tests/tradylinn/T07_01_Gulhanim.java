package tests.tradylinn;



import BaseClass.Gulhanim_Base_Class;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.Gulhanim;
import utilities.Driver;

import java.time.Duration;

public class T07_01_Gulhanim extends Gulhanim_Base_Class {
   Gulhanim site;

    @Test
    public void test03() throws InterruptedException {

       site = new Gulhanim();
       if (site.checkboxButonu.isSelected()){

           JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
           js.executeScript("arguments[0].scrollIntoView(true);", site.submitButonu);
           js.executeScript("arguments[0].click()", site.submitButonu);
       }



        }

}
