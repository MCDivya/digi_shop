package Mouse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAssignment {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
				WebDriver driver = new ChromeDriver();
				
				//maimize the browser"
				
						driver.manage().window().maximize();
				
				//Navigate to webpage
				driver.get("https://www.google.co.in/search?q=dhtmlgoodies");
				Thread.sleep(2000);
				//drag and drop
				driver.findElement(By.xpath("//h3[.='Drag and drop - demo 3']")).click();
				Thread.sleep(4000);
				
				//to find capitals
				Actions	action=new Actions(driver);
				List<WebElement>allCapitals=driver.findElements(By.xpath("//div[@id='dropContent']/div"));
				Thread.sleep(3000);
				
				//to find countries

				List<WebElement>allCountries=driver.findElements(By.xpath("//div[@id='countries']/div"));
				Thread.sleep(3000);
				
				
				//Matching all countries and capitals
				
				for(int i=1;i<allCapitals.size();i+=2) {
					for(int j=0;j<allCountries.size();j++) {
						
						action.dragAndDrop(allCapitals.get(i), allCountries.get(j)).perform();
						Thread.sleep(3000);
						
						if(allCapitals.get(i).getCssValue("background-color").equals("rgba(0, 255, 0, 1)")){
							break;
						}
					}
					
				}
				
		driver.quit();	
	}

}
 