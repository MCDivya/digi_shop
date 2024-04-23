package facebook1;

import org.openqa.selenium.edge.EdgeDriver;

public class LunchEdgeBroserTest {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		Thread.sleep(4000);
		//Maximize the window
		driver.manage().window().maximize();
		Thread.sleep(4000);
		//driver.manage().window().fullscreen();
		//Thread.sleep(4000);
		//navigate to swiggy application
		driver.get("https://puma.com");
		Thread.sleep(4000);
		//Navigate to flipcart
		driver.navigate().to("https://www.nike.com");
		Thread.sleep(4000);
		//Navigate back to Swiggy
		driver.navigate().back();
		//Navigate forward to flipcart
		driver.navigate().forward();
		Thread.sleep(4000);
		//Refresh the window
		driver.navigate().refresh();
		Thread.sleep(4000);
		//Close browser window
		driver.close();
		Thread.sleep(4000);
		driver.quit();

	}

}
