package tasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_task {

	 static WebDriver driver;
	public static void main(String args[]) throws Throwable {
		 System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();	
		   driver.get("https://testautomationpractice.blogspot.com/");
		   driver.manage().window().maximize();
		   WebElement alert=driver.findElement(By.xpath("//button[text()='Alert']"));
		   alert.click();
		  Alert alertsHandle=driver.switchTo().alert();
		  alertsHandle.accept();
		  driver.navigate().refresh();
		  Thread.sleep(2000);
		   WebElement confirmBox=driver.findElement(By.xpath("//button[text()='Confirm Box']"));
		   confirmBox.click();
		   alertsHandle.dismiss();
		   WebElement prompt=driver.findElement(By.xpath("//button[text()='Prompt']"));
		   prompt.click();
		   alertsHandle.sendKeys("Successfully Automated Alerts" );
		   alertsHandle.accept();
		   String alertStatusMessage=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		   System.out.println(alertStatusMessage);
		   driver.close();
	}

	

}
