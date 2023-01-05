package switching;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.SeleniumUtility;

public class HandlingFormFilling {
	static WebDriver driver;
		public static void main(String[] args)
		 {
			WebDriverManager.chromedriver().setup();
		    SeleniumUtility s1=new SeleniumUtility();
			WebDriver driver=s1.setUp("chrome", "https://demo.automationtesting.in/Register.html");
			
			//first name
		    driver.findElement(By.cssSelector("input[placeholder=\"First Name\"]")).sendKeys("PALLAVI",Keys.ENTER);
			//last name
			driver.switchTo().activeElement().sendKeys("WANKHEDE",Keys.TAB);
			//Adress
		     driver.switchTo().activeElement().sendKeys("NAGPUR",Keys.TAB);
		    //E-mail ID
		     driver.switchTo().activeElement().sendKeys("pallaviwankhede@gmail.com",Keys.TAB);
		     //phone number
		     driver.switchTo().activeElement().sendKeys("9130775127",Keys.TAB);
		     //Gender select
		     driver.findElement(By.cssSelector("input[value='Female']")).click();
		     //Select Hobbies
		     driver.findElement(By.cssSelector("input[value='Cricket']")).click();
		     
		     //First click on it & Select Language
		     //pagedown - used
		     driver.findElement(By.id("msdd")).click();
		     driver.findElement(By.cssSelector("ul.ui-autocomplete>li:nth-child(3)")).click();
			 //*[text()='English']-xpath
		     
		     //Select skill
		     driver.findElement(By.xpath("//*[text()='Select Skills']")).click();
		     driver.findElement(By.cssSelector("select[id=\"Skills\"]>option:nth-child(6)")).click();
		     //select Country
		     driver.findElement(By.xpath("//*[text()='Select Country']")).click();
		     driver.findElement(By.cssSelector("select[id=\"country\"]>option:nth-child(6)")).click();
		     //select year
		     driver.findElement(By.id("yearbox")).click();
		     driver.findElement(By.cssSelector("select[id=\"yearbox\"]>option:nth-child(84)")).click();
		     //select month
		     driver.findElement(By.cssSelector("select[placeholder='Month']")).click();
		     driver.findElement(By.cssSelector("select[placeholder=\"Month\"]>option:nth-child(11)")).click();
		     //select Date of Birth
		     driver.findElement(By.cssSelector("select[placeholder='Day']")).click();
		     driver.findElement(By.cssSelector("select[placeholder=\"Day\"]>option:nth-child(30)")).click();
		     //Fill Password
		     driver.switchTo().activeElement().sendKeys("3090",Keys.TAB);
		     //Refill Password and submit Form
		     driver.switchTo().activeElement().sendKeys("3090",Keys.TAB);
		     
		     
		     //   div[class=""]>  css
		     //div[@class=""]/
		     }

		}

