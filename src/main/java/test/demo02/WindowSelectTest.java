package test.demo02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowSelectTest {
	WebDriver chrome;
	@BeforeMethod
	public void openChrome() {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse\\TestWeb02\\Drive\\chromedriver.exe");
		chrome = new ChromeDriver();
	}
	
	@Test
	public void windowSelectTest() throws InterruptedException {
		chrome.get("file:///E:/qq/572097160/filerecv/mobilefile/index.html");
		chrome.findElement(By.xpath("//*[@id=\"open\"]/a")).click();
		Thread.sleep(5000);
		
		String handlel = chrome.getWindowHandle();
		
		for (String handles:chrome.getWindowHandles()) {
			if (handles.equals(handlel)) {
				
			}else {
				chrome.switchTo().window(handles);
			}
		}
		chrome.findElement(By.linkText("baidu")).click();
		Thread.sleep(5000);
		
	}
	@AfterMethod
	public void closeBrowser() {
		chrome.quit();
	}
}
