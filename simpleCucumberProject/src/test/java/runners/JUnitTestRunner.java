package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(glue = "", features = "", dryRun = false, monochrome = true, tags = "", snippets = SnippetType.UNDERSCORE)
public class JUnitTestRunner {

}
