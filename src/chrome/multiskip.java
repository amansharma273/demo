package chrome;

import org.testng.annotations.Test;
import org.testng.SkipException;

public class multiskip {

	@Test
	public void testone() {
		System.out.println("My First Test Case");
		throw new SkipException("message");
		}

		@Test(dependsOnMethods="testone")
		public void testtwo() {
		System.out.println("My Second Test Case");
		}

		@Test
		public void testthree() {
		System.out.println("My Third Test Case");
		}
}
