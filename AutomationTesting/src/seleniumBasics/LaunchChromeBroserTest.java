package seleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChromeBroserTest {

	public static void main(String[] args)throws Exception  {
		  ChromeDriver driver=new ChromeDriver();
		//EdgeDriver driver=new EdgeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		//Maximize the browser
		 driver.manage().window().maximize();
		 //navigate to Web page
		 driver.get("https://adidas.com");
		 Thread.sleep(2000);
		 String actualTitle=driver.getTitle();
		 String ExpectedTitle="adidas";
		 if(actualTitle.equals(ExpectedTitle)) {
			 System.out.println("Actual Title:"+actualTitle);
			 System.out.println("Expected Title:"+ExpectedTitle);
			 System.out.println("Test case pass");
		 }
			 else	
			 {
				 System.out.println("Actual Title:"+actualTitle);
			 System.out.println("Expected Title:"+ExpectedTitle);
			 System.out.println("Test case Fail");

			 
		 }
		 driver.quit();
	}

}
