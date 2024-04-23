package HandlingMultipleWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionTest {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//maimize the browser
				driver.manage().window().maximize();
		
		//Navigate to webpage
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")) . sendKeys("happy");
		Thread.sleep(2000);
		
		List<WebElement> allSuggestions = driver.findElements(By.xpath("//div[@role='presentation']//b/.."));
		for(WebElement suggestion : allSuggestions) {
			System.out.println(suggestion.getText());
		}
		driver.quit();
		
		

}
}