package MySelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebDriverMethods {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharmi\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();// Launch Browser
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);// sometime page is slow-this is so dynamic that if the
		//page is loaded in 2 sec then rest of the time will be ignored. if the page is not loaded after 20 seconds then it will
		//give time out exception.
		//its only only pages- page loading.
		
		driver.get("https://www.capitalone.com");
		driver.navigate().refresh();//never recommended- raise the bug after manually check it

	}

}

//manage()- returning number of options-option is a abstract class which are having all those method maximize(), window(),deleteAllCookies()
//