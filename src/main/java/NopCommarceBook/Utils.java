package NopCommarceBook;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Dell on 23/04/2017.
 */
public class Utils extends BasePage {

    //re-usable meyhof for click on Element
    public static void clickOnElement(By by){
        driver.findElement(by).click();
    }

    // re-usable method for typing text into element (instead of sendKeys())
    public static void typeText(By by, String text){
        //clearing any existing text from the element
        driver.findElement(by).clear();
        //sending your text to the locator by
        driver.findElement(by).sendKeys(text);
    }

    //Reusable Method for selectByValue
    public static void selectValue(By by, String value){
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }
    //Reusable method for selectByIndex
    public static void selectIndex(By by, int i){
        Select select;
        new Select(driver.findElement(by)).selectByIndex(i);
    }

    //Reusable method for selecting checkbox
    public static void selectCheckbox(By by){
        if (!driver.findElement(by).isSelected()){   // check if the checkbox is NOT ticked/selected
            driver.findElement(by).click();          // tick on the checkbox
        }
    }

    //Reusable method for selectByVisibleText(NameLassObject)
    public static void selectText(By by, String text){

        new Select(driver.findElement(by)).selectByVisibleText(text);
    }

    //Reusable method for date stamp
    public static String dateStamp(){
        DateFormat dateFormat = new SimpleDateFormat("ddmmyyhhss");
        Date date = new Date();
        String date1 = dateFormat.format(date);
        return date1;
    }
}
