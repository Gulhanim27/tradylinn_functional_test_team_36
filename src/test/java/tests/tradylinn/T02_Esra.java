package tests.tradylinn;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
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
        // 1- "https://tradylinn.com/"  adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));

        // 2- "Giriş yap" butonuna tiklar
        kupon.girisYap.click();

        // 3- Kullanici adı veya e-posta adresi" inputuna gecerli Email girer"
        kupon.mailTextBox.sendKeys(ConfigReader.getProperty("userName"));

        // 5- Kullanici "Parola" inputuna  gecerli parolayi girer
        kupon.passwordTextBox.sendKeys(ConfigReader.getProperty("password"));

        // 6- Kullanici "GİRİŞ YAP" butonuna tiklar
        kupon.girisYapButon.click();

        // 7- Kulanici "Hesabım" butonuna tiklar
        ReusableMethods.waitFor(3);
        kupon.hesabimButonu.click();

        // 8- Kullanici "Store Manager" butonuna tiklar
        ReusableMethods.waitFor(3);
        kupon.storeManagerButton.click();

        // 9- Kullanici "Kuponlar" butonundan "Yeni ekle" secenegini tiklar
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy (0,200)");
        ReusableMethods.waitFor(3);
        kupon.kuponlarButonu.click();
        ReusableMethods.waitFor(3);
        kupon.kuponlarYeniEkleButonu.click();

        // 10- Kullanici "Code" satirina uniq bir deger girerek enter'a tiklar
        String code6= String.valueOf("78889");
        js.executeScript("window.scrollBy (0,200)");
        kupon.code.sendKeys(code6,Keys.TAB);

        // 11- Kullanici kupon miktarini girer
        kupon.kuponMiktari.sendKeys("50$" + Keys.TAB);

        // 12- Kullanici son kullanma tarihi girer
        kupon.sonKullanmaTarih.sendKeys("22.11.2022" + Keys.TAB);
        ReusableMethods.waitFor(3);


        // 13- Kullanici "Allow free shipping" secenegini isaretler
        //js.executeScript("window.scrollBy (0,200)");
        kupon.freeShippingCheckbox.click();
        js.executeScript("window.scrollBy (0,900)");


        // 14- Kullanici "Coupon Successfully Published." yazisinin görünüyor oldugunu test eder"
        js.executeScript("arguments[0].scrollIntoView(true);", kupon.submitButton);
        js.executeScript("arguments[0].click()", kupon.submitButton);

        Assert.assertTrue(kupon.submitOnayYazisi.isDisplayed());

        kupon.submitOnayYazisi.isDisplayed();

    }

    @Test
    public void test_US14(){

        Actions actions=new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        // 1- "https://tradylinn.com/"  adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));

        // 2- "Giriş yap" butonuna tiklar
        kupon.girisYap.click();

        // 3- Kullanici adı veya e-posta adresi" inputuna gecerli Email girer"
        kupon.mailTextBox.sendKeys(ConfigReader.getProperty("userName"));

        // 5- Kullanici "Parola" inputuna  gecerli parolayi girer
        kupon.passwordTextBox.sendKeys(ConfigReader.getProperty("password"));

        // 6- Kullanici "GİRİŞ YAP" butonuna tiklar
        kupon.girisYapButon.click();

        // 7- Kulanici "Hesabım" butonuna tiklar
        ReusableMethods.waitFor(7);
        kupon.hesabimButonu.click();

        // 8- Kullanici "Store Manager" butonuna tiklar
        ReusableMethods.waitFor(3);
        kupon.storeManagerButton.click();

        // 9- Kullanici "Kuponlar" butonundan "Yeni ekle" secenegini tiklar
        js.executeScript("window.scrollBy (0,300)");
        ReusableMethods.waitFor(3);
        kupon.kuponlarButonu.click();
        ReusableMethods.waitFor(3);
        kupon.kuponlarYeniEkleButonu.click();


        // 10- Kullanici minimin amount girer
        kupon.minimumAmount.sendKeys("100$" + Keys.TAB );

        // 11- Kullanici max amount girer
        kupon.maximumAmount.sendKeys("500$" +Keys.TAB);
        ReusableMethods.waitFor(2);
        js.executeScript("window.scrollBy (0,500)");

        // 12- Kullanici individual Checkbox isaretler
        kupon.individual_useCheckbox.click();

        // 13- Kullanici exclude sale items checkbox isaretler
        kupon.excludeSaleItems.click();

        // 14- Kullanici exclude categories secer
       WebElement ddm = kupon.excludeCategories;
       Select select = new Select(ddm);
       select.selectByValue("270");

        // 15- Kullanici submit butonuna basar
        js.executeScript("arguments[0].scrollIntoView(true);", kupon.submitButton);
        js.executeScript("arguments[0].click()", kupon.submitButton);








    }

    @Test
    public void test_US15() {
        Actions actions=new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        // 1- "https://tradylinn.com/"  adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));

        // 2- "Giriş yap" butonuna tiklar
        kupon.girisYap.click();

        // 3- Kullanici adı veya e-posta adresi" inputuna gecerli Email girer"
        kupon.mailTextBox.sendKeys(ConfigReader.getProperty("userName"));

        // 5- Kullanici "Parola" inputuna  gecerli parolayi girer
        kupon.passwordTextBox.sendKeys(ConfigReader.getProperty("password"));

        // 6- Kullanici "GİRİŞ YAP" butonuna tiklar
        kupon.girisYapButon.click();

        // 7- Kulanici "Hesabım" butonuna tiklar
        ReusableMethods.waitFor(3);
        kupon.hesabimButonu.click();

        // 8- Kullanici "Store Manager" butonuna tiklar
        ReusableMethods.waitFor(3);
        kupon.storeManagerButton.click();

        // 9- Kullanici "Kuponlar" butonundan "Yeni ekle" secenegini tiklar
        js.executeScript("window.scrollBy (0,300)");
        ReusableMethods.waitFor(3);
        kupon.kuponlarButonu.click();
        ReusableMethods.waitFor(3);
        kupon.kuponlarYeniEkleButonu.click();
        ReusableMethods.waitFor(3);
        js.executeScript("window.scrollBy (0,500)");

        // 10-Kullanici limit butonuna basar
        js.executeScript("window.scrollBy (0,1000)");
        ReusableMethods.waitFor(30);
        kupon.limitlemeButon.click();
        ReusableMethods.waitFor(3);

        // 11- Kullanici usage limit belirler
        kupon.usageLimit.sendKeys("50$" + Keys.TAB);

        // 12- Kullanici limit usage to x items belirler
        kupon.limittoXitem.sendKeys("2" + Keys.TAB);

        // 13- Kullanici usage limit per user belirler
        kupon.limitPerUser.sendKeys("500");

        // 14- Kullanici submit butonuna basar
        js.executeScript("arguments[0].scrollIntoView(true);", kupon.submitButton);
        js.executeScript("arguments[0].click()", kupon.submitButton);
    }

    @Test
    public void test_US08(){

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        Actions actions=new Actions(driver);

        // 1- "https://tradylinn.com/"  adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));

        // 2- "Giriş yap" butonuna tiklar
        kupon.girisYap.click();

        // 3- Kullanici adı veya e-posta adresi" inputuna gecerli Email girer"
        kupon.mailTextBox.sendKeys(ConfigReader.getProperty("userName"));

        // 5- Kullanici "Parola" inputuna  gecerli parolayi girer
        kupon.passwordTextBox.sendKeys(ConfigReader.getProperty("password"));

        // 6- Kullanici "GİRİŞ YAP" butonuna tiklar
        kupon.girisYapButon.click();

        // 7- Kulanici "Hesabım" butonuna tiklar
        ReusableMethods.waitFor(7);
        kupon.hesabimButonu.click();

        // 8- Kullanici "Store Manager" butonuna tiklar
        js.executeScript("window.scrollBy (0,200)");
        ReusableMethods.waitFor(3);
        kupon.storeManagerButton.click();

        // 9- Kullanici ürün butonuna tiklar
        kupon.urunButon.click();

        // 10- Kullanici stock manager butonuna tiklar
        js.executeScript("window.scrollBy (0,200)");
        ReusableMethods.waitFor(5);
        kupon.stockManager.click();


        // 11- Kullanici stock miktarini girer
        js.executeScript("window.scrollBy (0,600)");
        ReusableMethods.waitFor(7);
        kupon.stockMiktar.sendKeys("2");

        // 12- Kullanici backorders allow but notify customers secer
        WebElement ddm = kupon.backorders;
        Select select = new Select(ddm);
        select.selectByValue("notify");
        ReusableMethods.waitFor(3);



        // 13- Kullanici submit butonuna tiklar
        js.executeScript("window.scrollBy (0,2200)");
       //kupon.stockManagerSubmitButton.click();

       js.executeScript("arguments[0].scrollIntoView(true);", kupon.stockManagerSubmitButton);
       js.executeScript("arguments[0].click()", kupon.stockManagerSubmitButton);




    }

}

