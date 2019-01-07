package chrome;

import org.testng.annotations.Test;
import org.testng.Assert;

public class multifail {
 String actualTitle= "Aman";
 String expectedTitle= "Sharma";

 @Test
 public void Method1() {
	 
	 System.out.println("Before Assert");
	 Assert.assertEquals(actualTitle, expectedTitle);
	System.out.println("After Assert");
 }
	 @Test
	 public void Method2() {
		 
		 System.out.println("Before Assert");
		 Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("After Assert");
}
 
	//@Test
	//public void testone() {
	//	System.out.println("My First Test Case");
		
		}


