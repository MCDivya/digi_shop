package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import objectRepository.HomePage;
import objectRepository.JewelleryPage;

public class JewelleryTest extends BaseClass {
	@Test
	
	public void jewelry_001() {
		HomePage homePage = new HomePage(driver);
		
		JewelleryPage jewelryPage = new JewelleryPage(driver);
		
		//click on jewelry link
		
		homePage.getJewelryLink().click();
		
		//try {
			//Assert.assertEquals(jewelryPage.getPageTitle().getText(), null);
		//}
		
	}
   
	
	}
	

