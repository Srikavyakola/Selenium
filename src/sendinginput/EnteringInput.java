package sendinginput;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnteringInput {

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kavya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("srikavya");
	
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kola");
		
		Thread.sleep(3000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("scroll(0,100)");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();

	}

}
