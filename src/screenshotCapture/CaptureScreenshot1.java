package screenshotCapture;

import library.ScreenshotCapture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CaptureScreenshot1

{
	WebDriver driver;
	@Test
	
	public void CaptureScreenshot() throws Exception
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kavya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//*[@id='emailaas']")).sendKeys("Srikavya");

	}
	
	@AfterMethod
	
	public void failure(ITestResult result)
	
	{
		if(ITestResult.FAILURE==result.getStatus())
		
		{
			ScreenshotCapture.CaptureScreenshot(driver, result.getName());
			
		}
		
	}
	

}
