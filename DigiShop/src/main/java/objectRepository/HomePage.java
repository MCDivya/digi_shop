package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "img[alt='Tricentis Demo Web Shop']")
	WebElement logo;
	
	@FindBy(linkText = "Register")
	WebElement registerLink;
	
	@FindBy(partialLinkText = "Log in")
	WebElement loginLink;
	
	@FindBy(id = "small-searchterms")
	public WebElement searchField;
	
	@FindBy(xpath = "//input[@value='Search']")
	public WebElement searchButton;
	
	@FindBy(linkText = "Jewelry")
	private  WebElement JewelryLink;
	
	@FindBy(partialLinkText = "BOOKS")
	private WebElement bookslink;
	
	@FindBy(css="[alt='Picture of 14.1-inch Laptop']")
	private WebElement laptopImage;
	
	@FindBy(partialLinkText = "Log out")
	WebElement logoutLink;
	
	
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	public WebElement getLaptopImage() {
		return laptopImage;
	}
	public WebElement getBookslink() {
		return bookslink;
	}
	public WebElement getjewelryLink() {
		return JewelryLink;
	}
	public WebElement getLogo() {
		return logo;
	}

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getSearchField() {
		return searchField;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getJewelryLink() {
		return JewelryLink;
	}

}
