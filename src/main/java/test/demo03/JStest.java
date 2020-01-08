package test.demo03;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JStest {

	
	WebDriver chrome;
	@BeforeMethod
	public void openChrome() {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse\\TestWeb02\\Drive\\chromedriver.exe");
		chrome = new ChromeDriver();
	}
	
	@Test
	public void exJSTest() throws InterruptedException {
		chrome.get("https://www.baidu.com/");
		JavascriptExecutor js = (JavascriptExecutor)chrome;
		js.executeScript("document.getElementById(\"kw\").setAttribute(\"value\",\"1234\")");
		Thread.sleep(5000);;
	}
	@AfterMethod
	public void closeBrowser() {
		chrome.quit();
	}
}
