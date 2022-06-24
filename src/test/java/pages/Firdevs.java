package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Firdevs {
    public Firdevs() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

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
}
