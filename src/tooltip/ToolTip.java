package tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {

	public static void main(String[] args) 
	
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kavya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");
		
		driver.findElement(By.xpath("//*[@id='GmailAddress']")).click();
		
		Actions builders=new Actions(driver);
		
		WebElement actual_sug=driver.findElement(By.xpath("html/body/div[3]"));
		
		builders.moveToElement(actual_sug).perform();
		
		String message=actual_sug.getText();
		
		System.out.println("Actual suggetions: "+message);
		
		
	}

}
