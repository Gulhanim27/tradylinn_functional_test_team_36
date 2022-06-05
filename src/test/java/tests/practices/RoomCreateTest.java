package tests.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelRoomPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class RoomCreateTest {
    @Test
    public void test01() throws InterruptedException {
        HotelRoomPage roomPage=new HotelRoomPage();
        //url adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("hotelRoomUrl"));
        // username textbox ve password textboxlarini locate edin ve asagidaki verileri girin
        // username=manager
        // password= manager1!
        roomPage.userName1.sendKeys(ConfigReader.getProperty("hotelUserName"));
        roomPage.password1.sendKeys(ConfigReader.getProperty("hotelPassword"));
        // login butonuna basin
        roomPage.submitButton1.click();
        // add hotelroom butonuna basin
        roomPage.addButonu.click();
        //acilan sayfadaki butun text boxlara istediginiz verileri girin
        WebElement hotelsec= roomPage.selectHotel;
        Select select = new Select(hotelsec);
        select.selectByVisibleText("Mavi Hotel");

     roomPage.code1.sendKeys(ConfigReader.getProperty("code"));
     roomPage.name1.sendKeys(ConfigReader.getProperty("name"));
     roomPage.location1.sendKeys(ConfigReader.getProperty("adress"));
        Thread.sleep(3000);
        roomPage.yaziPaneli.sendKeys(ConfigReader.getProperty("text"));

        Actions actions=new Actions(Driver.getDriver());
        actions.dragAndDrop(roomPage.besYuz,roomPage.priceButton).perform();
     roomPage.selectRoom.click();
     WebElement odaSec=roomPage.selectRoom;
     Select select2 = new Select(odaSec);
     select2.selectByIndex(2);
     roomPage.maxAdult.sendKeys(ConfigReader.getProperty("maxAd"));
     roomPage.cocukSayisi.sendKeys(ConfigReader.getProperty("cocukSay"));
     // approved isaretleyin
        roomPage.approved.click();
        //save butonuna basin
        roomPage.save.sendKeys(Keys.ENTER);
        //explicit wait //'HotelRoom was inserted successfully' textinin goruntulendigini dogrulayin
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        boolean isTrue=wait.until(ExpectedConditions.textToBe(By.xpath("//div[@class='bootbox-body']"),"HotelRoom was inserted successfully"));

        Assert.assertTrue(isTrue);// ture ise pass olacak
        // ok butonuna tiklayin
        roomPage.okButonu.click();
        actions.sendKeys(Keys.HOME).perform();
        // Hotel rooms linkine tiklayin
        WebElement hotelRoomLink=wait.until(ExpectedConditions.elementToBeClickable(roomPage.hotelRoom));
        hotelRoomLink.click();
        //"LIST OF HOTELROOMS" textinin goruntulndigini dogrulayin
        roomPage.title.isDisplayed();








    }
}
