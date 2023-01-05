package fifthdec;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlehomepage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String pageTitle = driver.getTitle();
		System.out.println("print page url ="+driver.getCurrentUrl());
		String sourcecode = driver.getPageSource();
		driver.close();
	}

}
