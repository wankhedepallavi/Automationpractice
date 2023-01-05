package projectselenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Openfirefox {
	

		public static void main(String[] args) {
			
			//set the driver executable path using System.setproperty(String key,String value)
			System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
			
			//create an instance of required browser class
			FirefoxDriver cdriver=new FirefoxDriver();
			
			/**
			 * Every time Selenium will launch new browser
			 * Browser opened by Selenium won't be having 
			 * 			1. History
			 * 			2. plugins
			 * 			3. cookies
			 */
		}

	}


