package Activity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity8 {
	public static void main(String[] args) {
		
     WebDriver driver = new FirefoxDriver();
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     Actions builder = new Actions(driver);
     
		// Open the browser
		driver.get(" https://training-support.net/webelements/mouse-events");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		//find all the buttons
		WebElement cargoLock = driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
		WebElement cargoToml = driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
		WebElement srcFile = driver.findElement(By.xpath("//h1[text()='src']"));
		WebElement targetFile = driver.findElement(By.xpath("//h1[text()='target']"));

		//Left click on the Cargo.lock button and move cursor to the cargo.toml button and then click it
		builder.click(cargoLock).pause(5000).click(cargoToml).build().perform();
		
		//print confirmation text at the end of the sequence
		System.out.println(driver.findElement(By.id("result")).getText());
		
		// double click on the src button and Right click on the target button 
		builder.doubleClick(srcFile).pause(5000).contextClick(targetFile).perform();
		
		//select open
		  builder.click(driver.findElement(By.cssSelector("span.ml-3"))).pause(5000).build().perform();
		   
		//print confirmation text at the end of the sequence
		System.out.println(driver.findElement(By.id("result")).getText());
		
		driver.quit();
	}

}
