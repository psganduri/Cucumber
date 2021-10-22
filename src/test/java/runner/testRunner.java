package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\psgan\\OneDrive\\Documents\\Excercises\\MyBackpack\\src\\test\\resources\\features\\Backpack.feature",glue = {"stepDefinitions"})
public class testRunner {

}
