package CrossBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class VerifyCrossBrowsers{
	
	WebDriver driver;
	
	@Test
	@Parameters("browsers")
	
	public void CrossBrowsing(String BrowserName){
		
		if(BrowserName.equalsIgnoreCase("Chrome"))
			
		{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kavya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		
		}
		
		else if(BrowserName.equalsIgnoreCase("IE"))
			
		{
			System.setProperty("webdriver.ie.driver","C:\\Users\\Kavya\\Downloads\\IEDriverServer_x64_3.3.0\\IEDriverServer.exe");

			driver=new InternetExplorerDriver();
			
		}
		
		driver.manage().window().maximize();
		
		driver.get("http://www.learn-automation.com");
		
		System.out.println(driver.getTitle());
		
		
	}
	
	
	
	

}
