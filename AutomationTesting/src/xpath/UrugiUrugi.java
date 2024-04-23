package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrugiUrugi {

	public static void main(String[] args) throws InterruptedException {

		//Launch Chrome Browser
		WebDriver driver=new ChromeDriver();
		
		//Maimze the web page
		driver.manage().window().maximize();
		
		//navigate to web page
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		
		//to search the song
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Urugi Urugi");
		Thread.sleep(2000);
	}

}
