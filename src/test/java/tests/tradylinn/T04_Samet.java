package tests.tradylinn;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Samet;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;



public class T04_Samet {
    @Test
    public void test01() throws InterruptedException {

        Samet samet=new Samet();

        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));

        ReusableMethods.waitForVisibility(samet.loginButonu,30);
        samet.loginButonu.click();
        ReusableMethods.waitForVisibility(samet.emailTextBox,30);
        samet.emailTextBox.sendKeys(ConfigReader.getProperty("userName"));
        samet.passwordTextBox.sendKeys(ConfigReader.getProperty("password"));
        samet.girisButonu.click();

        ReusableMethods.waitForVisibility(samet.hesabimButonu,30);
        samet.hesabimButonu.click();
        ReusableMethods.waitForVisibility(samet.storeManagerButonu,30);

        samet.storeManagerButonu.click();
        ReusableMethods.waitForVisibility(samet.geriOdemeButonu,30);

        Actions action=new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN);
        samet.geriOdemeButonu.click();

        Thread.sleep(10000);

        action.sendKeys(Keys.PAGE_DOWN);

        Assert.assertTrue(samet.requestId.isDisplayed());
        Assert.assertTrue(samet.orderId.isDisplayed());
        Assert.assertTrue(samet.amount.isDisplayed());
        Assert.assertTrue(samet.type.isDisplayed());
        Assert.assertTrue(samet.reason.isDisplayed());

    }
}
