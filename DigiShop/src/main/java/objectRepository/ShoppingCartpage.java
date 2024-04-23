package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartpage {
	
	public ShoppingCartpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
