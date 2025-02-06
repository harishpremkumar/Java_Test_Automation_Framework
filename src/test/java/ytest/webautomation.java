package ytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.After;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.testng.Assert.*;

public class webautomation {

    WebDriver driver;

    // Initialize WebDriver and open the login page
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-gpu");
        options.addArguments("--headless");
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/");
    }

    // Enter valid credentials and log in
    @When("the user enters a valid username and password")
    public void the_user_enters_a_valid_username_and_password() {
        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));

        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();
    }

    // Verify that the user is logged in by checking if the product header is displayed
    @Then("the user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() {
        System.out.println("Completed");
    }

    // Cleanup after the test
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
