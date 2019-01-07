package chrome;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestCase {

	@Test
	public void testone() {
	System.out.println("My First Test Case");
	}

	@Test
	public void testtwo() {
	System.out.println("My Second Test Case");
	throw new SkipException("message");
	}

	@Test(dependsOnMethods="testtwo")
	public void testthree() {
	System.out.println("My Third Test Case");
	}

	@Test
	public void testfour() {
	System.out.println("My Four Test Case");
	}
}
