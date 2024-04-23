package HandlingDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultipkeSelectDropdown {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		
		//maimize the browser
		driver.manage().window().maximize();
		
		//navigate
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		
		//Click ojn UI testing Concepts
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(4000);
		
		//Click on Dropdown Link
		driver.findElement(By.xpath("//section[.='Dropdown']")).click();
		Thread.sleep(2000);
		
		//Click on Multiselect link
		driver.findElement(By.partialLinkText("Multi Select")).click();
		Thread.sleep(2000);
		
		//find country dropdown
		WebElement countryDropdown = driver.findElement(By.id("Select-multiple-native"));
		
		//select class object 
		
		Select selectCountry = new Select(countryDropdown);
		
		//select France
		selectCountry.selectByIndex(4);
		Thread.sleep(2000);
		
		//Select India
		selectCountry.selectByValue("India");
		Thread.sleep(2000);
		
		
		//select canada
		
		selectCountry.selectByVisibleText("Canada");
		Thread.sleep(2000);
		
		System.out.println("*****All selected Contries");
		
		//get all selected options
		
		List<WebElement> allSelectedCountries = selectCountry.getAllSelectedOptions();
		
		for(WebElement selected : allSelectedCountries) {
			
		}
		
				//
		
		
	}

}
