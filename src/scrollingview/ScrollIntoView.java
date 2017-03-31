package scrollingview;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args)
	
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kavya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
	
		WebElement ele=driver.findElement(By.xpath(".//*[@id='mCSB_1_container']/p[4]/img[1]"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", ele);

		System.out.println(ele.getText());
	}

}
