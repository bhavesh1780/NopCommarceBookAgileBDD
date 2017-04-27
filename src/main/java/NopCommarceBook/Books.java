package NopCommarceBook;

import org.openqa.selenium.By;
import org.testng.Assert;


/**
 * Created by Dell on 23/04/2017.
 */
public class Books extends Utils {

    public void selectBook(String nameofthebook){
       driver.findElement(By.linkText(nameofthebook)).click();

    }

    public void verifySelectedrodcutIsDisplayedInTitle(String name1){
        Assert.assertTrue(driver.findElement(By.xpath("//strong[contains(.,'"+name1+"')]")).getText().contains(name1), "wrong product selected");
    }

    public void clickOnEmailAndFillDetailsOfAFriendAndSendABook(){
        clickOnElement(By.xpath("//input[@class='button-2 email-a-friend-button']"));
        Assert.assertTrue(driver.findElement(By.xpath("//h1[contains(.,'Email a friend')]")).isDisplayed());
        typeText(By.id("FriendEmail"),"lotus7143@gmail.com");
        typeText(By.id("YourEmailAddress"),"lotus7143@gmail.com");
        typeText(By.id("PersonalMessage"),"Gift from friend");
        clickOnElement(By.xpath("//input[@class='button-1 send-email-a-friend-button']"));

    }
}
