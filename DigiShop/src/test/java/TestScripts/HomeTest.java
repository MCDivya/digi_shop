package TestScripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import objectRepository.HomePage;

public class HomeTest extends BaseClass {
	
	@Test(enabled = false)
	public void home_001() {
		HomePage homePage=new HomePage(driver);
		
		//Enter the product name
		homePage.searchField.sendKeys("laptop");
		
		//Click on Search button
		homePage.searchButton.click();
		
	}
	
	
	@Test
	
	public void home_002() throws InterruptedException{
		
		HomePage homepage = new HomePage(driver);
		
		
		scrollToElement(homepage.getLaptopImage());
		Thread.sleep(3000);
	}
	
	@Test
	
	public void home_003() throws InterruptedException{
		
		HomePage homePage= new HomePage(driver);
		
		scrollFromOrigin(homePage.getLaptopImage(),0,300);
		Thread.sleep(3000);
		
		scrollFromOrigin(homePage.getLaptopImage(),0,-500);
		Thread.sleep(5000);
	}
}
