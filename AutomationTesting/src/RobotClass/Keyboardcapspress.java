package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboardcapspress {

	public static void main(String[] args) throws AWTException, InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		Robot robo =new Robot();
		robo.keyPress(KeyEvent.VK_CAPS_LOCK);
		robo.keyPress(KeyEvent.VK_D);
		robo.keyRelease(KeyEvent.VK_CAPS_LOCK);
		robo.keyRelease(KeyEvent.VK_D);
		robo.keyPress(KeyEvent.VK_I);
		robo.keyRelease(KeyEvent.VK_I);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyPress(KeyEvent.VK_Y);
		robo.keyRelease(KeyEvent.VK_Y);
		robo.keyPress(KeyEvent.VK_A);
		robo.keyRelease(KeyEvent.VK_A);
		
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
