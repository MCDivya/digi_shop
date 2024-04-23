package Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ScrollFromOrginTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		Thread.sleep(4000);

		WebElement downloadLink=driver.findElement(By.linkText("jdk-8u401-linux-aarch64.rpm"));
		Thread.sleep(4000);

		
		Actions action = new Actions(driver);
		Thread.sleep(4000);

		//action.scrollToElement(downloadLink).perform();
		//Thread.sleep(4000);
		//
		//action.scrollByAmount(0, 500).perform();
		
		ScrollOrigin orgin=ScrollOrigin.fromElement(downloadLink);
		System.out.println(orgin.getxOffset());
		System.out.println(orgin.getyOffset());
		action.scrollFromOrigin(orgin, 0, -500).perform();
		Thread.sleep(3000);
	
		driver.quit(); 
	}

}
