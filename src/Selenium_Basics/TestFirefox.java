package Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFirefox {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Kavya\\Downloads\\geckodriver-v0.9.0-win64\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.learn-automation.com");
		
		System.out.println(driver.getTitle());
		
	}

}
