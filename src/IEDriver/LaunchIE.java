package IEDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchIE {

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.ie.driver","C:\\Users\\Kavya\\Downloads\\IEDriverServer_x64_3.3.0\\IEDriverServer.exe");

		WebDriver driver=new InternetExplorerDriver();
		
		driver.get("http://www.learn-automation.com");
		
		System.out.println(driver.getTitle());

	}

}
