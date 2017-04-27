package NopCommarceBook;

import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

/**
 * Created by Dell on 23/04/2017.
 */
public class MyStepdefs extends BasePage  {

    HomePage homePage = new HomePage();
    Books books = new Books();
    RegistrationPage registrationPage = new RegistrationPage();


    @Given("^User is on Homepage$")
    public void userIsOnHomepage() {
        homePage.userIsOnHomePage();
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='topic-block-title']/h2")).getText().contains("Welcome to our store"), "User is not on Homepage");
        homePage.navigateToRegistration();
        registrationPage.registerNewUSer();
    }


    @Then("^User Should click on a Book \"([^\"]*)\"$")
    public void User_Should_click_on_a_Book(String arg1) {
        books.selectBook("First Prize Pies");
        Assert.assertTrue(driver.getCurrentUrl().contains("first-prize-pies"), "User has not selected the book" );
    }


    @When("^User navigates to Books category$")
    public void User_navigates_to_Books_category() {
        homePage.navigateToBooks();
        Assert.assertTrue(driver.getCurrentUrl().contains("books"));
    }


    @When("^enters all details to send email to a friend$")
    public void enters_all_details_to_send_email_to_a_friend() {
        books.clickOnEmailAndFillDetailsOfAFriendAndSendABook();

    }

    @Then("^User should able to send email to a friend successfully$")
    public void User_should_able_to_send_email_to_a_friend_successfully() {
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='page-body']/div[2]")).isDisplayed());

    }

    @And("^Selects any \"([^\"]*)\"$")
    public void selectsAny(String name)  {
        books.selectBook(name);
        books.verifySelectedrodcutIsDisplayedInTitle(name);
    }
}
