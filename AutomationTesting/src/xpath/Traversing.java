package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Traversing {

	public static void main(String[] args) throws InterruptedException {
		//Launch Chrome Browser
				WebDriver driver=new ChromeDriver();
				
				//Maimze the web page
				driver.manage().window().maximize();
				
				//navigate to web page
				driver.get("https://demowebshop.tricentis.com/");
				Thread.sleep(2000);
				//to click book
				driver.findElement(By.xpath("//a[.='14.1-inch Laptop']/../..//span")).click();
				Thread.sleep(2000);
			}
	}


