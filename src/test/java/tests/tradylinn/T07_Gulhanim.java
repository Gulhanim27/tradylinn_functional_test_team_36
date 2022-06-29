package tests.tradylinn;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.Gulhanim;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class T07_Gulhanim extends TestBase {
    @Test
    public void test01() throws InterruptedException {

        Gulhanim site = new Gulhanim();
        Actions actions=new Actions(Driver.getDriver());
        // 1- Vendor "https://tradylinn.com/"  adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));

        // 2- Vendor "Giriş yap" butonuna tiklar
        site.girisYap.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        //Vendor "vendor adı veya e-posta adresi" inputuna gecerli Email girer"
        site.mailTextBox.sendKeys(ConfigReader.getProperty("userName"));

        //Vendor "Parola" inputuna  gecerli parolayi girer
        site.passwordTextBox.sendKeys(ConfigReader.getProperty("password"));

        //Vendor "GİRİŞ YAP" butonuna tiklar
        site.girisYapButon.click();
        //1-Kullanici "Hesabim "butonuna tiklar
        Thread.sleep(5000);
        site.hesabimButonu.click();
        Thread.sleep(5000);
        // 2-Kullanici "Store Manager" butonuna tiklar
        site.storeManagerButonu.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        // 3-Kullanici "customers" butonuna tiklar
        site.customersButton.click();
        Thread.sleep(5000);

        // 4-Kullanici "manage customers" sayfasina tiklar
        site.managerCustomer.isDisplayed();
        //5-Kullanici kayitli kisilerin:
        //a)name goruntuler,b)username goruntuler,c)email goruntuler,d)location goruntuler,
        //e)orders goruntuler,f)money spend goruntuler,/g)last order gorontuler,k)actions goruntuler

        for (WebElement each: site.sutunBasliklari){
            System.out.println(each.getText());
        }


        // ve kisilerin tum bilgilerini pdf, excel, veya csv olarak indirir
        site.excelDosyasi.click();
        Thread.sleep(5000);

        String farkliKisim = System.getProperty("user.home");
        String ortakKisim = "\\Downloads\\Store Manager – Tradylinn.xlsx";
        String arananDosyaYolu = farkliKisim + ortakKisim;
        System.out.println(arananDosyaYolu);
        System.out.println(Files.exists(Paths.get(arananDosyaYolu)));
        Assert.assertTrue(Files.exists(Paths.get(arananDosyaYolu)));

        //5-Kullanici "add costumer" butonuna tiklar
        actions.sendKeys(Keys.DOWN).perform();
        Thread.sleep(3000);
        site.addCustomerButonu.click();
        //5a- Kullanici username girer


        site.userNameButonu.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        actions.sendKeys(Keys.TAB)
       // 5c-Kullanici mail girer
                .sendKeys(ConfigReader.getProperty("mail"))
                .sendKeys(Keys.TAB)
        //5d-Kullanici first name girer
                .sendKeys(ConfigReader.getProperty("firstName"))
                .sendKeys(Keys.TAB)
        //Kullanici lastname girer
                .sendKeys(ConfigReader.getProperty("lastName")).perform();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
