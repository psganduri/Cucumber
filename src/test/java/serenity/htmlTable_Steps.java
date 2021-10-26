package serenity;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import pageObjects.w3SchoolsHTMLTables;

public class htmlTable_Steps {
    w3SchoolsHTMLTables w3shtmlTable;

    @Step
    public void launchApplicationPage(){
        w3shtmlTable.launcw3schoolsPage();
    }
    @Step
    public void verifyCustTable(){
        w3shtmlTable.verifytableHeaders();
    }

    public void verifyTablePresence() {
        w3shtmlTable.waituntilTimeOutForElement();
    }
}
