package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Aydin {

    public Aydin(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Tc1

    @FindBy(xpath="//a[@class='login inline-type']")
    public WebElement loginButonu;

    @FindBy(xpath="//input[@id='username']")
    public WebElement emailTextBox;

    @FindBy(xpath="//input[@id='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath="//button[@value='Giriş Yap']")
    public WebElement girisButonu;

    // TC2



    @FindBy(xpath="//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-1074']")
    public WebElement hesabimButton;

    // @FindBy(xpath="//li[@id='menu-item-1074']")
    // public WebElement hesabimButton;


    @FindBy(xpath="//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--orders']")
    public WebElement siparislerButton;

    @FindBy(xpath="//a[@class='btn btn-dark btn-rounded btn-icon-right continue-shopping mb-4 mt-6']")
    public WebElement alisveriseDevamEtButonu;

    @FindBy(xpath="//input[@placeholder='Ürün arama']")
    public WebElement searchButton;

    @FindBy(xpath="//button[@name='add-to-cart']")
    public WebElement sepeteEkleButonu;



    @FindBy(xpath="(//figure[@class='product-media'])[1]")
    public WebElement masa;

    @FindBy(xpath="(//figure[@class='product-media'])[3]")
    public WebElement bebek;

    @FindBy(xpath="(//figure[@class='product-media'])[3]")
    public WebElement cicek;

    @FindBy(xpath="(//figure[@class='product-media'])[1]")
    public WebElement laptop;

    @FindBy(xpath="(//figure[@class='product-media'])[2]")
    public WebElement kilif;

    //TC3



    @FindBy(xpath="//i[@class='w-icon-cart']")
    public WebElement sepetimButonu;
    @FindBy(xpath="//a[@class='button wc-forward']")
    public WebElement sepetiGoruntule;

    @FindBy(xpath="(//span[@class='cart-count'])[1]")
    public WebElement sepetimdekiSayi;


    //TC4



    @FindBy(xpath="//span[@class='dropdown-wrapper']")
    public WebElement ulkeTextBox;
    @FindBy(xpath="//li[@id='select2-calc_shipping_country-result-6l3z-TR']")
    public WebElement turkiye;


    @FindBy(xpath="//input[@class='select2-search__field']")
    public WebElement sehirTextBoxSend;


    @FindBy(xpath="//span[@class='select2-selection select2-selection--single']")
    public WebElement sehirTextBoxKargo;

    @FindBy(xpath="//span[@class='select2-selection select2-selection--single']")
    public WebElement sehirTextBoxTikla;


    @FindBy(xpath="//input[@id='calc_shipping_city']")
    public WebElement ilceTextBox;


    @FindBy(xpath="//input[@placeholder='Posta kodu']")
    public WebElement postaKutusu;

    @FindBy(xpath="//button[@name='calc_shipping']")
    public WebElement fiyatiGuncelle;

    @FindBy(xpath="//p[@class='woocommerce-shipping-destination']")
    public WebElement gonderimHedefi;



    //Tc 5

    //div[@class='wc-proceed-to-checkout']
    @FindBy(xpath="//a[@class='button checkout wc-forward']")
    public WebElement odeme;

    @FindBy(xpath="//input[@id='billing_first_name']")
    public WebElement billingFirstName;


    @FindBy(xpath="//input[@id='payment_method_cod']")
    public WebElement payAtTheDoor;

    @FindBy(xpath="//button[@id='place_order']")
    public WebElement siparisiOnayla;


    @FindBy(xpath="(//span[@class='woocommerce-input-wrapper'])[1]")
    public WebElement isim;

    @FindBy(xpath="//input[@id='billing_last_name")
    public WebElement soyisim;


    @FindBy(xpath="//p[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received order-success']")
    public WebElement TesekkerYaziElementi;



    // US_04

    @FindBy(xpath = "//input[@title='Miktar']")
    public WebElement sepettekiUrunMiktariElementi;



    @FindBy(xpath = "//input[@title='Miktar']")
    public WebElement sepetEksiButonu;


    @FindBy(xpath = "(//button[@class='quantity-plus w-icon-plus'])[1]")
    public WebElement miktarPlus;

    @FindBy(xpath = "(//button[@class='quantity-minus w-icon-minus'])[1]")
    public WebElement miktarMinus;



    @FindBy(xpath = "//th[@class='product-price']")
    public WebElement fiyatYaziElementi;


    @FindBy(xpath = "//th[@class='product-quantity']")
    public WebElement miktarYaziElementi;


    @FindBy(xpath = "//th[@class='product-subtotal']")
    public WebElement araToplamYaziElementi;



    @FindBy(xpath = "//button[@value='Sepeti Yenile']")
    public WebElement sepetiYenile;

    @FindBy(xpath = "//button[@value='Temizle']")
    public WebElement temizle;



    @FindBy(xpath = "(//div[@class='quantity-wrapper'])[3]")
    public WebElement miktarStok;


    @FindBy(xpath = "//button[@name='apply_coupon']")
    public WebElement kuponElementi;

    //US19
    @FindBy(xpath = "//a[normalize-space()='Store Manager']")
    public WebElement storeManagerButton;


    @FindBy(xpath = "(//span[@class='text'])[11]")
    public WebElement takipcilerButton;

    @FindBy(xpath = "//div[@class='wcfm-container wcfm-top-element-container']")
    public WebElement followersYaziElementi;

    @FindBy(xpath = "//th[@aria-label='Name']")
    public WebElement nameYaziElementi;


    @FindBy(xpath = "//th[@aria-label='E-posta']")
    public WebElement e_postaYaziElementi;

    @FindBy(xpath = "//th[@aria-label='İşlem']")
    public WebElement islemYaziElementi;

    @FindBy(xpath = "//span[@data-tip='Delete']")
    public WebElement deleteElementi;

    @FindBy(xpath = "//div[@id='wcfm-followers_info']")
    public WebElement takipciSonucElementi;


    @FindBy(xpath = "//input[@id='quantity_62bca1957412f']")
    public WebElement miktarEkle;

    @FindBy(xpath = "//*[text()='9 ']")
    public WebElement miktarText;

    @FindBy(xpath = "//span[@id='select2-billing_state-container']")
    public WebElement faturaSehir;







}
