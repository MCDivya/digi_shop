package TestScripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;

public class ComputerTest extends BaseClass {
	
	@Test
	
	public void computer_001() {
		
		//click on computer link
		
		driver.findElement(By.linkText("Computers")).click();
		
		//To verify the book page 
		
		String expectedresult = driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText();
		
		//To verify the page
		
		Assert.assertEquals(expectedresult, "Computers","Computers page is not displayed");
		 
		 Reporter.log("Test is Complete",true);
	}
	@Test
	
	public void computer_002() {
		
		//click on computer link
		
		driver.findElement(By.linkText("Computers")).click();
		
		//to verify desktop is displayed
		
		String desktopres = driver.findElement(By.xpath("(//h2[@class='title']/a)[1]")).getText();
		
		//to verify the dropdown
		
				Assert.assertEquals(desktopres, "Desktops","Desktops is not displayed");
				
				Reporter.log("Test is completed",true);
	}
	

}
