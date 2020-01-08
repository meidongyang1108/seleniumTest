package test.demo02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectTest {
	WebDriver chrome;
	@BeforeMethod
	public void openChrome() {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse\\TestWeb02\\Drive\\chromedriver.exe");
		chrome = new ChromeDriver();
	}
	
	@Test
	public void selectTest() throws InterruptedException {
		chrome.get("file:///E:/qq/572097160/filerecv/mobilefile/index.html");
		//Í¨¹ýWebElement
		WebElement iframe = chrome.findElement(By.id("moreSelect"));
		
		Select select = new Select(iframe);
		select.selectByIndex(2);

		Thread.sleep(5000);
		select.selectByValue("huawei");
		Thread.sleep(5000);
		select.selectByVisibleText("iphone");
		Thread.sleep(5000);
		
	}
	@AfterMethod
	public void closeBrowser() {
		chrome.quit();
	}
}
