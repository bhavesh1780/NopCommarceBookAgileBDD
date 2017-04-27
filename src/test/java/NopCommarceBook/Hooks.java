package NopCommarceBook;

import cucumber.annotation.After;
import cucumber.annotation.Before;

import java.util.concurrent.TimeUnit;

/**
 * Created by Dell on 23/04/2017.
 */
public class Hooks extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();

    @Before
    public void openBrowser() {
        browserSelector.selectBrowser();
//        driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void closeBrowser(){
        driver.quit();
    }
}
