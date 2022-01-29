package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/salihsanliturk/IdeaProjects/mycucumberproject/src/test/resources/features",
        glue = "stedefinitions"
)

public class Runner {
}
