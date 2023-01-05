package fifthdec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Techlist {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/");
		//maximize the screen
		driver.manage().window().maximize();
		/*click on login button*/
		driver.findElement(By.linkText("JAVA")).click();
		String pageTitle = driver.getTitle();
		System.out.println("page title validation is ="+pageTitle.equals("techlist.com"));
		driver.navigate().back();
		driver.findElement(By.linkText("SELENIUM")).click();
	
	}

}
