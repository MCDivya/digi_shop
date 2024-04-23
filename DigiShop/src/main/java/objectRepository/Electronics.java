package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;

public class Electronics { 
	
	public void Electronicpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	
	

}
