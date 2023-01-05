package switching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

public class HandlingFlipkart {
	SeleniumUtility s1 = new SeleniumUtility();
	WebDriver driver = s1.setUp("chrome", "https://www.flipkart.com/");
	WebElement btnClose = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("._2AkmmA._29YdH8")));
	//btnClose.click();

	WebElement menu = driver.findElement(By.xpath("//span[text()='Electronics' and @class='_1QZ6fC _3Lgyp8']"));
	Actions action = new Actions(driver);
//	action.moveToElement(menu).click(menu).build().perform();

	WebElement sub_menu =  driver.findElement(By.cssSelector("a[href='/mobile-phones-store?otracker=nmenu_sub_Electronics_0_Mobiles']"));
	//sub_menu.click();

}
