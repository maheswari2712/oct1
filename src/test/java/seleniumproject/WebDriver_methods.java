package seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebDriver_methods {
	public static void main(String args[]) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		String url=driver.getCurrentUrl();
		//String url1=driver.getPageSource();
		System.out.println(url);
		//System.out.println(url1);
		System.out.println(driver.getWindowHandle());
		driver.close();
	}

}
