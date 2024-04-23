package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement countryDropdown=driver.findElement(By.id("select3"));
		Select selectCountry = new Select(countryDropdown);
		//Check single or Multi select
		
		System.out.println(selectCountry.isMultiple());
		//selectCountry.selectByIndex(7);
		//selectCountry.selectByValue("United Kingdom");
		selectCountry.selectByVisibleText("Germany");
		
		List<WebElement> allCountries = selectCountry.getOptions();
		System.out.println("Total options:" + allCountries.size());
		
		for(WebElement country : allCountries) {
			System.out.println(country.getText());
		}
		System.out.println("*****************************");
		System.out.println(selectCountry.getWrappedElement().getText());
		
		driver.quit();
		
		
	}

}
