package fifthdec;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://sampleapp.tricentis.com/101/");
		String pageTitle=driver.getTitle();
		System.out.println("Page title is: "+pageTitle);
		System.out.println("Page title validation: "+pageTitle.equals("Login"));
		
		//print page url and validate it
		System.out.println("Page url is: "+driver.getCurrentUrl() );
		System.out.println("validate page url ="+driver.equals("driver"));
		
		//get page source and print its length
		String sourceCode=driver.getPageSource();
		System.out.println("Page source code is: "+sourceCode);
		System.out.println("Source code lenght: "+sourceCode.length());
		
	}



	}


