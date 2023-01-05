package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFlipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
       ChromeDriver driver=new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
       //URL of flipkart
       driver.get("https://www.flipkart.com/");
       driver.manage().window().maximize();
       List<WebElement> suggestList=driver.findElements(By.cssSelector("#container>div>div._331-kn._2tvxW>div>div>div"));
       //Web element total count
       int suggCount=suggestList.size();
       System.out.println(suggCount);
       //to access one by one list element
       for(int i=0;i<suggCount;i++) {
    	   System.out.println(suggestList.get(i).getText());
       }
       
	}

}
