package logfile;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogFileCreation {

	public static void main(String[] args) 
	
	{
		Logger logger=Logger.getLogger("radiobuttonselection");
		
		PropertyConfigurator.configure("log4j.properties");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kavya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		logger.info("Chrome opened");
		
		driver.manage().window().maximize();
		
		logger.info("window maximized");
		
		driver.get("https://www.facebook.com/");
		
		logger.info("retrived facebook blog");
		
		driver.findElement(By.xpath("//*[@type='radio' and @value='2']")).click();
		
		logger.info("click on radio button of male");
		
		
	}

}
