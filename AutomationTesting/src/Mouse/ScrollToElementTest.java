package Mouse;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElementTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		Thread.sleep(4000);

		WebElement downloadLink=driver.findElement(By.linkText("jdk-8u401-linux-aarch64.rpm"));
		Thread.sleep(4000);

		
		Actions action = new Actions(driver);
		Thread.sleep(4000);

		action.scrollToElement(downloadLink).perform();
		driver.quit(); 
		
	}
	
}
