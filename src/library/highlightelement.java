package library;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class highlightelement {

	public static void hightlightelement(WebDriver driver, WebElement ele) throws InterruptedException
	
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px red');", ele);
		
		js.executeScript("arguments[0].setAttribute('style','background: yellow','border: solid 2px red');", ele);

	}

}
