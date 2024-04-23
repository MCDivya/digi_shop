import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement product = driver.findElement(By.id(""));
		Actions mouse =new Actions(driver);
		mouse.scrollToElement(driver.findElement(By.linkText("Shop fashion"))).perform();
		
		
		File temp = product.getScreenshotAs(OutputType.FILE);
		
		File permanent = new File("./Screenshots/productImage.png");
		
		FileHandler.copy(temp,permanent);
		
		
		

	}

}
