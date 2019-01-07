package chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","\\E:\\chromedriver_win32\\chromedriver.exe\\");
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://www.google.co.in/");

	}

}
