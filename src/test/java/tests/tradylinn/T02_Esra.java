package tests.tradylinn;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Esra;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBase;

public class T02_Esra extends TestBase {
    Esra kupon = new Esra();

    @Test
    public void test_US13_TC06() {
        Actions actions=new Actions(driver);
        // 1- Vendor "https://tradylinn.com/"  adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));

        // 2- Vendor "Giriş yap" butonuna tiklar
        kupon.girisYap.click();

        //Vendor "vendor adı veya e-posta adresi" inputuna gecerli Email girer"
        kupon.mailTextBox.sendKeys(ConfigReader.getProperty("userName"));

        //Vendor "Parola" inputuna  gecerli parolayi girer
        kupon.passwordTextBox.sendKeys(ConfigReader.getProperty("password"));

        //Vendor "GİRİŞ YAP" butonuna tiklar
        kupon.girisYapButon.click();

        //Vendor "Hesabım" butonuna tiklar
        ReusableMethods.waitFor(3);
        kupon.hesabimButonu.click();

        //Vendor "Store Manager" butonuna tiklar
        ReusableMethods.waitFor(3);
        kupon.storeManagerButton.click();

        //Vendor "Kuponlar" butonundan "Yeni ekle" secenegini tiklar
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        kupon.kuponlarButonu.click();
        ReusableMethods.waitFor(3);
        kupon.kuponlarYeniEkleButonu.click();

        //Vendor "Allow free shipping" secenegini isaretler
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy (0,1700)");
        kupon.freeShippingCheckbox.click();

        //Vendor "Code" satirina uniq bir deger girerek enter'a tiklar
        String code6= String.valueOf("10");

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        kupon.code.sendKeys(code6,Keys.ENTER);

        //Vendor "Coupon Successfully Published." yazisinin görünüyor oldugunu test eder"
        Assert.assertTrue(kupon.submitOnayYazisi.isDisplayed());

    }





    }


}
