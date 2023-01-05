package keyboardoperation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class GetScreenshot {
	
	public static void main(String[] args) throws IOException {
		SeleniumUtility m1=new SeleniumUtility();	
		WebDriver driver=m1.setUp("chrome", "https://www.flipkart.com/");
		//type cast WebDriver instance into TakesScreenshot interface
		m1.takeScreenshot(".\\screenshots\\flipkart.jpg");
	}

}