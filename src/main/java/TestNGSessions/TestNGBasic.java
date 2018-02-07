package TestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGBasic {
	
	WebDriver driver;// i am using it class level because scope will be globally define. This driver can accessed in any method
	
	
	@BeforeMethod   // before any test case this will execute// each and every annotation must have method name
	
	public void startUp() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharmi\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.freecrm.com");
	
	
	}
	
	@Test

	private void verifyPageTitleTest() {
			String title =driver.getTitle();
			System.out.println(" The title ofthe page is :" + title);
			//testNG provide assertion- assertion is very smart - internally assert convert to if else verification
			Assert.assertEquals(title, "#1 Free CRM for Any Business: Online Customer Relationship Software");
	}	
	@Test
	public void veryfyFreeCRMLogoTest() {
		
		boolean flag = driver.findElement(By.xpath("//img[contains(@class,'img-responsive')]")).isDisplayed();
		Assert.assertTrue(flag);
	}

	
	@AfterMethod
	
	public void tearDown() {
		driver.quit();
	}


}







//TestNG note:
//Unit testing Framework- for Selenium, WebServices,API
// TestNG provide a lot of annotations - to write write your test cases systematic way
// Its provide a lot of features- different annotations are there , reporting , write test cases in very systematic way
//you can execute test cases priority basis,you can divide your test cases in group wise, you can define dependencies.
// No main method- works basis of annotation
// Annotation- A logic behind the code- before every test case i want define some pre-condition- @Beforemethod
// we don't need to tell java before each method - testNG will take care of that
//TestNg take care configuration, sequences, pre- and post condition ,reporting you just take care of writing code.
//TestNg only for Java