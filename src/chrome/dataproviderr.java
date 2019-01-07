package chrome;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

 @Test(dataProvider="getdata")


public class dataproviderr {
	 public void datatest(String name, int number, String add, int pin, int code)
	 {
	 	
	 }
@DataProvider //(parallel=true)
	public Object[][] getdata()
	{
		Object[][]obj=new Object[5][5];
	
		obj[0][0]="AMAN";
		obj[0][1]=3467;
		obj[0][2]="MEERUT";
		obj[0][3]=1234;
		obj[0][4]=1345;
		
		obj[1][0]="AMAN";
		obj[1][1]=1235;
		obj[1][2]="DELHI";
		obj[1][3]=9109;
		obj[1][4]=1354;
		
		obj[2][0]="RAJUL";
		obj[2][1]=1293;
		obj[2][2]="NOIDA";
		obj[2][3]=1239;
		obj[2][4]=1244;
		
		obj[3][0]="RAJUL";
		obj[3][1]=1293;
		obj[3][2]="NOIDA";
		obj[3][3]=1239;
		obj[3][4]=5950;
		
		obj[4][0]="RAJUL";
		obj[4][1]=1293;
		obj[4][2]="NOIDA";
		obj[4][3]=1239;
		obj[4][4]=1943;
		
		
		
		
		return obj;
		
	}
}