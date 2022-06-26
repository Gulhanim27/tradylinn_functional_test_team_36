package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;



   

// loketleri buraya koy



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



   // @FindBy(xpath="//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-1074']")
  // public WebElement hesabimButton;

    @FindBy(xpath="//li[@id='menu-item-1074']")
    public WebElement hesabimButton;

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

    @FindBy(xpath="(//figure[@class='product-media'])[2]")
    public WebElement bebek;

    @FindBy(xpath="(//figure[@class='product-media'])[3]")
    public WebElement cicek;

    @FindBy(xpath="(//figure[@class='product-media'])[2]")
    public WebElement saat;

    @FindBy(xpath="(//figure[@class='product-media'])[2]")
    public WebElement vazo;

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


                              //  us_04












}
