package test.demo02;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTest {

	WebDriver chrome;
	@BeforeMethod
	public void openChrome() {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse\\TestWeb02\\Drive\\chromedriver.exe");
		chrome = new ChromeDriver();
	}
	
	@Test
	public void alertTest() throws InterruptedException {
		chrome.get("file:///E:/qq/572097160/filerecv/mobilefile/index.html");
		chrome.findElement(By.className("alert")).click();
		Alert alert = chrome.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(3000);
	}
	
	@Test
	public void confirmTest() throws InterruptedException {
		chrome.get("file:///E:/qq/572097160/filerecv/mobilefile/index.html");
		Thread.sleep(3000);
		chrome.findElement(By.className("confirm")).click();
		Alert alert = chrome.switchTo().alert();
		Thread.sleep(3000);
		alert.dismiss();
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(3000);
	}
	
	
	@Test
	public void iformTest() throws InterruptedException {
		chrome.get("file:///E:/qq/572097160/filerecv/mobilefile/index.html");
		//Í¨¹ýWebElement
		WebElement iframe = chrome.findElement(By.tagName("iframe"));
		chrome.switchTo().frame(iframe);
		chrome.findElement(By.linkText("baidu")).click();
		Thread.sleep(3000);
		
		chrome.switchTo().defaultContent();
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		chrome.quit();
	}
}
