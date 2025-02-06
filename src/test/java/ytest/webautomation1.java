package ytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class webautomation1 {

    WebDriver driver;

    @BeforeTest
    public void setUp() {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HarishPremkumar\\AppData\\Local\\Programs\\Python\\Python310\\chromedriver.exe");

        // Create a ChromeOptions instance to add arguments
        ChromeOptions options = new ChromeOptions();

        // Add desired Chrome arguments
        options.addArguments("--disable-gpu");
        options.addArguments("--headless");
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");

        // Initialize ChromeDriver with options
        driver = new ChromeDriver(options);
    }

    @Test
    public void testLinkedInLoginPage() {
        // Open the LinkedIn login page
    	System.out.println("Test is running...");
        driver.get("https://www.linkedin.com/login");

        // Maximize the window (this is optional since we're using "--start-maximized")
        driver.manage().window().maximize();

        // Wait for a few seconds to view the page (ideally use WebDriverWait for elements)
        try {
            Thread.sleep(5000);  // Just for demonstration purposes; replace with waits in real tests
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterTest
    public void tearDown() {
        // Close the browser
        driver.quit();  // Always use quit() to properly close all browser windows
    }
}
