package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		if(title.equals("Facebook")) {
			System.out.println(title);
			
			System.out.println("Pass");
			
		}
		else {
			System.out.println(title);
			
			System.out.println("Test Case fail");
		}
		
		if(url.equals("Facebook")) {
			System.out.println(url);
			
			System.out.println("Pass");
			
		}
		else {
			System.out.println(url);
			
			System.out.println("Test Case fail");
		}
		
		
	}

}


