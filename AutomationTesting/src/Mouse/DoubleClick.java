package Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoubleClick {

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
				
				//CLICK ON BUTTON
				driver.findElement(By.xpath("//section[.='Button']")).click();
				Thread.sleep(2000);
				//click on double click
				driver.findElement(By.partialLinkText("Double Click")); 
				

	}

}
