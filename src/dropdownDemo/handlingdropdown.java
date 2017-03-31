package dropdownDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlingdropdown

{
	
	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kavya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement day_dropdown=driver.findElement(By.id("day"));
		
		Select day=new Select(day_dropdown);
		
		day.selectByIndex(6);
		
		Thread.sleep(1000);
		
		WebElement month_dropdown=driver.findElement(By.id("month"));
		
		Select month=new Select(month_dropdown);
		
		month.selectByVisibleText("Aug");
		
		Thread.sleep(1000);
		
		WebElement year_dropdown=driver.findElement(By.id("year"));
		
		Select year=new Select(year_dropdown);
		
		year.selectByValue("1994");
		
		Thread.sleep(1000);
		
		WebElement radio_button=driver.findElement(By.xpath("//*[@type='radio' and @value='2']"));
		
		boolean selected_status=radio_button.isSelected();
		
		radio_button.click();
		
	}

}
