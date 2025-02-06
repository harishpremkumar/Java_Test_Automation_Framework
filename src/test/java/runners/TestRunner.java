package runners;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.BeforeClass;

import java.nio.file.Paths;

@CucumberOptions(
    features = "src/test/resources/features/login.feature",  // Set default feature file path (can be overridden)
    glue = "ytest",                                          // Path to step definition classes
    plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

    @BeforeClass
    public static void setUp() {
        // Dynamically set the  feature file path (if needed)
        String projectPath = System.getProperty("user.dir"); // Get the base project path
        String featureFilePath = "src/test/resources/features/login.feature"; // Relative path to the feature file
        String fullFeatureFilePath = Paths.get(projectPath, featureFilePath).toString();
        
        // Print the full feature file path for debugging
        System.out.println("Feature file path: " + fullFeatureFilePath);
        
        // You can use this path dynamically if required for loading features or other configurations
    }
}
