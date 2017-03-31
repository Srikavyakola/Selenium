package draganddrop;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) throws InterruptedException
	
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kavya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		
		WebElement drag=driver.findElement(By.xpath("//*[@id='draggable']"));
		
		WebElement drop=driver.findElement(By.xpath("//*[@id='droppable']"));
		
		act.dragAndDrop(drag, drop).build().perform();

	}

}

