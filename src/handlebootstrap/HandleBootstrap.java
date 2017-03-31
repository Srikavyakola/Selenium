package handlebootstrap;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleBootstrap {

	public static void main(String[] args)
	
	{
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kavya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//*[@class='icon-down icon ich dib']")).click();
	
		driver.findElement(By.xpath("//*[@class='config-options']")).click();
		
		driver.switchTo().frame(0);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='g-signin2']/div/div")).click();
		
		
		

	}

}
