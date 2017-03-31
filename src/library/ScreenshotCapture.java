package library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotCapture 

{
	public static void CaptureScreenshot(WebDriver driver,String screenshotName)
	
	{
		
		TakesScreenshot scr=(TakesScreenshot)driver;

		File source_scr=scr.getScreenshotAs(OutputType.FILE);
		
		try
		
		{
			FileUtils.copyFile(source_scr, new File("./Screenshots/"+screenshotName+".png"));
		
		}
		
		catch (Exception e)
		
		{
			
			System.out.println("Exception while taking screenshot "+e.getMessage());
			
		}
		
		
	}

}
