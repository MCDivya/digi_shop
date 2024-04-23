package TestScripts;

import java.awt.print.Book;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import genericLibrary.BaseClass;
import objectRepository.BookPage;
import objectRepository.HomePage;

public class BooksTest extends BaseClass{
	@Test
	public void book_001() {
		//Click on Books link
		driver.findElement(By.linkText("Books")).click();
		test.log(LogStatus.INFO, "Clicked on Books link");
		
		String actualPageTitle=driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
		
		try {
		//Verfiy the Books page is displayed
		Assert.assertEquals(actualPageTitle, "Computers", "Books page is not displayed");
		test.log(LogStatus.PASS, "Book page is displayed");
		}
		catch (AssertionError e) {
			test.log(LogStatus.FAIL, test.addScreenCapture(getWebPageScreenshot(driver)));
		}
		
		Reporter.log("test case completed",true);
	}
	
	private int link() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Test
	
	public void book_002() {
		
		//click on book link
		
		driver.findElement(By.linkText("Books")).click();
		
		
		//To verify the sort drop down is displayed
		
		boolean dropdown = driver.findElement(By.id("products-orderby")).isDisplayed();
		
		//to verify the dropdown
		
		Assert.assertEquals(dropdown, true,"Dropdown is not displayed");
		
		Reporter.log("Test is completed",true);
	}
	
	@Test
	
	public void books_003() throws InterruptedException{
		HomePage homepage = new HomePage(driver);
		BookPage bookpage = new BookPage(driver);
		
		//to click on books link
		homepage.getBookslink().click();
		
		//to select the sort by the dropdown
		selectOptionByIndex(bookpage.getSortByDropdown(), 2);
		
		//to select the display dropdown
		selectOptionByVisibletext(bookpage.getDisplayDropdown(), "12");
		
		//to select the view as dropdown
		selectOptionByVisibletext(bookpage.getViewAsDropdown(), "List");
		Thread.sleep(3000);

	}
	
    @Test( enabled = false)
    
    public void book_004() {
    	//Switch to flipkart window 
    	switchToWindowByTitle(driver,"flipkart");
    	
    	//close flipkart window
    	driver.close();
    	
    	//switch to amazon window
    	driver.manage().window().maximize();
    	driver.close();
    	
    }
}
