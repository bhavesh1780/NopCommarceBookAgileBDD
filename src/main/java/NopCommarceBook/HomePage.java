package NopCommarceBook;

import org.openqa.selenium.By;
import org.testng.Assert;

/**
 * Hello world!
 *
 */
public class HomePage extends Utils
{
    public void userIsOnHomePage(){
        driver.get("http://demo.nopcommerce.com/");

    }

    public void navigateToRegistration(){
        clickOnElement(By.linkText("Register"));
        Assert.assertTrue(driver.getCurrentUrl().contains("register"),"User is not on register page");
    }

    public void navigateToBooks(){
        clickOnElement(By.linkText("Books"));
    }
}
