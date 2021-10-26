package pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class BasePage extends PageObject {
    public BasePage(){

    }
    public BasePage(WebDriver driver){
        super(driver);
    }
    public final int TIMEOUT_WAIT_FOR_ELEMENT = 30;

    public void waitForElementToBeVisible(WebElementFacade element) {
        element.withTimeoutOf(Duration.ofSeconds(TIMEOUT_WAIT_FOR_ELEMENT)).waitUntilVisible();
    }
    public void waitForElementToBeReady(WebElementFacade element){
        element.withTimeoutOf(Duration.ofSeconds(TIMEOUT_WAIT_FOR_ELEMENT)).waitUntilClickable();
    }
}
