package Activity;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity15_1 {
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	     Actions builder = new Actions(driver);
	     
			// Open the browser
			driver.get(" https://training-support.net/webelements/tables");
			driver.manage().window().maximize();
			
			System.out.println(driver.getTitle());
			
			//Find the no of rows & cols in the table and Print them
			List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
			System.out.println("Number of rows : " +rows.size());
			
			List<WebElement> cols = driver.findElements(By.xpath("//table/thead/tr/th"));
			System.out.println("Number of cols : " +cols.size());
			
			// Find and click the "add row" button
			driver.findElement(By.xpath("//button[contains(text(), 'Add Row')]")).click();
			
	/*Find the newly added row and add the following data
			id:10   bookname : Hover Car Racer author : Matthew Reilly
			ASIN : 0330440160 Price : $7.99      */
			String[] dataToAdd = {"10", "Hover Car Racer", "Matthew Reilly", "030440160", "$7.9"};
			
			for(int i=0; i<dataToAdd.length; i++) {
				By lastRowCells = By.xpath("//table/tbody/tr[last()]/td[" + (i + 1) + "]");
				driver.findElement(lastRowCells).clear();
				driver.findElement(lastRowCells).sendKeys(dataToAdd[i]);
				
			}
			// Print the data from the newly added row
			System.out.println(driver.findElement(By.xpath("//table/tbody/tr[last()]")).getText());
			
			//Close the browser
			driver.quit();
	}

}
