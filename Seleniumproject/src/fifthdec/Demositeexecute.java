package fifthdec;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demositeexecute {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// create instance of required browser class
		WebDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demosite.executeautomation.com/Login.html");
		
		driver.findElement(By.name("UserName")).sendKeys("execution");
		driver.findElement(By.name("Password")).sendKeys("admin");
		String pageTitle=driver.getTitle();
		System.out.println("Page title length: "+pageTitle.length());
		System.out.println("Page url is: "+driver.getCurrentUrl() );
		System.out.println("verify url : "+driver.equals(driver));
		
		
		
		
		System.out.println("Page title is: "+pageTitle);
		System.out.println("print page url ="+driver.getCurrentUrl());
		WebElement logoutField = driver.findElement(By.tagName("span"));
		logoutField.click();
		
		
		//driver.close();
		
		

	}

}
