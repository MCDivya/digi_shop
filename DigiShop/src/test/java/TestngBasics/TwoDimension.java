package TestngBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwoDimension {

	@DataProvider(parallel =true)
	public String[][] registerData() {
		String [][] data=new String[3][3];
		
		data[0][0]="Divya";
		data[0][1]="Divya123@gmail.com";
		data[0][2]="saathvika";
		
		data[1][0]="mohana";
		data[1][1]="Mohana@gmail.com";
		data[1][2]="jathushni";
		
		data[2][0]="indhu";
		data[2][1]="indhumathu@gmail.com";
		data[2][2]="indhu123";
		
		return data;
	}
	@Test(dataProvider="registerData")
	public void Login_001(String Name,String Emailid, String Password) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com");
		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("name")).sendKeys(Name);
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("email")).sendKeys(Emailid);
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("password")).sendKeys(Password);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[.='Register']")).submit();
		Thread.sleep(2000);
		
		
		driver.quit();
		
		
	}
		
}
