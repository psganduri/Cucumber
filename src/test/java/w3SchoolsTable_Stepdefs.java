import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenity.htmlTable_Steps;

public class w3SchoolsTable_Stepdefs {
    @Steps
    htmlTable_Steps htmlTable_steps;

    @Given("w{int}schools application is launched successfully")
    public void wSchoolsApplicationIsLaunchedSuccessfully(int arg0) throws Throwable {
        htmlTable_steps.launchApplicationPage();

    }

    @When("HTML table is displayed")
    public void htmlTableIsDisplayed() {
        htmlTable_steps.verifyTablePresence();
    }

    @Then("data in HTML table is displayed as below")
    public void dataInHTMLTableIsDisplayedAsBelow() {
    }
}
