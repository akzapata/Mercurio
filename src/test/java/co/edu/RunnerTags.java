package co.edu;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(features = "src/test/resources/Features/",
		tags = "@P",
		glue = "co.edu.eafit.definitions",
		snippets = SnippetType.CAMELCASE,
		plugin = {
			        "pretty"} )
public class RunnerTags {

}
