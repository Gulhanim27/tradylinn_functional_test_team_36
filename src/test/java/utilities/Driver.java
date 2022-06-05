package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    /*
    POM(Page Object Model)'da Driver icin TestBase class'ina extends etmek yerine
    Driver class'indan static method'lar kullanarak driver olusturup,
    ilgili ayarlarin yapilmasi ve en sonda driver'in kapatilmasi tercih edilmistir

    POM'da Driver Class indaki getDriver() method una obje olusturularak kullanilmasini
    engelemek icin Singleton Pattern kullanimi benimenmistir

    Singleton Pattern: tekli kullanim, bir class in farkli class lardan
    obje olusturularak kullanimini engellemek icin kullanilir

    bunu saglamak icin yapmamiz gereken sey oldukca basit
    obje olusturmak icin kullanilan construvtor i private yaptigimizda baska class larda
Driver class'larda  obje olusturulmasi mumkun olamaz

     */
   private Driver(){

    }

     static WebDriver driver;

    public static WebDriver getDriver(){

        if(driver==null) {
            switch (ConfigReader.getProperty("browser")){
                case "chrome" :
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "safari" :
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;
                case "firefox" :
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "headless-chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();

            }


            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
    return driver;
    }
    public static void closeDriver(){
        if(driver!=null){
            driver.close();
            driver = null;
        }

    }
}
