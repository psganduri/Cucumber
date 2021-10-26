package pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.components.HtmlTable;
import org.openqa.selenium.support.FindBy;

public class w3SchoolsHTMLTables  extends BasePage{

    @FindBy(xpath = "//table[@id='customers']")
    WebElementFacade customersTable;

    public void launcw3schoolsPage(){
        getDriver().get("https://www.w3schools.com/html/html_tables.asp");
//        waitForElementToBeVisible(customersTable);
    }
    public void verifytableHeaders(){
        HtmlTable custTable = new HtmlTable(customersTable);
        custTable.getHeadings();


    }

    public void waituntilTimeOutForElement() {
        waitForElementToBeVisible(customersTable);
    }
}
