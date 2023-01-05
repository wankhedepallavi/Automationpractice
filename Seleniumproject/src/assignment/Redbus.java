package assignment;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Redbus {
	public static void main(String[] args)
	 {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		ChromeDriver cdriver = new ChromeDriver();
		cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cdriver.get("https://www.redbus.in/"); 
		//maximize the page
		cdriver.manage().window().maximize();
		//Write city name from-Pune 
		cdriver.findElement(By.className("db")).sendKeys("Pune");
		//Select Pune
		cdriver.findElement(By.cssSelector("ul.autoFill.homeSearch>li")).click();
		//Write city name To-Goa
		cdriver.findElement(By.id("dest")).sendKeys("Goa");
		//Select Goa
		cdriver.findElement(By.cssSelector("ul.autoFill.homeSearch>li")).click();
		//In calender click on Arrow button
		cdriver.findElement(By.className("next")).click();
		//Select future date
		cdriver.findElement(By.cssSelector("div.rb-calendar>table>tbody>tr:nth-child(5)>td:nth-child(3)")).click();
		//click on Search button
		cdriver.findElement(By.id("search_btn")).click();
	   }
	}


