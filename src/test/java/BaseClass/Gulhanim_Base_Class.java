package BaseClass;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Gulhanim;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.testng.TestRunner.PriorityWeight.priority;

public class Gulhanim_Base_Class  {

    Gulhanim site;

    @Test
    public void test01() throws InterruptedException {

        site = new Gulhanim();
        Actions actions = new Actions(Driver.getDriver());

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
        Thread.sleep(15000);
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

        for (WebElement each : site.sutunBasliklari) {
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
    @Test
    public void test02() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        site.firstName2.sendKeys(ConfigReader.getProperty("firstName1"));
                actions.sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("lastName1"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("companyName1"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("phone"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("address1"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("address1a")).perform();
                Thread.sleep(10000);

                JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
                js.executeScript("window.scrollBy(0,200)");

                Thread.sleep(15000);
                site.countryButonu.click();
                Thread.sleep(10000);
                site.country.click();
                site.cityButonu.click();
                site.cityButonu.sendKeys(ConfigReader.getProperty("city1"));
                Thread.sleep(10000);
                Select options1=new Select(site.statebutonu);
                Thread.sleep(10000);
                options1.selectByVisibleText("Sivas");
                site.postCode.sendKeys(ConfigReader.getProperty("postcode1"));
    }
}