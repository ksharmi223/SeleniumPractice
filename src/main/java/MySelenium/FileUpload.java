package MySelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharmi\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();// Launch Browser
		
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.findElement(By.xpath("//*[@id=\"filesToUpload\"]")).sendKeys("C:\\Users\\Sharmi\\Documents");

	}

}


//FileUpLoad:
// operating system PopUp: Selenium does not support this.
//How to Upload:
//1)SPY
//2)If type ="file"- don't need to click on it- If file then we can handle. or else i can't or else use AutoID or Sikuli
