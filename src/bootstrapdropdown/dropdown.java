package bootstrapdropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {

	public static void main(String[] args) throws InterruptedException
	
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kavya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@id='menu1']")).click();
		
		List<WebElement> dd_menu=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));

		for(int i=0;i<dd_menu.size();i++)
			
		{
			WebElement element=dd_menu.get(i);
			
			String value=element.getAttribute("text");
			
			System.out.println("dropdown menu elements are---->"+value);
			
			if(value.equalsIgnoreCase("CSS"))
			{
				
				element.click();
				
				break;
			}
			
		}
		
	}

}
