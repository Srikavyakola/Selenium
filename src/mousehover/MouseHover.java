package mousehover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException
	
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kavya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("test");
		
		Thread.sleep(2000);
		
		Actions builder=new Actions(driver);
		
		WebElement ele=driver.findElement(By.xpath("//*[@class='sbtc']/div[2]/div[2]/div[1]/div/ul/li[3]"));
		
		Thread.sleep(2000);
		
		builder.moveToElement(ele).build().perform();
		
		Thread.sleep(2000);
		
		builder.click(ele).build().perform();

	}

}
