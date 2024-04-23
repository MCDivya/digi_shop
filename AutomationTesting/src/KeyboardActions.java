import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException
	
	{
		// TODO Auto-generated method stub
		
		//Launch the browser
				WebDriver driver = new ChromeDriver();
				
				//maimize the browser"
				
						driver.manage().window().maximize();
				
				//Navigate to webpag
				driver.get("https://google.com");
			
				Thread.sleep(2000);

				WebElement searchField=driver.findElement(By.id("APjFqb"));
				
				Actions action=new Actions(driver);
				
				                                                                                                                                                                                                                                                  
				action.keyDown(Keys.SHIFT).sendKeys("hi how are you?").perform();
				action.keyUp(Keys.SHIFT).sendKeys("I am fine.").perform();
				
				
	}

}
