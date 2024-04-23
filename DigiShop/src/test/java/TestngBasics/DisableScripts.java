package TestngBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DisableScripts {
	@Test(invocationCount=3,threadPoolSize=2)
	
	public void test1() throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		System.out.println("Test case1");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();
	}
	
@Test(invocationCount=3,threadPoolSize=2)
	
	public void test2() throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		System.out.println("Test case1");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();
	}
	
@Test(invocationCount=3,threadPoolSize=2)

public void test3() throws InterruptedException{
	WebDriver driver=new ChromeDriver();
	System.out.println("Test case1");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.quit();
}

@Test(invocationCount=3,threadPoolSize=2)

public void test4() throws InterruptedException{
	WebDriver driver=new ChromeDriver();
	System.out.println("Test case1");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.quit();
}
@Test(invocationCount=3,threadPoolSize=2)

public void test5() throws InterruptedException{
	WebDriver driver=new ChromeDriver();
	System.out.println("Test case1");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.quit();
}

}
