package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import genericLibrary.BaseClass;

public class JewelleryPage extends BaseClass {
	public JewelleryPage(WebDriver driver) {
		
	}
    
    @FindBy(xpath ="//div[@class='page-title']/h1" )
    private WebElement title;
    
    @FindBy(xpath="//div[@class='picture']//img[@title='Show details for Create Your Own Jewelry']")
    private WebElement Chainimg;
    
    @FindBy(xpath="//input[@class='button-2 product-box-add-to-cart-button']/..")
    private WebElement Addtocart;
   

  
}
    