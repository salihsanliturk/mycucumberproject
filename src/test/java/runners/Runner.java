package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@employee_login_scenario_outline",
        dryRun = false


)
public class Runner {
}
/*
 * Runner is used to run feature files(Test Cases)
 * @RunWith(Cucumber.class) is used to run the classes.
 * @CucumberOptions :
 * -add path of features folder and step definitions folders,
 * -tags
 * -dryRun
 * -Report plugins
 * -failedRunner plugin
 * --------------
 * What is the role of features?
 * -features: path of features folder.
 * -glue : path of step definitions folder
 * -tags :to run individual or multiple features or scenarios
 * For example, If I pass same tag tp multiple feature, then all feature with that tag will run.
 * -dryRun : to check if there's any missing step definition (JAVA code)
 *         : dryRun can be TRUE or FALSE
 *         : dryRun = false --> default behaviour, it runs the test on the browser while checking the missing steps
 *         : dryRun = true --> don't run tests on the browser and checks if there's any missing step definition
 * */