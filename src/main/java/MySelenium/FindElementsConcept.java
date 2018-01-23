package MySelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharmi\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();// Launch Browser
		
		driver.get("https://www.capitalone.com");
		
	// driver.findelements=
		//How many links are available are in the web page. i want to count then print all the name. when we have to deal
		//with multiple elements in that case we use driver.findElements.
		// in Driver.findelements we don't use click or send keys just simple statements.
		//this method return list of elements-why?- its a design that driver.findElements will return in list of elements.
		// I can't store in single elements- i have to store in array but i can't use array because array size is fixed. thats why they already
		//design to store in dynamic array.
		
		//total link on t he page// all the links are reprentented by a tag
		// list of webElements because will the elements call webElements
		//lisklilst= will create an object and all the link will store there and list store object based on index
		
		List<WebElement> linklist=driver.findElements(By.tagName("a"));
		System.out.println(" Total links on the page" + linklist.size());
		
		for(int i=0;i<linklist.size();i++) {
			System.out.println(linklist.get(i).getText());// to get list of the link to print
			
			String linklest= linklist.get(i).getText();// to click specific link
			if(linklist.equals("Member FDIC")) {
				linklist.get(i).click();
				break;// after clink end it
	
			}
		// total text field on the page:input
			
			List<WebElement> textlist=driver.findElements(By.tagName("input"));
			System.out.println("Total text boxes"+ textlist.size());
			
			
			
			
		//for (int i=0;i<textlist.size();i++) {
			//textlist.get(i).sendKeys("sharmikhan");//to write something but not good practice// not logical // elements found but not visible
			// ElementsNotVisiable= some of the emelents not visible.
			
			
			//Q: In a particular page 4 log in button is there- i want to click on the 3rd button- how will you click on it
			//4 Smiler kind of elements available , how would you find any specific one?
			//by using index ( 0,1,2,3)
			// do we need for loop here- no
			
			
			//List<WebElement> buttonlist= driver.findElements(By.tagName("button"));
			//buttonlist.get(i).click();
		}
			driver.quit();
	
		}

	}


