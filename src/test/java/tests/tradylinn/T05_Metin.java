package tests.tradylinn;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Metin;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBase;

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
            actions.sendKeys(Keys.PAGE_DOWN);
            Thread.sleep(2000);
            metinSayfasi.girisYapButonu.click();
            Thread.sleep(3000);

        //Kullanici store manager butonunu tiklar
        metinSayfasi.storeManager.click();
        //Kullanici urun butonunu tiklar
        metinSayfasi.urunButonu.click();
        //Kullanici yeni ekle butonunu tiklar
        metinSayfasi.yeniEkleButonu.click();
        //Kullanici sayfanin altindaki Attributes butonunu tiklar
        actions.sendKeys(Keys.PAGE_DOWN);
        metinSayfasi.attributesButonu.click();
        //Kullanici color check box ini tiklar
        metinSayfasi.colorCheckBox.click();
        //Kullanici SELECT ALL butonunu tiklar
        metinSayfasi.colorSelectAll.click();
        //Kullanici renkleri assert eder
      //  Assert.assertEquals();



    }
}
