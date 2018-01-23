package MySelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static void main(String [] args) {
		
		//How to open Chrome browser- to open we have specific ChromeDriver class is available-
		//As per dynamic polimorpysim child class object can refer by parent interface reference variable.
		// we can write ChromeDriver driver= new Chromdriver - if you write these way then only Chrome will work.
		//to prevent these we use dynamic polimorphysim.
		
		//Q:How we launch the browser= we launch Chrome browser with help Chrome Driver.
		//Q:What is object?= new ChromeDriver
		//Q:What is this concept name? dynamic polimorphysim- child class object refer by parent interface reference variable.
		// if you don't define the set property what exception you will get?IllegalStateException
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharmi\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();// Launch Browser
		
		driver.get("https://www.loft.com");//enter URL
		
		String title=driver.getTitle();// get the title
		
		System.out.println("The title of the page is :" + title);
		
		
		//Validation point
		if (title.equals("New Arrivals: Women's Clothing | LOFT")) {
			System.out.println("Correct title");
		}
		else {
			System.out.println("In-correct title");
		}
		
		System.out.println("The current URL:" + driver.getCurrentUrl());
		
		driver.close();// to close the current browser
	}
	


}
