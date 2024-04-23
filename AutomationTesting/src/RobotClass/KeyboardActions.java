package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardActions {

	
		public static void main(String[] args) throws AWTException, InterruptedException {
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			
			//click on Register
			driver.findElement(By.linkText("Register")).click();
			Thread.sleep(2000);
			
			//driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Divya");
			driver.findElement(By.id("FirstName")).sendKeys("Divya");
			Thread.sleep(2000);
			
			Robot robo =new Robot();
			robo.keyPress(KeyEvent.VK_CONTROL);
			robo.keyPress(KeyEvent.VK_A);
			Thread.sleep(2000);
			
			robo.keyPress(KeyEvent.VK_C);
			robo.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(2000);
			
			robo.keyPress(KeyEvent.VK_TAB);
			robo.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			
			robo.keyPress(KeyEvent.VK_CONTROL);
			robo.keyPress(KeyEvent.VK_V);
			robo.keyRelease(KeyEvent.VK_CONTROL);
			
			Thread.sleep(3000);
			driver.quit();
			
			
			

	}

}
