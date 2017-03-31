package captureerrormsg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CaptureErrorMsg {

	public static void main(String[] args)
	
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kavya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/ServiceLogin?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1#identifier");
		
		driver.findElement(By.xpath("//input[@id='next']")).click();
		
		String actual_error=driver.findElement(By.xpath("//*[@id='errormsg_0_Email']")).getAttribute("innerHTML");
		
		String expected_error="Enter an email or phone number. ";

		Assert.assertEquals(actual_error, expected_error);
		
		Assert.assertTrue(actual_error.contains("Enter an email or phone number. "));
		
		System.out.println("Test passed");
		
		
		

	}

}
