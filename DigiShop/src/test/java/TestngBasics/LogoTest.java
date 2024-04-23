package TestngBasics;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LogoTest {

	@Test
	
	
	public void logoimg(){
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	
	WebElement logo=driver.findElement(By.xpath("//div[@class='header-logo']//img"));
	
	//Hard Assert
	
	Assert.assertEquals(logo.isDisplayed(),true,"Logo is not displayed");
	
	Assert.assertTrue(logo.isDisplayed());
	//Soft Assert
	
	
	//SoftAssert soft=new SoftAssert();
	//soft.assertTrue(logo.isDisplayed());
	
	
	Reporter.log("Test case completed",true);
	
	driver.quit();
	
	
	
	
	}
}
