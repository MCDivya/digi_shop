package TestngBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwoDimensionalArray {
	
	@DataProvider(parallel =true,name="data")
	public String[][] registerData() {
		String [][] data=new String[5][5];
		
		//String[][] data = null;
		data[0][0]="Divya";
		data[0][1]="Chandran";
		data[0][2]="Divya123@gmail.com";
		data[0][3]="saathvika";
		data[0][4]="saathvika";
		
		data[1][0]="mohana";
		data[1][1]="priya";
		data[1][2]="Mohana@gmail.com";
		data[1][3]="jathushni";
		data[1][4]="jathushni";
		
		data[2][0]="indhu";
		data[2][1]="mathi";
		data[2][2]="indhumathu@gmail.com";
		data[2][3]="indhu123";
		data[2][4]="indhu123";
		
		data[3][0]="meena";
		data[3][1]="kumar";
		data[3][2]="meena@gmail.com";
		data[3][3]="meena123";
		data[3][4]="meena123";
		
		data[4][0]="sowmi";
		data[4][1]="jana";
		data[4][2]="sowmiya@gmail.com";
		data[4][3]="vardhanvarman";
		data[4][4]="vardhanvarman";
		return data;
	}
	
	@Test(dataProvider="data")
	
	public void register(String firstname, String lastname, String email, String password, String confirmpassword)
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on Register link
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(firstname);
		driver.findElement(By.id("LastName")).sendKeys(lastname);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmpassword);	
		driver.findElement(By.id("register-button")).click();
		driver.quit();
	}

	

}
