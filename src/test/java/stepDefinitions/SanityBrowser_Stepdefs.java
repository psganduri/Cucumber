package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SanityBrowser_Stepdefs {
    WebDriver driver;

    @Given("Kmart application is launched on the browser")
    public void kmartApplicationIsLaunchedOnTheBrowser() throws Throwable {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\psgan\\OneDrive\\Documents\\Excercises\\MyBackpack\\src\\test\\resources\\drivers\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://www.kmart.com.au/");
        System.out.println("Launched application sucessfully ***");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[@aria-label='Close']")).isDisplayed();
            driver.findElement(By.xpath("//a[@aria-label='Close']")).click();

    }

    @When("user clicks on {string} button on homepage")
    public void userClicksOnButtonOnHomepage(String arg0) throws Throwable {
        driver.findElement(By.xpath("//div[@class='signin']/a[@id='SignInLink']")).isDisplayed();
        System.out.println("Signin is displayed on main page");
        driver.findElement(By.xpath("//div[@class='signin']/a[@id='SignInLink']")).click();
        System.out.println("clicked on signin");
        Thread.sleep(4000);
    }

    @And("enters valid {string} in usermane txtbox")
    public void entersValidInUsermaneTxtbox(String arg0) throws Throwable{
        driver.findElement(By.xpath("//div/input[@name='logonId']")).sendKeys("psganduri@gmail.com");
        Thread.sleep(4000);
    }

    @And("enters valid {string} in password txtbox")
    public void entersValidInPasswordTxtbox(String arg0) throws Throwable{
        driver.findElement(By.xpath("//input[@name='logonPassword']")).sendKeys("Keane@555");
        Thread.sleep(2000);
    }

    @And("clicks on {string} button")
    public void clicksOnButton(String arg0) throws Throwable{
        driver.findElement(By.xpath("//a[@id='WC_AccountDisplay_links_2']")).click();
        Thread.sleep(4000);
    }

    @Then("user is logged in sucessfully")
    public void userIsLoggedInSucessfully() {
    }
}
