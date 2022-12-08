package stepsDefinition;
import org.jbehave.core.annotations.*;
import org.jbehave.core.steps.Steps;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class searchOnGoogle extends Steps {
    private static WebDriver driver = null;
    @Given("I open the browser")
    public void openingABrowser() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "/Users/bryantnguyen1801/chromedriver");
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
        }
        driver.manage().deleteAllCookies();

    }
    @When("I enter $url and hit enter key")
    public void enteringAUrl(String url) {
        driver.get("http://google.com");
    }
    @When("$title is displayed")
    public void lookingForTheTitle(String title) {
        org.junit.Assert.assertEquals(title, driver.getTitle());
    }

    @When("I input keyword $key in field")
    public void inputField(String key) {
        WebElement element=driver.findElement(By.xpath("//input[@title='Search']"));
        element.sendKeys(key);
        element.sendKeys(Keys.RETURN);
    }

    @Then("Google responses the results, and I wanna verify $result that the search correct or not")
    public void assertTheResult(String result) {
        org.junit.Assert.assertEquals(result, driver.getTitle());
    }
}