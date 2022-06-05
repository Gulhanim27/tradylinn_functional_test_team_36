package tests.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class HotelPractice {
    @Test
    public void test01() {
        HotelPage hotelPage= new HotelPage();
        Driver.getDriver().get(ConfigReader.getProperty("hotelUrl"));
        hotelPage.userName.sendKeys(ConfigReader.getProperty("hotelUserName"));
        hotelPage.password.sendKeys(ConfigReader.getProperty("hotelPassword"));
        hotelPage.submitButton.click();

        hotelPage.code.sendKeys(ConfigReader.getProperty("code"));
        hotelPage.name.sendKeys(ConfigReader.getProperty("name"));
        hotelPage.address.sendKeys(ConfigReader.getProperty("adress"));
        hotelPage.phone.sendKeys(ConfigReader.getProperty("phone"));
        hotelPage.email.sendKeys(ConfigReader.getProperty("email"));
        WebElement IDGroup=hotelPage.IDGroup;
        Select select = new Select(IDGroup);
        select.selectByIndex(1);
        hotelPage.butonSubmit.sendKeys(Keys.ENTER);

        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        boolean isTrue=wait.until(ExpectedConditions.textToBe(By.xpath("//div[@class='bootbox-body']"),"Hotel was inserted successfully"));

        Assert.assertTrue(isTrue);
        hotelPage.ok.click();




    }
}
