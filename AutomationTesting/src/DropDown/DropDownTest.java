package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

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
		//Find the Gender
		
		WebElement GenderDropdown=driver.findElement(By.id("select2"));
		
		Select selectGender=new Select(GenderDropdown);
		System.out.println("Is country dropdown multiple select? :"+selectGender);
		
		selectGender.selectByIndex(2);
		Thread.sleep(2000);
		
		//Find the Country dropdown
		WebElement countryDropdown=driver.findElement(By.id("select3"));
		
		Select selectCountry=new Select(countryDropdown);
		
		System.out.println("Is country dropdown multiple select? :"+selectCountry);
		
		selectCountry.selectByIndex(7);
		Thread.sleep(2000);
		//selectCountry.selectByInde(8);
		
		//Find State dropdown
		
		WebElement stateDropdown=driver.findElement(By.id("select5"));
		
		Select selectState=new Select(stateDropdown);
		
		
		System.out.println(selectState.isMultiple());
		
		//select Tamilnadu
		selectState.selectByIndex(33);
		
		selectState.selectByValue("Kerala");
		
		selectState.selectByVisibleText("Pondicherry");
		
		Thread.sleep(5000);
		driver.quit();
		
		

	}

}
