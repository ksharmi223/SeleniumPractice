package MySelenium;

import java.io.File;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotConcept {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharmi\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();// Launch Browser
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		
		driver.get("https://www.1800flowers.com");
		
		//take screenshot and store as a file format
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//now copy the screenshot to desire location using copyFile// method
		//FileUtils.copyFile(src,new File("location");
		
		//takesScreenshot=interface
		// getScreenshotAs=method
		//copyFile= copy the file one location to another location
	}

}
