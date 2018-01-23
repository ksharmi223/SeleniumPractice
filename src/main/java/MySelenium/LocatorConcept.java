package MySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {


	public static void main(String[] args) {
		
		//How to interact with webElement?
		//HTML dom=document object model
		//What is the return type of find elements?  WebElements- WebElement is an interface- store in WebElement reference.
		//Inside By class there is 8 type of locator
		//1)id - id is the best because its unique(priority =1) 2)name(priority =2) 3)xpath (priority =3) 4)CSS selector- can't handle some complex object(priority =2 &3) 
		//5) linkText- only for links - link test start with <a & test before end.6)partial link text- not recommended
		//7)class name-not recommended- because its not unique. 8) Tag name
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharmi\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();// Launch Browser
		
		driver.get("https://www.capitalone.com");
		
		//#1 approach- this is better approach
		//WebElement userId= driver.findElement(By.id("no-acct-uid"));
		//userId.sendKeys("sharmikhan");
		
		//#2 approach
		driver.findElement(By.id("no-acct-uid")).sendKeys("sharmikhan");
		
		driver.findElement(By.name("no-acct-pw")).sendKeys("aqsa");
		
		driver.findElement(By.xpath("//Button[@id='no-acct-submit']")).click();
		
		//driver.findElement(By.cssSelector("#full-bleed > div.content.left.seven > div > div > a")).click();//css=cascading style sheet
		
		driver.findElement(By.linkText("Locations")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("Respond to")).click();
		
		
		//driver.findElement(By.className(""))
			

	}

}
