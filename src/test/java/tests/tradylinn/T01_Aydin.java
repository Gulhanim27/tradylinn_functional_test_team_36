package tests.tradylinn;

import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.LoginTest;

public class T01_Aydin {
    pages.Aydin us_03Page=new pages.Aydin();
    protected WebDriver driver;

    Actions actions=new Actions(Driver.getDriver());

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
//TC001
        //login olmali
        LoginTest.loginTest();
        Thread.sleep(3000);
        urunEkleme();
        // sepetim butonuna tikla
        us_03Page.sepetimButonu.click();
        //sepetimi goruntuleye tikla
        us_03Page.sepetiGoruntule.click();
        //eklen urun var mi dogrula

        int sepettekiSayiDegeri = Integer.parseInt(  us_03Page.sepetimdekiSayi.getText());
        Assert.assertTrue(sepettekiSayiDegeri > 0, "sepetimde urun var ");

        // Fiyat sekmesi var oldugunu test eder
        Assert.assertTrue(us_03Page.fiyatYaziElementi.isDisplayed());
        // Miktarsekmesi var oldugunu test eder
        Thread.sleep(1000);
        //?       Assert.assertTrue(us_03Page.miktarYaziElementi.isDisplayed());
        //  Ara Toplam sekmesi var oldugunu test eder
        Thread.sleep(1000);
        Assert.assertTrue(us_03Page.araToplamYaziElementi.isDisplayed());



        //TC 002
        //1.Urun adedini artirmak icin ( + ) butonuna tiklar
        int artiButonunaTiklamadanOncekiDeger = Integer.parseInt(us_03Page.sepettekiUrunMiktariElementi.getAttribute("value"));
        us_03Page.miktarPlus.click();
        //2.Urun adedinin arttigini test eder
        int artiButonuTiklandiktanSonrakiDeger = Integer.parseInt(us_03Page.sepettekiUrunMiktariElementi.getAttribute("value"));
        Assert.assertTrue(artiButonuTiklandiktanSonrakiDeger > artiButonunaTiklamadanOncekiDeger, "Urun artmadi");
        //3.Urun adedini azaltmak icin ( - ) butonuna tiklar
        us_03Page.miktarMinus.click();
        //4. Urun adedinin azaldini  test eder
        int eksiButonunaTikladiktanSonrakiDeger = Integer.parseInt(us_03Page.sepettekiUrunMiktariElementi.getAttribute("value"));
        Assert.assertTrue(eksiButonunaTikladiktanSonrakiDeger < artiButonuTiklandiktanSonrakiDeger, "Urun azalmadi");



        //  TC 003
        // sepetim butonuna tikla
        us_03Page.sepetiGoruntule.click();
        // sepeti goruntuleye tikla
        us_03Page.sepetiGoruntule.click();
        // miktardaki artiya plus tikla
        us_03Page.miktarPlus.click();

        // sepeti yenileye tikla

        int yenilemedenOnce=Integer.parseInt(us_03Page.araToplamYaziElementi.getAttribute("value"));
        us_03Page.sepetiYenile.click();
        // ara toplamin arttigini dogrula
        int yenilemedenSonraki= Integer.parseInt(us_03Page.araToplamYaziElementi.getAttribute("value"));
        Assert.assertTrue(yenilemedenOnce<yenilemedenSonraki,"Urun toplami artmiyor");
        // miktardaki artiya stok fazlasi deger gir
        //ayakkabiururnunun max degeri =45
        actions.click(us_03Page.miktarStok).sendKeys(Keys.CLEAR).sendKeys("50").perform();
        us_03Page.sepetiYenile.click();
        int yenilemedenOnce1=Integer.parseInt(us_03Page.araToplamYaziElementi.getAttribute("value"));
        us_03Page.sepetiYenile.click();
        int yenilemedenSonraki1= Integer.parseInt(us_03Page.araToplamYaziElementi.getAttribute("value"));


        // hata mesjnini dogrula
        Assert.assertTrue(yenilemedenOnce1<yenilemedenSonraki1,"stokta halen urun var");




        // tc 004

//        1_ kupon kullan butonunu dogrula
//        2- Alis verise devam et sekmesininin dogrula
//        3_gonderim hedegi varmi onu dogrula
//        4- toplam rakam varmi onu dogrula
//        5_odeme sayfasina tiklanmali ve bunu dogrula

//        6-Temizle sekmesine tikla
        //7- sepetiniz suan bos yazisini dogrula






    }

    public void faturaBilgilerininGirilmesi(){



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

        //6- Urun arama textbox`ina "laptop" yazip enterla
        us_03Page.searchButton.sendKeys("laptop"+Keys.ENTER);
        //7-cikan sonuclardan 2. resme tikla
        us_03Page.laptop.click();
        //8- sepete ekle butonuna tikla
        us_03Page.sepeteEkleButonu.click();

        //9- Urun arama textbox`ina "kilif" yazip enterla
        us_03Page.searchButton.sendKeys("kilif"+Keys.ENTER);
        //10-cikan sonuclardan 1. resme tikla
        us_03Page.kilif.click();
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




