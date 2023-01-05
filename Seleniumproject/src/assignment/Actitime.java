package assignment;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
public static void main(String[] args) 
		 {  
			//Set path for chrome driver
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			//Launching chrome browser
			WebDriver cdriver = new ChromeDriver();
			//Maximize Window
			cdriver.manage().window().maximize();
			cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//URL of application
			cdriver.get("https://demo.actitime.com/");
			//Login application , set username
		    cdriver.findElement(By.id("username")).sendKeys("admin");
		    //set password
			cdriver.findElement(By.className("pwdfield")).sendKeys("manager");
			//Login webpage
			cdriver.findElement(By.linkText("Login")).click();
			//click on Add button
			cdriver.findElement(By.cssSelector(".content.tasks")).click();
			//click on Add New button
			cdriver.findElement(By.className("downIcon")).click();
			//Select Project 
			cdriver.findElement(By.className("createNewProject")).click();
			//Enter Project Name
			cdriver.findElement(By.className("projectNameField")).sendKeys("Testing");
		    //First click Customer dropdown
			cdriver.findElement(By.className("")).click();
			//Select costumer
			cdriver.findElement(By.className("div[class='itemRow cpItemRow ']:nth-child(4)")).click();
			
			}

		
	}


