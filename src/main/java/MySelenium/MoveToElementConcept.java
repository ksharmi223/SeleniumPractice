package MySelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharmi\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();// Launch Browser
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		
		driver.get("https://www.1800flowers.com");
		
		WebElement flower= driver.findElement(By.xpath("//*[@id='18F_TopNavEspot5']/a"));
		Actions action=new Actions(driver);
		action.moveToElement(flower).build().perform();
		
		
		WebElement tulip= driver.findElement(By.xpath("//*[@id=\'nav_6\']"));// does not work
		Thread.sleep(8000);
		tulip.click();
		
	}

}
// Action class: Drag and drop, mouse over- for menu or sub-menu item- you have to make it visible then click on it, double click.
// need to take care couple of things with action class.Inside the contraction you have to pass the driver instance. Inside the 
//contractor of driver class.
//Action. we have method call moveToElement method() is there.With moveToElement we also have to use
//" .build() and. perform method." must be use with actions class"