package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pathByTraversing {

	public static void main(String[] args) throws InterruptedException {
		//launch browser
		WebDriver driver=new ChromeDriver();
		
		//Mamize the browser
		driver.manage().window().maximize();
		
		//Navigate to webpage
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//Click on Books
		driver.findElement(By.partialLinkText("Books")).click();
		String expectedResult="51.0";
		
		//Validate the price of science Book
		String actualResult=driver.findElement(By.xpath("//a[.='Science']/../..//span[@class='price actual-price']")).getText();
	   
		//System.out.println(actualResult);
		if(actualResult.equals(expectedResult)) 
		{
			System.out.println("Actual Result:" + actualResult);
			System.out.println("Expected Result:" + expectedResult);
			System.out.println("Test Case Pass");
			
			
			
		}
		else
		{
			System.out.println("Actual Result:" + actualResult);
			System.out.println("Expected Result:" + expectedResult);
			System.out.println("Test Case Fail");
			
			
			
		}
		
		
		//close browser
		driver.quit();

	}

}
