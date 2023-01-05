package projectselenium;
import org.openqa.selenium.chrome.ChromeDriver;
public class Openchrome {
public static void main(String[] args) {
		
		//set the driver executable path using System.setproperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		//create an instance of required browser class
		ChromeDriver cdriver=new ChromeDriver();
		
		/**
		 * Every time Selenium will launch new browser 
		 * Browser opened by Selenium won't be having 
		 * 			1. History
		 * 			2. plugins
		 * 			3. cookies
		 */
	}

}
