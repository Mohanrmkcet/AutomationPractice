package com.selenium.baseclass;

import java.io.File;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {

	public static WebDriver driver;

// 1.BROWSER LAUNCH

	public static WebDriver getBrowser(String browserName) throws Exception {

		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
						+ "\\src\\test\\resource\\com\\selenium\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "\\library\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + "\\library\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else {
				throw new Exception("Please enter valid browserName");
			}
			driver.manage().window().maximize();
			return driver;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

//2. CURRENT URL

	public static void getUrl(String siteurl) throws Exception {
		try {
			driver.get(siteurl);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

//3.ELEMENT VISIBLITY 

	public static void waitforElementVisibility(WebElement Element) throws Exception {
		try {
			WebDriverWait wbw = new WebDriverWait(driver, 2000);
			wbw.until(ExpectedConditions.visibilityOf(Element));
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}
//4. IS DISPLAYED

	public static boolean elementIsDisplayed(WebElement Element) throws Exception {
		try {
			boolean display = Element.isDisplayed();
			return display;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

//5. IS ENABLED

	public static boolean elementIsEnabled(WebElement Element) throws Exception {
		try {
			boolean enable = Element.isEnabled();
			return enable;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}
//6. IS SELECTED

	public static boolean elementIsSelected(WebElement Element) throws Exception {
		try {
			boolean selected = Element.isSelected();
			return selected;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}
//7. SENDKEYS

	public static void sendkeys(WebElement Element, String values) throws Exception {
		try {
			waitforElementVisibility(Element);
			if (elementIsDisplayed(Element) && elementIsEnabled(Element)) {
				Element.clear();
				Element.sendKeys(values);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

//8. CLICK

	public static void clickoperation(WebElement Element) throws Exception {
		try {
			waitforElementVisibility(Element);
			if (elementIsDisplayed(Element)) {
				Element.click();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

//9. MOUSE HOVER

	public static void mouseHoveroperation(WebElement Element) throws Exception {
		try {
			waitforElementVisibility(Element);
			Actions ac = new Actions(driver);
			ac.moveToElement(Element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

//10. DROPDOWN

	public static void dropdown(WebElement Element, String value, String option) throws Exception {
		try {
			// waitforElementVisibility(Element);
			Select sc = new Select(Element);
			if (option.equalsIgnoreCase("value")) {
				sc.selectByValue(value);
			} else if (option.equalsIgnoreCase("index")) {
				sc.selectByIndex(Integer.parseInt(value));
			} else if (option.equalsIgnoreCase("text")) {
				sc.selectByVisibleText(value);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

//11. SCROLL TO PARTICULAR ELEMENT

	public static void scrolltoelement(WebElement Element) throws Exception {
		try {
			waitforElementVisibility(Element);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", Element);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

//12. SCROLL BASED ON WIDTH & HEIGHT

	public static void scrollonwidthheight(int width, int height) throws Exception {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("windows.scrollBy(" + width + ", " + height + ")");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

//13. DRAG AND DROP

	public static void draganddrop(WebElement sourc, WebElement dest) throws Exception {
		try {

			waitforElementVisibility(sourc);
			Actions ac = new Actions(driver);
			ac.dragAndDrop(sourc, dest).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

//14. DOUBLE CLICK
	public static void doubleclick(WebElement Element) throws Exception {
		try {
			waitforElementVisibility(Element);
			Actions ac = new Actions(driver);
			ac.doubleClick(Element).build().perform();

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

//15. RIGHT CLICK

	public static void rightclick(WebElement Element) throws Exception {
		try {
			waitforElementVisibility(Element);
			Actions ac = new Actions(driver);
			ac.contextClick(Element).build().perform();

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

//16. SIMPLE ALERT
	public static void simplealert() throws Exception {
		try {
			Alert al = driver.switchTo().alert();
			al.accept();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();

		}
	}

//17. PROMPT ALERT

	public static void promptalert() throws Exception {
		try {
			Alert al = driver.switchTo().alert();
			al.sendKeys("hai");
			al.accept();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

//18. CONFIRMATION ALERT

	public static void confirmationalert() throws Exception {
		try {
			Alert al = driver.switchTo().alert();
			al.dismiss();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();

		}
	}
//19. FRAME SWITCH TO DEFAULT CONTENT

	public static void switchtodefaultcontent() throws Exception {
		try {
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

//20. GET TEXT FROM THE ATTRIBUTE
	public static String gettextfromtheelement(WebElement Element) throws Exception {
		try {
			waitforElementVisibility(Element);
			String text = Element.getText();
			return text;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();

		}
	}

//21. GET ATTRIBUTE NAME

	public static String getattributename(WebElement Element, String attkey) throws Exception {
		try {
			waitforElementVisibility(Element);
			String attname = Element.getAttribute(attkey);
			return attname;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();

		}
	}

//22. FRAME SWITCHING
	public static void frameswitching(WebElement Element) throws Exception {
		try {
			driver.switchTo().frame(Element);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

//23. SCREENSHOT

	public static File screenshot(String filename) throws Exception {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File sourc = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(System.getProperty("user.dir")
					+ "\\src\\test\\resource\\com\\selenium\\reports\\ExtentReports\\ScreenShot\\" + filename + ".png");
			FileUtils.copyFile(sourc, dest);
			return dest;
		} catch (WebDriverException e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

//24. WINDOW HANDLING

	public static void windowshandling(String WindowTitle) {
		try {
			String firstID = driver.getWindowHandle();
			Set<String> parentID = driver.getWindowHandles();
			for (String z : parentID) {
				driver.switchTo().window(z);
				String title = driver.getTitle();
				if (title.equals(WindowTitle)) {
					driver.switchTo().window(z);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//25. CLOSE

	public static void Toclose() throws Exception {
		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}
//26. QUIT

	public static void Toquit() throws Exception {
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

//27. GET TITLE

	public static String getTitleofwindow() throws Exception {
		try {
			String titlename = driver.getTitle();
			return titlename;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

//28. GET CURRENT URL

	public static String TogetCurrentUrl() throws Exception {
		try {
			String currentUrl = driver.getCurrentUrl();
			return currentUrl;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

//29. NAVIGATE TO OTHER SITE

	public static void sitenavigate(String site) throws Exception {
		try {
			driver.navigate().to(site);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

//30. NAVIGATION - REFRESH,BACK,FORWARD

	public void navigateCommands(String option) throws Exception {
		try {
			if (option.equalsIgnoreCase("torefresh")) {
				driver.navigate().refresh();
			} else if (option.equalsIgnoreCase("gobackward")) {
				driver.navigate().back();
			} else if (option.equalsIgnoreCase("goforward")) {
				driver.navigate().forward();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

//31. HIGHLIGHT WEBELEMENT

	public static void highlightWebelement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
	}
}
