package Radiobutton;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckingRadioButton {


	public static void main(String[] args) 
	
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kavya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> radio=driver.findElements(By.xpath("//*[@type='radio']"));
		
		
		for(int i=0;i<radio.size();i++)
			
		{
			
			WebElement local_radio=radio.get(i);
			
			String value=local_radio.getAttribute("value");
					
			System.out.println("value of webelemntis--->"+value);
			
			if(value.equalsIgnoreCase("2"))
			{
				
				local_radio.click();
			}
		}
		
				
		}
			
		


}


