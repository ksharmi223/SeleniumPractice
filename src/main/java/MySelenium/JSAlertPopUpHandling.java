package MySelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlertPopUpHandling {

	public static void main(String[] args) {
	
		
		// Q: How to handle Alert:
		//Using Alert API in selenium- what do you mean by alert API?- Alert API available in form of alert abstract  class
		//There are 3 different methods are available- accept(),dismiss(), gettext().
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharmi\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();// Launch Browser
		
		driver.get("https://www.mail.rediff.com/");
		driver.findElement(By.name("proceed"));
		Alert alert=driver.switchTo().alert();
		
		String text=alert.getText();
		System.out.println(" teh alert message is:" + text);
		
		//1st- get test ,2nd- verify and 3rd- accept /dismiss it
		if (alert.equals("Please enter a valid user name")) {
		}else {
			System.out.println("Incorrect message");
		}
		alert.accept();
		//cancel button:
		//alert.dismiss():
	}
			
	}



//Note:I can't spy this because its from JS alert. They wrote a code in the form of javascrift in back end HTML.
// This is some kind of confirmation.How to handle this kind of popUp?
// I have to switch the control from website to alert box: switchTo() method-switch to use for switchTo.alert, switchTo.frame switchTO.window
//Alert return one abstract class. In this particular alert we have different method alert.getText()