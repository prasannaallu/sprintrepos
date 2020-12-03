package runner;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;

//@RunWith(Cucumber.class) 
@CucumberOptions(
features = "features/cart.feature"
,glue={"stepDefinitions"},
monochrome=true,
plugin= {"html:target/Destination"}
)
public class testrunner extends AbstractTestNGCucumberTests {
}
