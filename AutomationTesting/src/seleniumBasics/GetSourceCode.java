package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSourceCode {

	public static void main(String[] args)throws InterruptedException  {
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com");
		Thread.sleep(20000);
		//get the source code of
		String sourceCode=driver.getPageSource();
		
		System.out.println(sourceCode);
		
		driver.quit();
	}

}
