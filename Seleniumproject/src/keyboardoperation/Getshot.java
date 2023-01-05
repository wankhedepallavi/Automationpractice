package keyboardoperation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.SeleniumUtility;

public class Getshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		SeleniumUtility m1=new SeleniumUtility();	
		WebDriver driver=new ChromeDriver();
		TakesScreenshot ts=(TakesScreenshot)driver;
     driver.get("https://demo.vtiger.com/vtigercrm/index.php");
     File file=ts.getScreenshotAs(OutputType.FILE);
     FileUtils.copyFile(file,new File(".\\screenshots\\vtiger1.jpg"));
}
}
