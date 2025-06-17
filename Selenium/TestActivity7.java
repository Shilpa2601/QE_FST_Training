package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivity7 {
	public static void main(String[] args) {
		
WebDriver driver = new FirefoxDriver();
		
		// Open the browser
		driver.get("https://training-support.net/webelements/dynamic-controls");
		
		System.out.println(driver.getTitle());
		
		//Find the text field
		WebElement textBox=driver.findElement(By.id("textInput"));
		
		// check if the text field is enabled and print it
		System.out.println(textBox.isEnabled());  // false
		
		//Click "Enable input" button 
		driver.findElement(By.id("textInputButton")).click();
		
		//Check if text field is enabled again & print it
		System.out.println(textBox.isEnabled());  //true
		
		driver.quit();
		
	}

}
