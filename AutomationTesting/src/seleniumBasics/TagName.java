package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) throws InterruptedException{
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		//Maximize the browser
		 driver.manage().window().maximize();
		//navigate to Web page
		 driver.get("https://demowebshop.tricentis.com/");
		 Thread.sleep(2000);
		//TO CLICK 
		 driver.findElement(By.tagName("a")).click();
		 driver.findElement(By.tagName("input")).sendKeys("shoes");
		 driver.findElement(By.tagName("input")).click();
		 Thread.sleep(3000);

	}

}
