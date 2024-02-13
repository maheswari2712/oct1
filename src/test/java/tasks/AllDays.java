package tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllDays {
	public static void main(String[] args) throws Throwable {
		
	    System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();	
	   driver.get("https://testautomationpractice.blogspot.com/");
	   driver.manage().window().maximize();
	   driver.findElement(By.xpath("//input[@id='name']")).sendKeys("maheswari");
	   driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mahi123@gmail.com");
	   driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("123456789");
	   driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("U.Rajupalem");



		WebElement gender=driver.findElement(By.xpath("//input[@value='female']"));
		gender.click();
		System.out.println(gender.isSelected());

		Thread.sleep(3000);
		List< WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));

		for (WebElement operation : checkBoxes) {
			operation.click();
			//driver.close();
		}

		
	}

}

