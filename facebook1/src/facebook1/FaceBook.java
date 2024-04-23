package facebook1;

import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args)throws  Exception{
		//Set the driver path
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			//Launch  Chrome Browser
				ChromeDriver driver=new ChromeDriver();
				Thread.sleep(4000);
				//Maximize the window
				driver.manage().window().maximize();
				Thread.sleep(4000);
				driver.manage().window().fullscreen();
				Thread.sleep(4000);
				//Close browser window
				driver.close();
				Thread.sleep(4000);
				driver.quit();
		

	}

}
