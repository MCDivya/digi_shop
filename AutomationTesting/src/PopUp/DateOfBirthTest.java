package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateOfBirthTest {

	public static void main(String[] args) throws InterruptedException {
		  
		  //launch the Browser
		  WebDriver driver=new ChromeDriver();
		  
		  //Maximize the Browser
		  driver.manage().window().maximize();
		  
		  //Navigate to Web page
		  driver.get("https://demoapps.qspiders.com");
		  Thread.sleep(4000);
		  
		  //To Click on UI testing Concepts
		  driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		  Thread.sleep(4000);
		  
		  //To Click on Date and Time Picker link
		  
		  driver.findElement(By.xpath("//section[.='Date & Time Picker']")).click();
		  Thread.sleep(4000);
		  
		  //To Click on Date Picker
		  driver.findElement(By.xpath("//section[.='Date Picker']")).click();
		  Thread.sleep(4000);
		  
		  //To Click on Select the Date
		  driver.findElement(By.cssSelector("[placeholder='Select A Date']")).click();
		  Thread.sleep(4000);
		  
		  
		  while(!driver.findElement(By.cssSelector("[class='react-datepicker__current-month']")).getText().equals("November 2021")){
			  driver.findElement(By.cssSelector("[aria-label='Previous Month']")).click();
			  			  
		  }
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//div[.='13']")).click();
		  Thread.sleep(3000);

		  //To Identify the Month
		//  WebElement Month = driver.findElement(By.xpath("//div[.='March 2024']"));
		  
		  
		  
		  //Using While Loop To Select the Dob
	//	  while(!Month.getText().equals("November 2021")) {
	//	   driver.findElement(By.xpath("//button[contains(@class,'react-datepickernavigation react-datepickernavigation--previous')]")).click();
		   
	//	  }
		  //To Select the Date
	//	  WebElement Date = driver.findElement(By.xpath("//div[@class='react-datepickerday react-datepickerday--013']"));
	//	  Date.click();
	//	  Thread.sleep(4000);
		  
		  
		  //To close the Browser
		  driver.quit();
		  
		 }
		}