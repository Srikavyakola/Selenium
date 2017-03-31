package screenshotCapture;

import library.ScreenshotCapture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class CaptureScreenshot

{
	@Test
	
	public void CaptureScreenshot() throws Exception
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kavya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		ScreenshotCapture.CaptureScreenshot(driver, "facebookpage");
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Srikavya");
		
		ScreenshotCapture.CaptureScreenshot(driver, "Username");
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
	
	}
	

}
