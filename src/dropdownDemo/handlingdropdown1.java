package dropdownDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlingdropdown1

{
	
	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kavya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement month_dropdown=driver.findElement(By.id("month"));
		
		Select month=new Select(month_dropdown);
		
		List<WebElement> month_list=month.getOptions();
		
		int total_month=month_list.size();
		
		System.out.println("total month count--->"+total_month);
		
		for(int i=0;i<total_month;i++)
		
		{
			WebElement ele=month_list.get(i);
			
			String value=ele.getAttribute("text");
			
			System.out.println("months are----> "+value);
		}
		
		
		
	}

}
