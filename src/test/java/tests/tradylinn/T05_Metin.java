package tests.tradylinn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Metin;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBase;

import java.time.Duration;
import java.util.List;

public class T05_Metin extends TestBase {
    @Test
    public void test01() throws InterruptedException {

      Actions actions=new Actions(Driver.getDriver());
        Metin metinSayfasi = new Metin();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));


            //1-Kullanici tradylinn url sayfasina gider
            Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
            //2- kullanici hesabim butonunu tiklar
        wait.until(ExpectedConditions.elementToBeClickable(metinSayfasi.hesabimButonu));
            metinSayfasi.hesabimButonu.click();
            Thread.sleep(2000);
            //3-Kullanici gecerli email adresini girer
            metinSayfasi.userName.sendKeys(ConfigReader.getProperty("userName"));
            //4-Kullanici gecerli password girer
            metinSayfasi.password.sendKeys(ConfigReader.getProperty("password"));
            //5-Kullanici giris yap butonunu tiklar
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            metinSayfasi.girisYapButonu.click();
            Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(metinSayfasi.storeManager));
        //Kullanici store manager butonunu tiklar
            metinSayfasi.storeManager.click();
        //Kullanici urun butonunu tiklar
        actions.sendKeys(Keys.PAGE_DOWN).perform();
            metinSayfasi.urunButonu.click();
            wait.until(ExpectedConditions.elementToBeClickable(metinSayfasi.yeniEkleButonu));
        //Kullanici yeni ekle butonunu tiklar
            metinSayfasi.yeniEkleButonu.click();

        //Kullanici sayfanin altindaki Attributes butonunu tiklar

        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        wait.until(ExpectedConditions.elementToBeClickable(metinSayfasi.attributesButonu));
        metinSayfasi.attributesButonu.click();
        //Kullanici color check box ini tiklar
        wait.until(ExpectedConditions.elementToBeClickable(metinSayfasi.colorCheckBox));
        metinSayfasi.colorCheckBox.click();
        //Kullanici SELECT ALL butonunu tiklar
        wait.until(ExpectedConditions.elementToBeClickable(metinSayfasi.colorSelectAll));
        metinSayfasi.colorSelectAll.click();
        //Kullanici renkleri assert eder
   List<WebElement> liste = Driver.getDriver().findElements(By.xpath("//li[@class='select2-selection__choice']"));
    for (WebElement list : liste) {
        System.out.print(list.getText());
    }






    }
}
