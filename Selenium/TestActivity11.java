package Activity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       WebDriver driver = new FirefoxDriver();
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		// Open the browser
		driver.get("https://training-support.net/webelements/dynamic-controls");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		//Find the checkbox on the page
		WebElement checkBox=driver.findElement(By.id("checkbox"));
		
		// click the "Toggle checkbox" button  to remove the checkbox
		driver.findElement(By.cssSelector("button.svelte-sfj3o4")).click();
		
		//wait for the checkbox to disappear
        wait.until(ExpectedConditions.invisibilityOf(checkBox));
        
		//Toggle the checkbox again
		driver.findElement(By.cssSelector("button.svelte-sfj3o4")).click();
		
		//Wait for it to appear and then select it
		wait.until(ExpectedConditions.visibilityOf(checkBox));
		checkBox.click();

	}

}
