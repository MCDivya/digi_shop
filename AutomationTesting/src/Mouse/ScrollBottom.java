package Mouse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollBottom {
	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//maimize the browser"
		
				driver.manage().window().maximize();
		
		//Navigate to webpage
		driver.get("https://demoapps.qspiders.com/ui/scroll/newTabHorizontal");
		Thread.sleep(2000);
		
		//SCROLL
		Actions action = new Actions(driver);
		
		action.scrollByAmount(2000, 0).perform();
		Thread.sleep(3000);
		
		action.scrollByAmount(1000, 0).perform();
		Thread.sleep(3000);
		
		action.scrollByAmount(-2000, 0).perform();
		Thread.sleep(3000);
		
		
		driver.quit();
		
		
		
	}

}
