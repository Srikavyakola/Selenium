package robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassUsage {

	public static void main(String[] args) throws AWTException
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kavya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Srikavya");
		
		driver.findElement(By.xpath("//*[@tabindex='2']")).sendKeys("kavya");

		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);	
		
	}

}
