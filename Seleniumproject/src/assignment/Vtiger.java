package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//set implicit wait for WebDriver
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//enter application URL
				driver.get("https://demo.vtiger.com/vtigercrm/index.php");
				//enter Username 
				WebElement username=driver.findElement(By.id("username"));
				username.clear();
				username.sendKeys("admin");
				//enter password
				WebElement pwd=driver.findElement(By.id("password"));
				pwd.clear();
				pwd.sendKeys("Test@123");
				//click on Login button
				driver.findElement(By.className("buttonBlue")).click();
			}
		

	}


