package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassMethods {

	public static void main(String[] args) throws InterruptedException {
		//launch Chrome Browser
				WebDriver driver=new ChromeDriver();
				//maimize the browser
				driver.manage().window().maximize();
				//navigate
				driver.get("https://demoapps.qspiders.com/");
				Thread.sleep(2000);
				//Click on UI testing concepts
				driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
				Thread.sleep(4000);
				//Click on Dropdown Link
				driver.findElement(By.xpath("//section[.='Dropdown']")).click();
				Thread.sleep(2000);
				
				WebElement countryDropDown = driver.findElement(By.id("select3"));
				
				Select selectCountry=new Select(countryDropDown);
				
				//Verify all the options are present in Country dropdown
				List<WebElement> allCountries = selectCountry.getOptions();
				
				for(WebElement country:allCountries) {
					System.out.println(country.getText());
					
				}
				if(allCountries.size()-1==8) {
					System.out.println("Test case Pass");
					
				}
				else {
					System.out.println("Test case Fail");
				}
				
			driver.quit();	
	}

}
