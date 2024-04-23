package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		//launch
		
		WebDriver driver=new ChromeDriver();
		
		//maximize
		
		driver.manage().window().maximize();
		
		//navigate
		
		driver.get("https://demoapps.qspiders.com/ui");
		
		//maximize
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		//click on progress bar
		
		driver.findElement(By.xpath("//section[.='Synchronization']")).click();
		
		//click on with Element link
		driver.findElement(By.linkText("With Element")).click();
		
		//Enter seconds as 7
		
		driver.findElement(By.cssSelector("[placeholder='Enter time in seconds']")).sendKeys("2");
		
		//click on start button
		driver.findElement(By.xpath("//button[.='Start']")).click();
		
		//click on Drop Down
		
		driver.findElement(By.xpath("//p[.='Do You like Automation']/ancestor::section//select")).click();
		

	}

}
