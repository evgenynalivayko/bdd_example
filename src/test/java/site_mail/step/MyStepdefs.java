package site_mail.step;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;


/**
 * Created by enalivayko on 13.02.2017.
 */
public class MyStepdefs {

    private WebDriver driver;

    @Given("^I have open the browser$")
    public void openBrowser() {
        driver = new FirefoxDriver();
    }

    @When("^I open Facebook website$")
    public void goToFacebook() {
        driver.get("https://www.facebook.com");
    }

    @Then("^Login button displayed$")
    public void loginButton() {
        driver.findElement(By.id("loginbutton")).isDisplayed();
        driver.close();
    }

}
