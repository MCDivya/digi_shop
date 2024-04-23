package Mouse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//maimize the browser"
		
				driver.manage().window().maximize();
		
		//Navigate to webpage
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//SCROLL
		Actions action = new Actions(driver);
		
		action.scrollByAmount(0, 300).perform();
		Thread.sleep(3000);
		
		action.scrollByAmount(0, 200).perform();
		Thread.sleep(3000);
		
		action.scrollByAmount(0, -200).perform();
		Thread.sleep(3000);
		
		
		driver.quit();
		
		
		
		
	}

}
