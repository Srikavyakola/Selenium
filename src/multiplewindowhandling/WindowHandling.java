package multiplewindowhandling;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) 
	
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kavya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String parent=driver.getWindowHandle();
		
		Set<String>c1=driver.getWindowHandles();
		
		Iterator<String>I1=c1.iterator();
		
		while(I1.hasNext())
			
		{	
			
			String child=I1.next();
			
			if(!parent.equals(child))
				
			{
				
				driver.switchTo().window(child);
				
				System.out.println(driver.switchTo().window(child).getTitle());
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				driver.close();
				
			}
			
			driver.switchTo().window(parent);
			
		}
}
}
