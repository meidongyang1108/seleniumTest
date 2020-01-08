package test.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElementsTest {

	WebDriver chrome;
	@BeforeMethod
	public void openChrome() {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse\\TestWeb02\\Drive\\chromedriver.exe");
		chrome = new ChromeDriver();
	}
	
	@Test
	public void byIdTest() throws InterruptedException {
		chrome.get("https://www.baidu.com/");
		WebElement keyField = chrome.findElement(By.id("kw"));
		keyField.sendKeys("235");
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void closeBrowser() {
		chrome.quit();
	}
}
