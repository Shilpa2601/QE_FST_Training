package Activity;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {

	// WebDriver declaration and WebDriverWait declaration
	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void setUp() {
		// Initialize driver
		driver = new FirefoxDriver();

		// Initialize wait
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Open the page
		driver.get("https://training-support.net/webelements/login-form/");
	}

	@Test(priority = 1)
	public void verifyPageTitle() {
		// Assert page title
		assertEquals(driver.getTitle(), "Selenium: Login Form");
	}

	// Test for unsuccessful login
	@Test(priority = 2)
	public void loginFailTest() {

		// Find the enter username
		driver.findElement(By.id("username")).sendKeys("admin1");

		// Find the enter password
		driver.findElement(By.id("password")).sendKeys("wrongPassword");

		// Find and click the submit button
		driver.findElement(By.xpath("//button[text()='Submit']")).click();

		// Find and print the error
		String message = driver.findElement(By.id("subheading")).getText();

		// Assertions
		assertEquals(message, "Invalid credentials");
	}

	// Test for successful login
	@Test(priority = 3)
	public void loginSuccessTest() {
		// Find the enter username
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");

		// Find the enter password
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("password");

		// Find and click the submit button
		driver.findElement(By.xpath("//button[text()='Submit']")).click();

		// Find and print the error
		String message = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1.text-emerald-500"))).getText();

		// Assertions
		assertEquals(message, "Login Success!");
	}

	@AfterClass
	public void tearDown() {

		// Close the browser
		driver.quit();
	}

}
