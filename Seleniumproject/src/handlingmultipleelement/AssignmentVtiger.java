package handlingmultipleelement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentVtiger {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		String pageTitle=driver.getTitle();
		//login vtiger
		driver.findElement(By.tagName("button")).click();
		List<WebElement>suggestList=driver.findElements(By.cssSelector("div.dashBoardTabContainer>div>div>div>ul>li>a"));
		//web element total count
		int suggCount=suggestList.size();
		System.out.println(suggCount);
		//to access one by one list element
		for(int i=0;i<suggCount;i++) {
			System.out.println(suggestList.get(i).getAttribute("innerHTML"));
			
		}
		

	}

}
