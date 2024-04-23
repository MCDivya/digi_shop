package PopUp;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingHiddenDivisionPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//section[.='Popups']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//section[.='Hidden division']")).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//label[.='Name']/../..//input")).sendKeys("Divya");
		driver.findElement(By.cssSelector("div>[type='text']")).sendKeys("Divya");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("div>[type='email']")).sendKeys("divyamc2203@gmail.com");
		Thread.sleep(4000);
		
		WebElement dropdown = driver.findElement(By.xpath("//label[.='Product']/..//select"));
		Thread.sleep(4000);
		Select product=new Select(dropdown);
		System.out.println("Is the Drop down is Multiple : "+ product.isMultiple());
		product.selectByVisibleText("Laptop");
		Thread.sleep(3000);
		
		//To Click Message 
		driver.findElement(By.xpath("//label[.='Message']/..//textarea")).sendKeys("Hi, I am Dhiviya");
		Thread.sleep(3000);
		
		//To Click on Submit Button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		//To Close the Browser
		driver.quit();
		
		 

	}

}
