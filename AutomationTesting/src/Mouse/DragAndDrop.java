package Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

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
		
		//Match  
		
		WebElement Washington=driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement United_states=driver.findElement(By.xpath("//div[@id='box103']"));
		Actions action=new Actions(driver);
		action.dragAndDrop(Washington,United_states).perform();
		Thread.sleep(2000);
		
		
		
		driver.quit();
		

	}

}
