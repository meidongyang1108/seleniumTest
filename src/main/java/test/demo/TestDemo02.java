package test.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestDemo02 {

	
	WebDriver chrome;
	@Test
	public void assertEqualTest() {
		String a = "123468";
		String b = "1234678";
		
		Assert.assertEquals(a, b,"≤ªœ‡µ»");
	}
	
	@Test
	public void assertNullTest() {
		String a = null;
		String b = "1234678";
		
		Assert.assertNull(a);
	}
	
	@Test
	public void openChrome() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse\\TestWeb02\\Drive\\chromedriver.exe");
		chrome = new ChromeDriver();
		chrome.get("https://www.baidu.com/");
		Thread.sleep(5000);
	}
	
	@Test
	public void openFirefox() throws InterruptedException {
		WebDriver firefox = new FirefoxDriver();
		firefox.get("https://www.baidu.com/");
		Thread.sleep(5000);
	}
	
	@Test
	public void backTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse\\TestWeb02\\Drive\\chromedriver.exe");
		chrome = new ChromeDriver();
		chrome.get("https://www.baidu.com/");
		Thread.sleep(5000);
		chrome.get("http://www.hd-163.com/");
		Thread.sleep(3000);
		chrome.navigate().refresh();
		chrome.navigate().back();
		Thread.sleep(5000);
		chrome.navigate().forward();
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void closeBrowser() {
		chrome.quit();
	}
}
