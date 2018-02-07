package TestNGSessions;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount = 5)
	public void searchTest() {
		System.out.println("My search test");
	}
	@Test(timeOut =10)// it should be executed within 5 seconds. if it goes over that time limit then it will fail.
	public void logoTest() {
		System.out.println("Logo test");
	}
}

// I want to execute same test case multiple times. We can use invocation count= number of time we want to run.