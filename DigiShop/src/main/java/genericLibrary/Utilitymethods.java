package genericLibrary;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Set;

import javax.swing.text.Position;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Utilitymethods {
	
	static JavascriptExecutor jse;
	static Actions action;
	
	public static String getWebPageScreenshot(WebDriver driver) {
		
		String imagePath="./Screenshots/" + getTime() + ".png";
		
		//Step 1: Convert WebDriver reference into TakesScreenshot type
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		
		//step 2: Get the screenshot and store in temp variable
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
		//step 3: Create a permanent File Location
		File permanent = new File(imagePath);
		
		//step 4:Copy paste the image from temp to permanent location
		
		try {
			FileHandler.copy(temp, permanent);
		}catch (IOException e) {
			// TODO: handle exception
			
			e.printStackTrace();
			
		}
		
		return "." + imagePath;
		
		//
		
	}
	
	public static void getWebElementScreenshot (WebElement element) {
		
		//Get the screenshot and store in temp location
		
		File temp = element.getScreenshotAs(OutputType.FILE);
		
		//step 2: Create a permanent file location
		
		File permanent = new File("./Screenshots/" + getTime() + ".png");
		
		//step 3: Copy paste the image from temp to permanent location
		
		try {
			FileHandler.copy(temp, permanent);
			
		}catch (IOException e ) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void selectOptionByIndex(WebElement dropdown,int index) {
		Select select = new Select(dropdown);
		select.selectByIndex(index);
	}
	
	public static void selectOptionByValue(WebElement dropdown,String value) {
		Select select = new Select(dropdown);
		select.selectByValue(value);
	}
	
	public static void selectOptionByVisibletext(WebElement dropdown,String text) {
		Select select = new Select(dropdown);
		select.selectByVisibleText(text);
	}

	public static void switchToWindowByTitle(WebDriver driver, String title) {
		Set<String> allWindows =driver.getWindowHandles();
		
		for(String window:allWindows) {
			driver.switchTo().window(window);
			if(driver.getTitle().contains(title)) {
				break;
			}
		}
	}
	
	public static void switchToWindowByUrl(WebDriver driver, String url) {
		Set<String> allWindows =driver.getWindowHandles();
		
		for(String window:allWindows) {
			driver.switchTo().window(window);
			if(driver.getTitle().contains(url)) {
				break;
			}
		}
	}
	
	
	
	public static void scrollIntoElementView(WebElement element,boolean position) {
		//JavascriptExecutor jse=(JavascriptExecutor) driver;
		
		jse.executeScript("arguments[0].scrollIntoView("+position+")",element);
	
	}
	
	public static void scrollBy(int x, int y) {
		
		//JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy("+x+","+y+")");
        
 
	}
	
public static void scrollTo(int x, int y) {
		
		//JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.executeScript("window.scrollTo("+x+","+y+")");
}

public static void handleDisableOrHiddenTextField(WebDriver driver,WebElement element, String value) {
	//JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("argument[0].value='"+value+"'", element);
}

public static void handleHiddenOrDisabledbutton(WebElement element) {
	//JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("argument[0].click()",element);
}
   
public static void mouseHover(WebElement element) {
	
	action.moveToElement(element).perform();
}

public static void rightClick(WebElement element) {
	
	action.contextClick(element).perform();
	
}

public static void doubleClick(WebElement element) {
	action.doubleClick(element).perform();
	
}

public static void clickAndHold(WebElement element) {
	
	action.clickAndHold(element).perform();
}

public static void release(WebElement element) {
	
	action.release(element).perform();
}

public static void dragAndDrop(WebElement source,WebElement target) {
	
	action.dragAndDrop(source, target).perform();
	
}

public static void scrollByAmount(int x,int y) {
	
	action.scrollByAmount(x, y);
	
}

public static void scrollToElement(WebElement element) {
	
	action.scrollToElement(element).perform();
	
}

public static void scrollFromOrigin(WebElement element,int x,int y) {
	
	ScrollOrigin origin=ScrollOrigin.fromElement(element);
	action.scrollFromOrigin(origin, x, y).perform();
	
}

public static void keyPress(Keys key) {
	action.keyDown(key).perform();
	
}
public static void keyRelease(Keys key) {
	action.keyUp(key).perform();
}
public static void initObjects(WebDriver driver) {
jse=(JavascriptExecutor) driver;
action=new Actions(driver);
}
	public static String getTime() {
		// TODO Auto-generated method stub
		return LocalDateTime.now().toString().replace("-","_").replace(":","_");
	}

}
