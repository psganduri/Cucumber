package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\psgan\\OneDrive\\Documents\\Excercises\\MyBackpack\\src\\test\\resources\\features\\Tables.feature",glue = {"stepDefinitions"})
public class testRunner {

}
