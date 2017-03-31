package rightclick;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args)
	
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kavya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Actions act=new Actions(driver);

		WebElement Business=driver.findElement(By.xpath("//a[@href='//www.google.co.in/services/?fg=1']"));
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		act.contextClick(Business).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

}
