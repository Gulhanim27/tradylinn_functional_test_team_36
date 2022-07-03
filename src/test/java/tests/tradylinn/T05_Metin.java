package tests.tradylinn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Metin;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBase;

import java.util.List;

public class T05_Metin extends TestBase {
    @Test
    public void test01() throws InterruptedException {

      Actions actions=new Actions(Driver.getDriver());
        Metin metinSayfasi = new Metin();

            //1-Kullanici tradylinn url sayfasina gider
            Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
            //2- kullanici hesabim butonunu tiklar
            Thread.sleep(3000);
            metinSayfasi.hesabimButonu.click();
            Thread.sleep(2000);
            //3-Kullanici gecerli email adresini girer
            metinSayfasi.userName.sendKeys(ConfigReader.getProperty("userName"));
            //4-Kullanici gecerli password girer
            metinSayfasi.password.sendKeys(ConfigReader.getProperty("password"));
            //5-Kullanici giris yap butonunu tiklar
            actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
            actions.click(metinSayfasi.girisYapButonu);
            Thread.sleep(3000);
        //Kullanici store manager butonunu tiklar
            actions.click(metinSayfasi.storeManager);
        //Kullanici urun butonunu tiklar
            actions.click(metinSayfasi.urunButonu);
        //Kullanici yeni ekle butonunu tiklar
            actions.click(metinSayfasi.yeniEkleButonu);

        //Kullanici sayfanin altindaki Attributes butonunu tiklar
        actions.sendKeys(Keys.PAGE_DOWN);
        actions.click(metinSayfasi.attributesButonu);
        //Kullanici color check box ini tiklar
        actions.click(metinSayfasi.colorCheckBox);
        //Kullanici SELECT ALL butonunu tiklar
        actions.click( metinSayfasi.colorSelectAll);
        //Kullanici renkleri assert eder
   List<WebElement> liste = Driver.getDriver().findElements(By.xpath("//*[@class='select2-selection__choice']"));
    for (WebElement list : liste) {
        Assert.assertTrue(list.isDisplayed());
    }






    }
}
