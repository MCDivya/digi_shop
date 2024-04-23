package HandlingMultipleWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToggleButtonTest {

 public static void main(String[] args) throws InterruptedException {
  
  //Launch the browser
  WebDriver driver=new ChromeDriver();
  
  //To Maximize the browser
  driver.manage().window().maximize();
  
  //Navigate to url
  driver.get("https://demoapps.qspiders.com");
  Thread.sleep(3000);
  
  //To Click on UI testing link
  driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
  Thread.sleep(3000);
  
  //To click on toggle links
  driver.findElement(By.xpath("//section[.='Toggle']")).click();
  Thread.sleep(3000);
  
  //To Click on all the Toggle button
  List<WebElement> togglebutton= driver.findElements(By.xpath("//aside[@class='flex justify-between pb-4']//label"));
  Thread.sleep(3000);
  
  //To print the size of toggle button
  System.out.println("Number of Toggle Button :"+togglebutton.size());
  
  //To Click All the Toggle button using ForEach loop
  for (WebElement alltogglebutton : togglebutton) {
   
   alltogglebutton.click();
   Thread.sleep(500);
  }
  
  //To Close the Browser
  driver.quit();
 }
 
}