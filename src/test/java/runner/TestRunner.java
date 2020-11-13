package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import utils.LogHelper;
import java.util.logging.Level;
import java.util.logging.Logger;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/",
        glue = {"seleniumgluecode"},
        plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:resources/cucumber-reports/report.html"},
        tags = {"~@ignore"}
)

public class TestRunner {

    private static final Logger LOGGER = LogHelper.getLogger(TestRunner.class);

    @BeforeClass()
    public static void setUp(){
        LOGGER.log(Level.INFO, "Test execution begins...");
    }

    @AfterClass
    public static void teardown(){
        LOGGER.log(Level.INFO, "Test execution finish...");
    }
}
