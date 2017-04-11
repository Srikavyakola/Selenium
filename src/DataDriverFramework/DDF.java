package DataDriverFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDF

{
		WebDriver driver;
	
		@Test(dataProvider="facebooklogin")
		
		public void DataDriverF(String uname, String password) throws InterruptedException
		
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Kavya\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("https://www.facebook.com/");
			
			driver.findElement(By.xpath("//*[@id='email']")).sendKeys(uname);
			
			driver.findElement(By.xpath("//*[@id='pass'][@tabindex='2']")).sendKeys(password);
			
			driver.findElement(By.xpath("//*[@value='Log In']")).click();
			
			Thread.sleep(3000);
			
			System.out.println(driver.getTitle());
			
			Assert.assertTrue(driver.getTitle().contains("Home"),"User is not able to login");
			
			System.out.println("User is able to login successfully");
			
			
		}
		
		@AfterMethod
		
		public void TearDown()
		
		{
			driver.quit();
			
		}
		
		@DataProvider(name="facebooklogin")
		
		public Object[][] Testdata()
		
		{
			Object[][] data=new Object[2][2];
			
			data[0][0]="srikavya@gmail.com";
			
			data[0][1]="kavya";
			
			data[1][0]="srikavyakola@gmail.com";
			
			data[1][1]="Srikavya";
			
			return data;
			
		}

	}
