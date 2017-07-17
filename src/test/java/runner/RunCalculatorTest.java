package runner;

/**
 * Created by juan.hernandez on 7/14/17.
 */



import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = { "pretty", "html:target/cucumber" },
        glue = "steps",
        features = "classpath:cucumber/withdrawal.feature",
        snippets = SnippetType.CAMELCASE
)
public class RunCalculatorTest {
}
