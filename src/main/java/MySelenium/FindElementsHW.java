package MySelenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsHW {

	public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharmi\\Downloads\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();// Launch Browser
			driver.manage().window().maximize();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			
			
			driver.get("https://www.jcrew.com");
			
			//driver.navigate().refresh();
			
			List<WebElement> lists=driver.findElements(By.xpath("//selection[@id='category-rail']"));
			System.out.println(lists.size());
		
			
			//List<WebElement> links=driver.findElements(By.tagName("a"));
			//System.out.println("total number of link:" + links);
			//for(int i =0;i<links.size();i++) {
				//String list=links.get(i).getAttribute("footer");
				//links.get(i).click();
				//driver.navigate().back();
				
			}
			
		

	}


