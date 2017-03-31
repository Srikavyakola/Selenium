package fileupload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.apache.commons.exec.launcher.Java13CommandLauncher;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadByRobot {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException
	
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kavya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		StringSelection sel=new StringSelection("C:\\Users\\Kavya\\Documents\\Resume\\Full BTech\\SriKavyaKola.pdf");
	
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		
		driver.get("http://my.monsterindia.com/create_account.html");
		
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("scroll(0,150)");
		
		driver.findElement(By.xpath("//*[@id='wordresume']")).click();
		
		Thread.sleep(2000);
		
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_ENTER);

		robot.keyRelease(KeyEvent.VK_ENTER);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyRelease(KeyEvent.VK_ENTER);
	
	}

}
