package MySelenium;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCencept {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharmi\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://github.com/");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		
		//NOTE:
		//If we need to switch between two domain then we can use navigate()methods.Under navigate() we have to(),back(),forward() method.
		//This is call simulation of back and forward button of your browser.
		// We can't spy on this button to find x-path because this part of your browser not part of webpage. 
		// get() and navigate() both use to launch to URL but navigate is use to some third website and achieve some simulation
		// in actual project its not recommended.

	}

}
