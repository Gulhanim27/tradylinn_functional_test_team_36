package tests.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.WepTablesPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Example_WepTables {
    WepTablesPage webTables;
    @Test(priority =-5)
    public void test01() {
        //Bir class oluşturun : C02_WebTables
 //login( ) metodun oluşturun ve oturum açın.
     webTables = new WepTablesPage();

// https://www.hotelmycamp.com admin/HotelRoomAdmin adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("hotelAdminUrl"));
// Username : manager
//Password : Manager1!
        webTables.userName.sendKeys(ConfigReader.getProperty("hotelUserName"));
        webTables.password.sendKeys(ConfigReader.getProperty("hotelPassword"));
        webTables.submitButton.click();
//table( ) metodu oluşturun

    }

    @Test(priority =-4)
    public void tableMethodu() {
         webTables = new WepTablesPage();
        //Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody

        System.out.println("tableMethodu sutunSayisi"+webTables.sutun1.size());

//Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.
        System.out.println("tableMethodu tumbody"+webTables.tumbody.getText());
//printRows( ) metodu oluşturun //tr

    }

    @Test(priority = -3)
    public void printRows() {
        //table body’sinde bulunan toplam satir(row) sayısını bulun.

        System.out.println("printRows toplam satir"+webTables.toplamrow.size());
//Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
        for (WebElement each:webTables.toplamrow){
            System.out.println(each.getText());
        }
// 4.satirdaki(row) elementleri konsolda yazdırın.
        System.out.println("printRows row elemetler"+webTables.rowElement);
        for (WebElement each: webTables.rowElement){
            System.out.println(each.getText());
        }


    }
    // ● printCells( ) metodu oluşturun //td

    @Test(priority = -2)
    public void printCells() {
        //table body’sinde bulunan toplam hücre(cell) sayısını bulun.
        System.out.println("print cells toplam hucre"+webTables.cellSum.getSize()+"tane cell var");
       // ○ Table body’sinde bulunan hücreleri(cells) konsolda yazdırın.
        System.out.println("printCells hucrelerin hepsi"+webTables.cells);
        for (WebElement each:webTables.cells){
            System.out.println(each.getText());
        }
    }
    //● printColumns( ) metodu oluşturun
    @Test(priority = -1)
    public void printColumns() {
        //table body’sinde bulunan toplam sutun(column) sayısını bulun.
        System.out.println("printColumns toplam sutun"+webTables.sutunSum.getSize());
        //  ○ Table body’sinde bulunan sutunlari(column) konsolda yazdırın.
        System.out.println("printColumns sutunlar"+webTables.sutuns);
        for (WebElement each:webTables.sutuns){
            System.out.println(each.getText());

        }
        //○ 5.column daki elementleri konsolda yazdırın.
        System.out.println("column elemetler"+webTables.columnElement);
        for (WebElement each: webTables.columnElement){
            System.out.println(each.getText());
        }
    }


}
