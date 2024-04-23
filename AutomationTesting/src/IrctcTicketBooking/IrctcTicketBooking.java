package IrctcTicketBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IrctcTicketBooking {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		
	
		
		WebDriver driver=new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/");
		
		driver.findElement(By.xpath("//input[@aria-controls='pr_id_1_list']")).sendKeys("Chennai");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li//span[contains(.,' MGR CHENNAI CTL - MAS ')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@aria-controls='pr_id_2_list']")).sendKeys("kanya");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//li//span[contains(.,'NAGER COIL TOWN - NJT')]")).click();
		Thread.sleep(3000);
		

	}

}
