package hoverPrograms;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkarthover {

	public static void main(String[] args) throws InterruptedException {
		String chromeExePath = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";
		// setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		// creating an instance of Chrome browser and up-casting it to WebDriver
		// interface
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// to enter required application URL use get() of WebDriver interface
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		//click on mobile and tablets
		driver.findElement(By.linkText("Mobiles & Tablets")).click();
		// identify all the elements of main menu
		List<WebElement> mainMenu = driver.findElements(By.cssSelector("div._331-kn>div>div>span"));
		System.out.println("Main Menu option count: " + mainMenu.size());
		// create an instance of Actions class by passing required browser instance to its constructor
		Actions act = new Actions(driver);
		
		/** do to hover in all mainmenu options */
	for(int i=0;i<mainMenu.size();i++) {
		WebElement option=mainMenu.get(i);
		act.moveToElement(option).perform();
		Thread.sleep(1000);

	}
	}
}


