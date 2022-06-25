package tests.tradylinn;

import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.LoginTest;

public class T01_Aydin {
    pages.Aydin us_03Page=new pages.Aydin();
    protected WebDriver driver;


    @Test
    public void us_03_urunSecimi() throws InterruptedException {
// Tradylinn sayfasina login olma
        LoginTest.loginTest();

        //TC_0002_Orders da Browse products a gidilmeli
        //TC_0002_Orders da Browse products a gidilmeligidilmeli
        // 5 urun secilmeli ve Secilen ürünler tek tek sepete aktarılmalı.

              urunEkleme();

           // tc 3_Sepete ve ordan checkout a gidilmeli

//1_ Sepetim sekmesine tikla
        us_03Page.sepetimButonu.click();
//2_ Sepeti goruntule ye tikla
        us_03Page.sepetiGoruntule.click();
//3-  5 urun oldugunu dogrula
        String expected="5";
        String actual=us_03Page.sepetimdekiSayi.getText();
        Assert.assertEquals(expected,actual);

        //TC 4_Tum address bilgileri tam olarak girilmeli

        //1_sepetim sekmesine tikla
        us_03Page.sepetimButonu.click();
        //2_ sepetimi goruntule sekmesi tikla
        us_03Page.sepetiGoruntule.click();


        kargoAdresi();
        //7- fiyati guncelleye tikla
        us_03Page.fiyatiGuncelle.click();
        //8-gonderim hedefinin"04435 sultanbeyli İstanbul, Türkiye." oldugunu dogrula

        String expectedKargoadres="04432 sultanbeyli İstanbul, Türkiye.";
        String actualKargoadres=us_03Page.gonderimHedefi.getText();
        System.out.println(actualKargoadres);
        Assert.assertEquals(actualKargoadres,expectedKargoadres);

// tc 05 Billing bilgileri tam olarak eklenmeli ve place order diyerek order yapılmalı

        //1_odeme  tiklanmlali
        us_03Page.odeme.click();

        faturaBilgilerininGirilmesi();

        //14_ pay the door sec
        us_03Page.payAtTheDoor.click();
        //15_ siparis onaylama ya tikla
        us_03Page.siparisiOnayla.click();
        //16-"Teşekkür ederiz. Siparişiniz alınmıştır." yazisini gor
        String expectedIkon="Teşekkür ederiz. Siparişiniz alınmıştır.";
        String actualIkon=us_03Page.TesekkerYaziElementi.getText();
        System.out.println(actualIkon);
        Assert.assertEquals(actualIkon,expectedIkon);

      //  benim icin bitmistir:)

        driver.close();

    }


    @Test()
    public void us_004_stokISlemleri() throws InterruptedException {

    }

       public void faturaBilgilerininGirilmesi(){


    Actions actions = new Actions(driver);
    Faker faker = new Faker();
    WebElement isimkutusu=driver.findElement(By.xpath("//input[@id='billing_first_name']"));
    actions.click(isimkutusu)
            .sendKeys(faker.name().firstName())  //2_ ad gir
            .sendKeys(Keys.TAB)
            .sendKeys(faker.name().lastName())//3_ soyad  gir
            .sendKeys(Keys.TAB)
            .sendKeys(faker.company().name())//4_firma adi bos birakilabilir
            .sendKeys(Keys.TAB)//5_ulke adi gir
            .sendKeys(faker.address().streetAddress())//6_sokak adresi gir
            .sendKeys(Keys.TAB)//7_apartman ,daire ,oda istege bagli
            .sendKeys(faker.address().secondaryAddress())
            .sendKeys(Keys.TAB)
            .sendKeys(faker.address().zipCode())//8_posta kod gir
            .sendKeys(Keys.TAB)
            .sendKeys("sultanbeyli")//9_ilce / semt gir
            .sendKeys(Keys.TAB)
            .sendKeys("istanbul")//10_sehir gir
            .sendKeys(Keys.TAB)
            .sendKeys(faker.phoneNumber().cellPhone())//11_telefon gir
            .sendKeys(Keys.TAB)
            .sendKeys(faker.internet().emailAddress())//12_E-posta adresi gir
            .sendKeys(Keys.TAB)
            .sendKeys("City: İzmir\n" +
                    "Phone: 055256565236\n" +
                    "Address: Türkiye/İzmir/Buca")//13_teslimat adresi gir
            .perform();




}
       public void urunEkleme(){
       us_03Page.hesabimButton.click();
       //2-siparisler butonuna tikla
       us_03Page.siparislerButton.click();



       // sayfayi page down yapma !!!!!!!!!!!!!!!!!!!!!!!!!

       //   JavascriptExecutor js=(JavascriptExecutor)driver;
       //   WebElement element=driver.findElement(By.xpath("(//i[@class='w-icon-long-arrow-right'])[2]"));
       //  js.executeScript("arguments[0].scrollIntoView();",element);//elementi buldu

       // alisverislere devam et tikla
       // alisverislere devam et tikla
       //   us_03Page.alisveriseDevamEtButonu.click();//tikladik
       //3- Urun arama textbox`ina "bebek" yazip enterla


       us_03Page.searchButton.sendKeys("bebek"+ Keys.ENTER);
       //4-cikan sonuclardan 2. resme tikla
       us_03Page.bebek.click();
       //5- sepete ekle butonuna tikla
       us_03Page.sepeteEkleButonu.click();

       //6- Urun arama textbox`ina "saat" yazip enterla
       us_03Page.searchButton.sendKeys("saat"+Keys.ENTER);
       //7-cikan sonuclardan 2. resme tikla
       us_03Page.saat.click();
       //8- sepete ekle butonuna tikla
       us_03Page.sepeteEkleButonu.click();

       //9- Urun arama textbox`ina "vazo" yazip enterla
       us_03Page.searchButton.sendKeys("vazo"+Keys.ENTER);
       //10-cikan sonuclardan 2. resme tikla
       us_03Page.vazo.click();
       //11- sepete ekle butonuna tikla
       us_03Page.sepeteEkleButonu.click();

       //12- Urun arama textbox`ina "masa" yazip enterla
       us_03Page.searchButton.sendKeys("masa"+Keys.ENTER);
       //13-cikan sonuclardan 2. resme tikla
       us_03Page.masa.click();
       //14- sepete ekle butonuna tikla
       us_03Page.sepeteEkleButonu.click();

       //15- Urun arama textbox`ina "cicek" yazip enterla
       us_03Page.searchButton.sendKeys("cicek"+Keys.ENTER);
       //16-cikan sonuclardan 2. resme tikla
       us_03Page.cicek.click();
       //17- sepete ekle butonuna tikla
       us_03Page.sepeteEkleButonu.click();

   }
       public void kargoAdresi(){
       //3_ ulke textbox a "Turkiye" yazi gonder
       us_03Page.ulkeTextBox.click();
       //4_ sehir texbox ina istanbul yazisi gonder
       us_03Page.sehirTextBoxTikla.click();
       us_03Page.sehirTextBoxSend.sendKeys("istanbul"+Keys.ENTER);
       //5_ ilce semt " sultanbeyli " yazisi gonder
       us_03Page.ilceTextBox.sendKeys("Sultanbeyli"+Keys.ENTER);
       //6- posta kod "04435" gonder
       us_03Page.postaKutusu.sendKeys("04432");
   }





}




