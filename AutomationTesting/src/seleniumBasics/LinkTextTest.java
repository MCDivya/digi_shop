package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextTest {
	public static void main(String[] args)throws InterruptedException{
		//Launch the Browser
				WebDriver driver=new ChromeDriver();
				//Maximize the browser
				 driver.manage().window().maximize();
				//navigate to Web page
				 driver.get("https://demowebshop.tricentis.com/");
				 Thread.sleep(2000);
				 //TO CLICK ON REGISTER LINK
				 driver.findElement(By.linkText("Register")).click();
				 Thread.sleep(3000);
				 
				 //To click on shopping cart
				 driver.findElement(By.linkText("Shopping cart")).click();
				 Thread.sleep(3000);
				 
				//To click on Books
				 driver.findElement(By.linkText("BOOKS")).click();
				 Thread.sleep(3000);
				 
				 //To Close the browser
				 driver.quit();
	}
}
