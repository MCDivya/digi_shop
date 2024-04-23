package seleniumBasics;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserNameUserTest {

	static Scanner sc=new Scanner (System.in);
	static WebDriver driver;//Null
	public static void main(String[] args)throws Exception {
		System.out.println("Enter the User Options");
		System.out.println("1.Chrome Browser \n 2.Edge Browser \n 3.FireFobrowser");
		int input = sc.nextInt();//Browser=1
		if(input==1) {
			 driver = new ChromeDriver();
			
		}
		else if (input==2) {
		 driver = new EdgeDriver();
			
		}
		else if (input==3) {
			 driver = new FirefoxDriver();
		}
		else {
			System.out.println("Selected browser not valid Selecting default browser");
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.adidas.co.in/");
		driver.navigate().back();

	}

}
