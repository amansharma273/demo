package chrome;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

 @Test(dataProvider="getdata")


public class dataprovider {
	 public void datatest(String name, int number, String add, int pin)
	 {
	 	
	 }
@DataProvider //(parallel=true)
	public Object[][] getdata()
	{
		Object[][]obj=new Object[3][4];
	
		obj[0][0]="AMAN";
		obj[0][1]=3467;
		obj[0][2]="MEERUT";
		obj[0][3]=1234;
		
		obj[1][0]="AMAN";
		obj[1][1]=1235;
		obj[1][2]="DELHI";
		obj[1][3]=9109;
		
		obj[2][0]="RAJUL";
		obj[2][1]=1293;
		obj[2][2]="NOIDA";
		obj[2][3]=1239;
		
		
		
		
		return obj;
		
	}
}