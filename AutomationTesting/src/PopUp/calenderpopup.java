package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenderpopup {

	public static void main(String[] args) throws InterruptedException {
		// launch
		WebDriver driver =new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		
		//navigate
		driver.get("https://demoapps.qspiders.com/ui/datePick?sublist=0");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[placeholder='Select A Date']")).click();
		Thread.sleep(3000);	driver.findElement(By.xpath("//div[@class=\'react-datepicker__week\']//div[@tabindex=\'0\']")).click();
		//driver.findElement(By.xpath("//div[@aria-current='date']")).click();
		//driver.findElement(By.className("react-datepicker__day--today")).click();
		Thread.sleep(3000);
		
		driver.quit();
	}

}
