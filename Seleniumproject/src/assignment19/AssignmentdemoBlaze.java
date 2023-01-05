package assignment19;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentdemoBlaze {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//enter application URL
		driver.get("https://demoblaze.com/");
		driver.manage().window().maximize();
		WebElement price=driver.findElement(By.xpath("//div[h4[a[text()='Samsung galaxy s6']]]/h5"));
		String pro =price.getText();
		System.out.println(pro);
	}

}
