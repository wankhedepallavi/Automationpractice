package projectselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonex1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver cdriver = new ChromeDriver();
		cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cdriver.get("https://www.amazon.in");
		
		System.out.println("Page title is: "+cdriver.getTitle());
		WebElement firstNameInputField=cdriver.findElement(By.className("a-aui_72554-c"));
		System.out.println("Page title is: "+cdriver.getTitle());
		cdriver.navigate().back();
		System.out.println("Page title is: "+cdriver.getTitle());
		cdriver.close();
		
	}

}

