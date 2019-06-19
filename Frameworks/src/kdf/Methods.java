package kdf;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
	static WebDriver driver;
	public static void openBrowser() {
		driver = new ChromeDriver();
	}


	public static void maximizeBrowser() {
		driver.manage().window().maximize();
	}
	public static void implicitlyWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public static void navigateToApplication(String url) {
		driver.get(url);
	}

	public static void enterUserID(String loc, String locvalue, String userID) {
		if(loc.equals("id")) {
			driver.findElement(By.id(locvalue)).sendKeys(userID);
		}
		else if(loc.equals("name")) {
			driver.findElement(By.name(locvalue)).sendKeys(userID);
		}
	}
	public static void enterPassword(String loc,String locValue, String password) {
		if(loc.equals("id")) {
			driver.findElement(By.id(locValue)).sendKeys(password);
		}
		else if(loc.equals("name")) {
			driver.findElement(By.name(locValue)).sendKeys(password);
		}
	}

	public static void clickSubmit(String loc, String locValue) {
		if(loc.equals("id")) {
			driver.findElement(By.id(locValue)).click();
		}
		else if(loc.equals("name")) {
			driver.findElement(By.name(locValue)).click();
		}
	}
	public static void verifyErrorMessage(String locValue, String expectedResult) {
		String actualResult = driver.findElement(By.cssSelector(locValue)).getText();
		Assert.assertEquals(expectedResult, actualResult);
	}
	public static void closeApplication() {
		driver.close();
	}

}
