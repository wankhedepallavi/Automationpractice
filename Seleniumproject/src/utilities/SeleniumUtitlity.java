package utilities;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtitlity {
	
		public static WebDriver driver = null;
		public static Actions action = null;
		public WebDriverWait wait;
		
		public WebDriver setUp(String browserName, String appUrl) {

			if (browserName.equalsIgnoreCase("Chrome")) {
				// use setup method of WebDriverManager
				// WebDriverManager.chromedriver().setup();
				System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
				// step2: create an instance of Chrome Browser
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("ie")) {
				// use setup method of WebDriverManager
				// WebDriverManager.iedriver().setup();
				System.setProperty("webdriver.ie.driver", ".\\drivers\\IEDriverServer.exe");
				// step2: create an instance of Chrome Browser
				driver = new InternetExplorerDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				// use setup method of WebDriverManager
				// WebDriverManager.firefoxdriver().setup();
				System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
				// step2: create an instance of Chrome Browser
				driver = new FirefoxDriver();
			}
			// maximize browser
			driver.manage().window().maximize();
			// implicit wait
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			wait = new WebDriverWait(driver, 20);
			driver.get(appUrl);
			action = new Actions(driver);
			return driver;
		}

		public void performClick(WebElement element) {
			element.click();
		}

		public void typeInput(WebElement element, String text) {
			element.clear();
			element.sendKeys(text);
		}

		public String getCurrentWorkingDir() {
			//String currentDir = System.getProperty("user.dir");
			return System.getProperty("user.dir");
		}

		public void copyTextFromField(WebElement element) {
			action.doubleClick(element).perform();
			element.sendKeys(Keys.chord(Keys.CONTROL, "c"));
		}

		public void pasteTextInToField(WebElement element) {
			element.sendKeys(Keys.chord(Keys.CONTROL, "v"));
		}
		
		public void copyPasteText(WebElement textToBeCopied,WebElement textToBePasted) {
			action.doubleClick(textToBeCopied).perform();
			textToBeCopied.sendKeys(Keys.chord(Keys.CONTROL, "c"));
			textToBePasted.sendKeys(Keys.chord(Keys.CONTROL, "v"));
		}

		public void waitTillElementIsClickable(WebElement element) {
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}

//		public List<WebElement> getAllElements(String locatorType,String locatorValue){
//			//switch  case
//		}

		public String getValueFromPropertyFile(String fileName, String key) {
			Properties prop = getPropertyFile(fileName);
			return prop.getProperty(key);
		}

		public Properties getPropertyFile(String fileName) {
			String filePath = getCurrentWorkingDir() + fileName;
			FileInputStream fis = null;
			try {
				fis = new FileInputStream(filePath);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			Properties prop = new Properties();
			try {
				prop.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
			return prop;
		}

		
		
		}

