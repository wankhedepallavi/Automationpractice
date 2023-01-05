package assignment19;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigmentflipkart {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//enter application URL
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
			WebElement price=driver.findElement(By.xpath("//div[div[a[text()='SAMSUNG Galaxy F13(Waterfall Blue,64GB)']]]//div[3]/div/div[1]"));
			String pro =price.getText();
			System.out.println(pro);
		}

	

	}


