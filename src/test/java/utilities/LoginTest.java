package utilities;


import org.openqa.selenium.WebDriver;
import pages.Aydin;


public class LoginTest {

    public static void loginTest() throws InterruptedException {

        Aydin us_03Page=new Aydin();

        WebDriver driver ;
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));

        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));// url gidecek
        //2_ giris butonuna basin
        us_03Page.loginButonu.click();
        //3_Dogru e posta aderesini girin
        us_03Page.emailTextBox.sendKeys(ConfigReader.getProperty("userName"));
        //4_dogru bir password girin
        us_03Page.passwordTextBox.sendKeys(ConfigReader.getProperty("password"));
        //5_ giris yap butonuna tiklayi
        us_03Page.girisButonu.click();
        Thread.sleep(3000);

    }











    }
