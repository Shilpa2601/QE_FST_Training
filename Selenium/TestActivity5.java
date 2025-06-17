package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivity5 {
	public static void main(String[] args) {
		
WebDriver driver = new FirefoxDriver();
		
		// Open the browser
		driver.get("https://training-support.net/webelements/dynamic-controls");
		
		System.out.println(driver.getTitle());
		
		//Find the check box input element
		WebElement checkBox=driver.findElement(By.id("checkbox"));
		
		// check if it is displayed
		System.out.println(checkBox.isDisplayed());  // true
		
		//Click "Remove checkbox"
		driver.findElement(By.cssSelector("button.svelte-sfj3o4")).click();
		
		//Check if it is visible again & print the result
		System.out.println(checkBox.isDisplayed());  //false
		
		driver.quit();
		
	}

}
