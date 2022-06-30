package tests.tradylinn;

import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Aydin;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.LoginTest;

public class T01_Aydin {
    pages.Aydin aydin=new pages.Aydin();
    protected WebDriver driver;

    Actions actions=new Actions(Driver.getDriver());

    @Test
    public void test03() throws InterruptedException {
//Tradylinn sayfasina login olma
        LoginTest.loginTest();

        //TC_0002_Orders da Browse products a gidilmeli
        //TC_0002_Orders da Browse products a gidilmeligidilmeli
        // 5 urun secilmeli ve Secilen ürünler tek tek sepete aktarılmalı.

        urunEkleme();

        // tc 3_Sepete ve ordan checkout a gidilmeli

//1_ Sepetim sekmesine tikla
        aydin.sepetimButonu.click();
//2_ Sepeti goruntule ye tikla
        aydin.sepetiGoruntule.click();
//3-  5 urun oldugunu dogrula
        String expected = "5";
        String actual = aydin.sepetimdekiSayi.getText();
        Assert.assertEquals(expected, actual);

        //TC 4_Tum address bilgileri tam olarak girilmeli

        //1_sepetim sekmesine tikla
        aydin.sepetimButonu.click();
        //2_ sepetimi goruntule sekmesi tikla
        aydin.sepetiGoruntule.click();


        kargoAdresi();
        //7- fiyati guncelleye tikla
        aydin.fiyatiGuncelle.click();
        Thread.sleep(5000);

        //8-gonderim hedefinin"04435 sultanbeyli İstanbul, Türkiye." oldugunu dogrula

        String expectedKargoadres = "04432 sultanbeyli İstanbul, Türkiye.";
        String actualKargoadres = aydin.gonderimHedefi.getText();
        System.out.println(actualKargoadres);
        Assert.assertEquals(actualKargoadres, expectedKargoadres);

// tc 05 Billing bilgileri tam olarak eklenmeli ve place order diyerek order yapılmalı

        //1_odeme  tiklanmlali
        aydin.odeme.click();

        faturaBilgilerininGirilmesi();

        //14_ pay the door sec
        aydin.payAtTheDoor.click();
        //15_ siparis onaylama ya tikla
        aydin.siparisiOnayla.click();
        //16-"Teşekkür ederiz. Siparişiniz alınmıştır." yazisini gor
        String expectedIkon = "Teşekkür ederiz. Siparişiniz alınmıştır.";
        String actualIkon = aydin.TesekkerYaziElementi.getText();
        System.out.println(actualIkon);
        Assert.assertEquals(actualIkon, expectedIkon);

        //  benim icin bitmistir:)

        driver.close();
    }

    public void faturaBilgilerininGirilmesi(){
        Faker faker = new Faker();




        JavascriptExecutor js2=(JavascriptExecutor) Driver.getDriver();
        js2.executeScript("arguments[0].scrollIntoView(true);",aydin.isim);
        js2.executeScript("arguments[0].click()",aydin.isim);


        if (aydin.isim.isSelected()) {
            aydin.isim.click();
            actions
                    .sendKeys(Keys.CLEAR)
                    .sendKeys(faker.name().firstName())  //2_ ad gir
                    .sendKeys(Keys.TAB)
                    .sendKeys(Keys.CLEAR)
                    .sendKeys(faker.name().lastName())//3_ soyad  gir
                    .sendKeys(Keys.TAB)
                    .sendKeys(Keys.CLEAR)
                    .sendKeys(faker.company().name())//4_firma adi bos birakilabilir
                    .sendKeys(Keys.TAB)//5_ulke adi gir
                    .sendKeys(Keys.CLEAR)
                    .sendKeys(faker.address().streetAddress())//6_sokak adresi gir
                    .sendKeys(Keys.TAB)//7_apartman ,daire ,oda istege bagli
                    .sendKeys(Keys.CLEAR)
                    .sendKeys(faker.address().secondaryAddress())
                    .sendKeys(Keys.TAB)
                    .sendKeys(Keys.CLEAR)
                    .sendKeys(faker.address().zipCode())//8_posta kod gir
                    .sendKeys(Keys.TAB)
                    .sendKeys(Keys.CLEAR)
                    .sendKeys("sultanbeyli")//9_ilce / semt gir
                    .sendKeys(Keys.TAB)
                    .sendKeys(Keys.TAB)
                    .sendKeys(Keys.CLEAR)
                    .sendKeys(faker.phoneNumber().cellPhone())//11_telefon gir
                    .sendKeys(Keys.TAB)
                    .sendKeys(Keys.CLEAR)
                    .sendKeys(faker.internet().emailAddress())//12_E-posta adresi gir
                    .sendKeys(Keys.TAB)
                    .sendKeys(Keys.CLEAR)
                    .sendKeys(ConfigReader.getProperty("adres"))//13_teslimat adresi gir
                    .perform();
        }

        aydin.sehirTextBoxTikla.click();
        aydin.sehirTextBoxSend.click();
        aydin.sehirTextBoxSend.sendKeys("izmir"+Keys.ENTER);

        js2.executeScript("arguments[0].scrollIntoView(true);", aydin.payAtTheDoor);
        js2.executeScript("arguments[0].click()", aydin.payAtTheDoor);




    }
    public void urunEkleme(){
        aydin.hesabimButton.click();
        //2-siparisler butonuna tikla
        aydin.siparislerButton.click();
        // sayfayi page down yapma !!!!!!!!!!!!!!!!!!!!!!!!!


        //9- Urun arama textbox`ina "kilif" yazip enterla
        aydin.searchButton.sendKeys("kilif"+Keys.ENTER);
        //10-cikan sonuclardan 1. resme tikla
        aydin.kilif.click();
        //11- sepete ekle butonuna tikla
        aydin.sepeteEkleButonu.click();

        //3- Urun arama textbox`ina "bebek" yazip enterla
        aydin.searchButton.sendKeys("bebek"+ Keys.ENTER);
        //4-cikan sonuclardan 2. resme tikla
        aydin.bebek.click();
        //5- sepete ekle butonuna tikla
        aydin.sepeteEkleButonu.click();

        //6- Urun arama textbox`ina "laptop" yazip enterla
        aydin.searchButton.sendKeys("laptop"+Keys.ENTER);
        //7-cikan sonuclardan 2. resme tikla
        aydin.laptop.click();
        //8- sepete ekle butonuna tikla
        aydin.sepeteEkleButonu.click();



        //12- Urun arama textbox`ina "masa" yazip enterla
        aydin.searchButton.sendKeys("masa"+Keys.ENTER);
        //13-cikan sonuclardan 2. resme tikla
        aydin.masa.click();
        //14- sepete ekle butonuna tikla
        aydin.sepeteEkleButonu.click();

        //15- Urun arama textbox`ina "cicek" yazip enterla
        aydin.searchButton.sendKeys("cicek"+Keys.ENTER);
        //16-cikan sonuclardan 2. resme tikla
        aydin.cicek.click();
        //17- sepete ekle butonuna tikla
        aydin.sepeteEkleButonu.click();

    }
    public void kargoAdresi() throws InterruptedException {
        //3_ ulke textbox a "Turkiye" yazi gonder

        Select options=new Select(aydin.turkiye);
        options.selectByIndex(1);

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,200)");

        Thread.sleep(5000);
        aydin.turkiye.click();

        //4_ sehir texbox ina istanbul yazisi gonder

        aydin.sehirTextBoxTikla.click();
        aydin.sehirTextBoxSend.sendKeys("istanbul"+Keys.ENTER);
        //   Select optns1=new Select(aydin.sehirTextBoxKargo);
        //   optns1.selectByVisibleText("istanbul"+Keys.ENTER);

        //5_ ilce semt " sultanbeyli " yazisi gonder
        aydin.ilceTextBox.click();
        aydin.ilceTextBox.sendKeys(Keys.CLEAR);

        aydin.ilceTextBox.sendKeys("Sultanbeyli"+Keys.ENTER);
        //6- posta kod "04435" gonder
        aydin.postaKutusu.click();
        aydin.postaKutusu.clear();
        aydin.postaKutusu.sendKeys("04432");




    }



    @Test
    public void test04() throws InterruptedException {
// Tradylinn sayfasina login olma
        //login olmali
        LoginTest.loginTest();
        Thread.sleep(3000);
        // urunEkleme();
        // sepetim butonuna tikla
        aydin.sepetimButonu.click();
        //sepetimi goruntuleye tikla
        aydin.sepetiGoruntule.click();
        //eklen urun var mi dogrula

        int sepettekiSayiDegeri = Integer.parseInt(  aydin.sepetimdekiSayi.getText());
        Assert.assertTrue(sepettekiSayiDegeri > 0, "sepetimde urun var ");

        // Fiyat sekmesi var oldugunu test eder
        Assert.assertTrue(aydin.fiyatYaziElementi.isDisplayed());
        // Miktarsekmesi var oldugunu test eder
        Thread.sleep(1000);
        Assert.assertTrue(aydin.miktarYaziElementi.isDisplayed());
        //  Ara Toplam sekmesi var oldugunu test eder
        Thread.sleep(1000);
        Assert.assertTrue(aydin.araToplamYaziElementi.isDisplayed());



        //TC 002
        //1.Urun adedini artirmak icin ( + ) butonuna tiklar
        int artiButonunaTiklamadanOncekiDeger = Integer.parseInt(aydin.sepettekiUrunMiktariElementi.getAttribute("value"));
        aydin.miktarPlus.click();
        //2.Urun adedinin arttigini test eder
        int artiButonuTiklandiktanSonrakiDeger = Integer.parseInt(aydin.sepettekiUrunMiktariElementi.getAttribute("value"));
        Assert.assertTrue(artiButonuTiklandiktanSonrakiDeger > artiButonunaTiklamadanOncekiDeger, "Urun artmadi");
        //3.Urun adedini azaltmak icin ( - ) butonuna tiklar
        aydin.miktarMinus.click();
        //4. Urun adedinin azaldini  test eder
        int eksiButonunaTikladiktanSonrakiDeger = Integer.parseInt(aydin.sepettekiUrunMiktariElementi.getAttribute("value"));
        Assert.assertTrue(eksiButonunaTikladiktanSonrakiDeger < artiButonuTiklandiktanSonrakiDeger, "Urun azalmadi");



        //  TC 003

        aydin.miktarPlus.click();

        // sepeti yenileye tikla

        int yenilemedenOnce=Integer.parseInt(aydin.sepettekiUrunMiktariElementi.getAttribute("value"));
        System.out.println(yenilemedenOnce);
        JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",aydin.sepetiYenile);
        js.executeScript("arguments[0].click()",aydin.sepetiYenile);


        // ara toplamin arttigini dogrula
        int yenilemedenSonraki= Integer.parseInt(aydin.sepettekiUrunMiktariElementi.getAttribute("value"));
        Assert.assertFalse(yenilemedenOnce<yenilemedenSonraki,"Urun toplami artmiyor");
        // miktardaki artiya stok fazlasi deger gir
        //ayakkabiururnunun max degeri =45
        //  actions.sendKeys(Keys.PAGE_UP).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).perform();
        Thread.sleep(5000);
        JavascriptExecutor js1=(JavascriptExecutor) Driver.getDriver();
        js1.executeScript("arguments[0].scrollIntoView(true);",aydin.miktarPlus);
        js1.executeScript("arguments[0].click()",aydin.miktarPlus);
        Thread.sleep(5000);

        aydin.miktarPlus.click();
        aydin.miktarPlus.click();
        aydin.miktarPlus.click();
        aydin.miktarPlus.click();
        aydin.miktarPlus.click();
        aydin.miktarPlus.click();
        aydin.miktarPlus.click();

        JavascriptExecutor js2=(JavascriptExecutor) Driver.getDriver();
        js2.executeScript("arguments[0].scrollIntoView(true);",aydin.sepetiYenile);
        js2.executeScript("arguments[0].click()",aydin.sepetiYenile);

        //miktarin artmadigini stoktan buyuk sayi girilemedigini dogrula
        aydin.sepetimButonu.click();
        Assert.assertTrue(aydin.miktarText.getText().equals("9"));

        // tc 004

//        1_ kupon kullan butonunu dogrula
        Assert.assertTrue(aydin.kuponElementi.isDisplayed());
//        2- Alis verise devam et sekmesininin dogrula
        Assert.assertTrue(aydin.alisveriseDevamEtButonu.isDisplayed());
//        3_ganderim hedegi varmi onu dogrula
        Assert.assertTrue(aydin.gonderimHedefi.isDisplayed());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
//        4- toplam rakam varmi onu dogrula
        Assert.assertTrue(aydin.araToplamYaziElementi.isDisplayed());
//        5_odeme sayfasina tiklanmali ve bunu dogrula
        Assert.assertTrue(aydin.odeme.isDisplayed());
        actions.sendKeys(Keys.PAGE_UP).sendKeys(Keys.ARROW_UP).perform();

//        6-Temizle sekmesine tikla

        aydin.temizle.click();
        //7- sepetiniz suan bos yazisini dogrula
        int sepettekiUrunSayisiTemizledenSonra = Integer.parseInt(  aydin.sepetimdekiSayi.getText());
        Assert.assertEquals(sepettekiUrunSayisiTemizledenSonra==0, "sepetimde urun var ");


    }

    @Test
    public void test19() throws InterruptedException {

        //TC01
        //1- login olmali
        LoginTest.loginTest();
        //2-hesabima tikla
        aydin.hesabimButton.click();
        //3-story manager tikla
        aydin.storeManagerButton.click();
        //4- takipciler tikla

        //   JavascriptExecutor js=(JavascriptExecutor)driver;
        // WebElement takipci=driver.findElement(By.xpath("(//span[@class='text'])[11]"));
        //  js.executeScript("arguments[0].scrollIntoView();",element);//elementi buldu

        actions
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .perform();
        Thread.sleep(3000);

        aydin.takipcilerButton.click();

        actions
                .sendKeys(Keys.PAGE_DOWN)
                .perform();

        //5- follover list yazisini dogrula

        Assert.assertTrue(aydin.followersYaziElementi.isDisplayed());
        //6- name yazisini dogrula
        Assert.assertTrue(aydin.nameYaziElementi.isDisplayed());

        //7- e posta yazisini dogrula
        Assert.assertTrue(aydin.e_postaYaziElementi.isDisplayed());


        //TC02 islemler tanimlanmali

        //1- islem yazi elementini dogrula
        Assert.assertTrue(aydin.islemYaziElementi.isDisplayed());

        //2- islemin altindaki  "delete" dogrula
        //  Assert.assertTrue(aydin.deleteElementi.isDisplayed());
        //3- Delete tikla
        Thread.sleep(1000);
        aydin.deleteElementi.click();
        //4-Cikan Alert cancel tikla
        driver.switchTo().alert().dismiss();

        //5-alert accep yapmadan once ki deger
        String alerOncekiDeger = (aydin.takipciSonucElementi.getAttribute("value"));

        //6- Delete tikla
        aydin.deleteElementi.click();
        //7-Cikan alert yazisini "Ok" tikla
        //driver.switchTo().alert().accept();
//8 Degisimi dogrula
        String alerSonrakikiDeger = (aydin.takipciSonucElementi.getAttribute("value"));
        Assert.assertTrue(alerOncekiDeger!=alerSonrakikiDeger);




    }




}




