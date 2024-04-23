package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeTest {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
				WebDriver driver = new ChromeDriver();
				
				//Navigate to webpage
				driver.get("https://");
				Thread.sleep(2000);
				
				//find email test field
				WebElement passwordTF = driver.findElement(By.xpath("//input[@id='Pass']")); 
				
				

	}

}
