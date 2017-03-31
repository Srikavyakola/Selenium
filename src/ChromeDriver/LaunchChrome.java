package ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.MaximizeWindow;

public class LaunchChrome {

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kavya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.learn-automation.com");
		
		System.out.println(driver.getTitle());
		
		
		

	}

}
