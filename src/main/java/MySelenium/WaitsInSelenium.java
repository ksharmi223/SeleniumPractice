package MySelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WaitsInSelenium {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharmi\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);//if its going beyond that then it will trough some timeout exception
		
		
		//implicit wait: Global element-appplicable for all elements used by driver.it will wait for certain amount of time before giving exception.
		//if element is found within 2 sec then rest of the 18 second will be ignored- that's why its call dynamic wait.
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com");
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		
		//login button:
		
		WebElement loginBtn= driver.findElement(By.xpath("//input[@type='submit]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeAsyncScript("arguments[0].click();" ,loginBtn);
		
		//threads.sleep: script will pause your script - worst wait - we should never use .ex: 10,000 code x 5sec wait= unnecessary wait time.
		//when nothing working- its a static wait - its pause your script for certain amount of time-it disturb the performance of your script.
		//solution is dynamic wait- it's global wait, for all the elements.
		
		
		//Explicit Wait: used to provide wait explicitly-based on some condition- very intelligent wait- only for specific to element.
		//it is used to tell selenium webdriver to wait for certain condition--expected condition not satisfy.
		//OR
		//if the given time is over
		//then thrown an exception-- element NOT visible/ NOt Found Exception
		//To use explicit wait : we have to classes available
		//1) WebdriverWait and 2) ExpectedConditions.
		driver.switchTo().frame("mainpanel");
	
		WebDriverWait wait=new WebDriverWait(driver,20);
		
		
		WebElement username;
		username=(WebElement) wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//td[contains(test,'naveen K']")));
		System.out.println(username.getText());
		
		
		//Q: what the interval for explicit wait:5000 Millisecond interval -wait for 20 second
		
		//	1) an element is visible and enable: elementToBeclickable(By locator)
		//   2)an element to be selected:elementToBeSelected(By locator)
		// 3)presence of an element: presenceOfElementLOcated(BY locator)
		// specific text present in an element: textTOBePresentInElement(By locator,Strong text)

	}

}

//Note: Wait
//lower environment: QA, DEV, staging- we are running our automation code on lower environment.Where application is not that fast.functionality 
//wise its working fine .WHY? because production server we using very high configuration, ram, network speed, hardware configuration is very powerful.
//In lower statge=some component, image , button coming little late-its taking some time-Selenium will not wait for the element- 
// Immediately selenium will try to click or perform some action on that element-but element is not visible in the dom-
// selenium will trough NoSuchElementException- why  we get that exception? because element is not available on the page.

// We have TWO type of wait in selenium- static and dynamic wait
