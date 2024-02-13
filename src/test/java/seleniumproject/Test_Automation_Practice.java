package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Automation_Practice {

	public static void main(String[] args) {
		
    System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();	
   driver.get("https://testautomationpractice.blogspot.com/");
   driver.manage().window().maximize();
   driver.findElement(By.xpath("//input[@id='name']")).sendKeys("maheswari");
   driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mahi123@gmail.com");
   driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("123456789");
   driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("U.Rajupalem");
   driver.findElement(By.xpath("//input[@id='female']")).click();
   for(int i=1;i<=7;i++) {
	   driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	   
	   
   }
	}
}


