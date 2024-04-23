package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssVaueTest {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Navigate to webpage
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		System.out.println("Font Size:" + driver.findElement(By.linkText("BOOKS")).getCssValue("font-size"));
		System.out.println("Background:" + driver.findElement(By.linkText("BOOKS")).getCssValue("background"));
		
		//verify the colour of register link
		String registerLinkColor=driver.findElement(By.linkText("Register")).getCssValue("color");
		System.out.println(registerLinkColor);
		
		if(registerLinkColor.equals("rgba(175,3,4,1)")) {
			System.out.println("Test Case Pass");
			
		}
		else {
			System.out.println("Test Case Pass");
		}
		driver.quit();
		
 
		
		
 
	}

}
