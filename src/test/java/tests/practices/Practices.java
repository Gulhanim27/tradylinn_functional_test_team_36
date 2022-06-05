package tests.practices;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DemoGuruPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Practices {


    @Test
    public void test01() throws IOException {
        DemoGuruPage DemoGuruPage = new DemoGuruPage();
        // http://demo.guru99.com/test/drag_drop.html url e git
        Driver.getDriver().get(ConfigReader.getProperty("demoguruUrl"));

        //DEBIT SIDE da Account bolumune BANK butonunu surukle ve birak
        Actions actions=new Actions(Driver.getDriver());
        actions.dragAndDrop(DemoGuruPage.bankKutusu,DemoGuruPage.debitSideAccount).perform();

        //CREDIT SIDE da Account bolumune SALES butonunu surukle ve birak
        actions.dragAndDrop(DemoGuruPage.sales,DemoGuruPage.creditSideAccount).perform();

        //DEBIT SIDE da Amount bolumune 5000 butonunu surukle ve birak
        actions.dragAndDrop(DemoGuruPage.besBinButonu,DemoGuruPage.debitSideAmount).perform();

        //CREDIT SIDE da Amount bolumune ise ikinci 5000  butonunu surukle ve birak
        actions.dragAndDrop(DemoGuruPage.ikinciBesBinButonu,DemoGuruPage.creditSideAmount).perform();

        //Perfect butonun goruntulendigini dogrulayin
        Assert.assertTrue(DemoGuruPage.perfectButonu.isDisplayed());

        // birde ekran goruntusunu alalim
        TakesScreenshot guru=(TakesScreenshot) Driver.getDriver();
        LocalDateTime date=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("YYMMddHHmmss");

        String tarih=date.format(formatter);

        File tumsayfaResim=new File("target/ekranGoruntuleri/tumSayfa"+tarih+".jpeg");
        File geciciDosya=guru.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(geciciDosya,tumsayfaResim);
    }
}
