package genericLibrary;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseClass extends Utilitymethods{
	
public	WebDriver driver;
public ExtentReports report;
public ExtentTest test;


	
	
	@BeforeSuite
	
	public void bs() {
		report = new ExtentReports("./Reports/"+getTime()+".html");
		
	}
	
    @AfterSuite
	
	public void as() {
    	
    	report.flush();
		Reporter.log("close data base connection",true);
		
	}
    
   // @Parameters({"Browsers","url"})
	@BeforeClass
	
	//public void Launchthebrowser(String Browsers, String url) {
    	public void launchBrowser() {
		
		String browser = FileUtility.getProperty("browser");
		String url=FileUtility.getProperty("url");
		
		
    	if(browser.equalsIgnoreCase("Chrome")) {
    		driver = new ChromeDriver();
    	}
    	else if(browser.equalsIgnoreCase("Firefox")) {
    		driver = new FirefoxDriver();
    		
    	}
    	else if(browser.equalsIgnoreCase("Edge")) {
    		driver = new EdgeDriver();
    		
    	}
    	else  {
    		driver = new ChromeDriver();
    		
    	}
    	
    	driver.manage().window().maximize();
    	driver.get(url);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	
    	initObjects(driver);
		
    	Reporter.log("Launched Browser",true);
		
	}
    
   @AfterClass
	
	public void BrowserClosed() {
	    driver.quit();
		Reporter.log("Browser closed",true);
		
	}
   
   @BeforeMethod
	
	public void login(Method method) {
	   
	   test=report.startTest(method.getName());
	   
	   
	   String email=FileUtility.getProperty("email");
	   String password=FileUtility.getProperty("password");
	   
	   //click on Log in Link
	   
	   driver.findElement(By.linkText("Log in")).click();
	   
	   //enter email
	   
	   driver.findElement(By.id("Email")).sendKeys(email);
	   
	   //enter password
	   driver.findElement(By.id("Password")).sendKeys(password);
	   driver.findElement(By.className("login-button")).click();
	   
	   
	   
		Reporter.log("Before Login",true);
		
	}
	
   @AfterMethod
	
  	public void logout() {
	   driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
  		Reporter.log("After Logout",true);
  		
  	}
   
   @BeforeTest
	
  	public void bt() {
  		Reporter.log("Before Test",true);
  		
  	}
  	
   @AfterTest
  	
    	public void at() {
    		Reporter.log("After Test",true);
    		
    	}
	
	
	
	


}
