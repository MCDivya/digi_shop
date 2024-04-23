package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTestProductTest {
	public static void main(String [] args) throws InterruptedException{
		//Launch browser
		
		WebDriver driver=new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		
		//Navigate web page
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.id("small-searchterms")).sendKeys("laptop");
		
				
	}

}
