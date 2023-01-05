package fifthdec;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		String pageTitle = driver.getTitle();
		System.out.println("page title validation is ="+pageTitle.equals("log in to facebook"));
		System.out.println("print page title on console ="+pageTitle);
		driver.close();
		
	}

}
