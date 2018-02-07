package MySelenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharmi\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();// Launch Browser
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		//to switch window -We have to get one window id ? How would you get window id?by using windowHAndaler API and getwindowHandles method
		//driver.getWindowHandles();// getWindowHandles() will return set of object- because getWindowHandles will return unique value.
																				//-property of Set object DOES NOT store basis of indexing.
																				// can't have duplicate value inside set object
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();// return one Iterator reference and we have to import from java and its part of String
		
		String patentWindowId =it.next();//it will give a sting value sos store string
		System.out.println("Parent window id is:" + patentWindowId);
		
		String childWindowId =it.next();
		System.out.println("Child window id is:" + childWindowId);
		System.out.println("Child window title is:" +driver.getTitle());
		
		driver.switchTo().window("childWindowId");
		
		driver.close();// close current browser Q: difference Between close and quite
		
		driver.switchTo().window(patentWindowId);
		
		System.out.println("Parent window title is:" +driver.getTitle());
		
	
	}
}


//NOTE:
// How to handle browser window pop-up: -we window handler API
								      //-we have to switch to particular window. 
									 //-to switch on the partial window we need one window ID.-each window has each unique window ID
//its not javascript pop-up,not windows pop-ups// its having own title and own URL that mean browser based pop-ups.

//two windows- parent and child window- if we need to perform something on the child window we need to switch the driver control.
//How to switch? to switch we need to get one window id-
//How to get the window id? with window-handler API- one method is there get window method is there.