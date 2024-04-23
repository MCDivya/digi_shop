package Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//maimize the browser"
				driver.manage().window().maximize();
		
		//Navigate to webpage
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		
		//Click  UI testing Concepts
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//section[.='Mouse Actions']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[.='Click & Hold']")).click();
		Thread.sleep(2000);
		
		WebElement circle = driver.findElement(By.id("circle"));
		
		
		Actions action = new Actions(driver);
		
		//click and hold the circle
		
		action.clickAndHold(circle).perform();
		Thread.sleep(4000);
		
		//Release mouse
		action.release().perform();
		
	
		

	}

}
