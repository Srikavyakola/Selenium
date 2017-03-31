package fileupload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadByAutoIT {

	public static void main(String[] args) throws IOException, InterruptedException
	
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kavya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Kavya/Desktop/Eclipse/Autoit/fileupload.html");
		
		driver.findElement(By.xpath("//*[@id='1']")).click();
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("C:\\Users\\Kavya\\Desktop\\Eclipse\\Autoit\\fileuploading.exe");

	}

}
