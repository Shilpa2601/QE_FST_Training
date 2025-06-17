package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivity4 {
	public static void main(String[] args) {
		
		/*
		 System.out.println(driver.findElement(By.xpath("//h3[text()="Heading #3']")).getText());
		Color headingColor = color.fromString(driver.findElement(By.xpath("//h5[text()="Heading #5']")).getCssValue("color"));
		System.out.println(heading
		*/
		
		// Initialize driver
		WebDriver driver = new FirefoxDriver();
		
		// Open the browser or page
		driver.get("https://training-support.net/webelements/target-practice");
		
		// Print the title page
		System.out.println(driver.getTitle());
		
		//Get heading 3
		String h3 = driver.findElement(By.xpath("//h3[@class=\'text-3xl font-bold text-orange-600']")).getText();

		// Print
		System.out.println("Color : " +h3);

		//Get heading 5
		String h5 = driver.findElement(By.xpath("//h5[@class=\'text-3xl font-bold text-purple-600']")).getCssValue("color");
		
		//Print
		System.out.println("Text : " +h5);
		
		//Find the purple button and print all it's classes
		String purple = driver.findElement(By.className("bg-purple-200")).getAttribute("class");
		
		//Print
		System.out.println("Classes : " +purple);
		
		//Find the the slate button and print it's text
		String slate = driver.findElement(By.className("bg-slate-200")).getText();
		System.out.println("Text : " +slate);
		
		//Close the browser
		driver.quit();  
	}

}
