package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import java.util.List;
public class Firdevs {
    public Firdevs() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[contains(text(),'Giriş Yap')]")
    public WebElement girisYap;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement mailTextBox;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTextBox;
    @FindBy(xpath = "//button[@name='login']")
    public WebElement girisYapButon;
    // TC2
    // @FindBy(xpath="//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-1074']")
    // public WebElement hesabimButton;
    @FindBy(xpath = "//li[@id='menu-item-1074']")
    public WebElement hesabimButton;
    @FindBy(xpath = "(//*[text()='Hesabım'])[1]")
    public WebElement hesabimYazisi;



    // TC2


    // @FindBy(xpath="//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-1074']")
    // public WebElement hesabimButton;




    @FindBy(xpath = "(//p[@class='text-uppercase text-center mb-0'])[1]")
    public WebElement siparislerKutusu;
    @FindBy(xpath = "(//p[@class='text-uppercase text-center mb-0'])[2]")
    public WebElement indirmelerKutusu;
    @FindBy(xpath = "(//p[@class='text-uppercase text-center mb-0'])[3]")
    public WebElement adreslerKutusu;
    @FindBy(xpath = "(//p[@class='text-uppercase text-center mb-0'])[4]")
    public WebElement hesapDetaylariKutusu;
    @FindBy(xpath = "(//p[@class='text-uppercase text-center mb-0'])[5]")
    public WebElement favorilerimKutusu;
    @FindBy(xpath = "(//p[@class='text-uppercase text-center mb-0'])[6]")
    public WebElement cikisKutusu;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li[2]")
    public WebElement storeManager;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li[3]")
    public WebElement siparislerInDash;
    @FindBy(xpath = " //*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li[4]")
    public WebElement indirmelerInDash;
    @FindBy(xpath = " //*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li[5]")
    public WebElement adresInDash;
    @FindBy(xpath = " //*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li[6]")
    public WebElement hesapDetaylariInDash;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li[7]")
    public WebElement randavularInDash;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li[8]")
    public WebElement favorilerimInDash;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li[9]")
    public WebElement destekTalepleriInDash;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li[10]")
    public WebElement takipInDash;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li[11]")
    public WebElement cikisInDash;
    //Us9
    @FindBy(xpath = "//*[@id=\"wcfm_menu\"]/div[5]/a/span[2]")
    public WebElement urunlerButonu;
    @FindBy(xpath = "//*[@id=\"add_new_product_dashboard\"]/span[2]")
    public WebElement urunEkleButonu;
    @FindBy(xpath = " //div[@class='page_collapsible products_manage_shipping simple variable nonvirtual booking non-accommodation-booking non-pw-gift-card collapse-close collapse-open']")
    public WebElement shippingButonu;
    @FindBy(xpath = "//input[@id='weight']")
    public WebElement weightText;
    @FindBy(xpath = "//input[@id='length']")
    public WebElement lengthText;
    @FindBy(xpath = "//input[@id='width']")
    public WebElement width;
    @FindBy(xpath = "//input[@id='height']")
    public WebElement height;
    @FindBy(xpath = "//select[@id='_wcfmmp_processing_time']")
    public WebElement processingTime;
    //us20
    @FindBy(xpath = "(//span[@class='text'])[16]")
    public WebElement incelemeler;
    @FindBy(xpath = "//th[@aria-label='Author']")
    public WebElement author;
    @FindBy(xpath = "//th[@aria-label='Comment']")
    public WebElement comment;
    @FindBy(xpath = "//th[@aria-label='Rating']")
    public WebElement rate;
    @FindBy(xpath = "//th[@aria-label='Dated']")
    public WebElement date;


}