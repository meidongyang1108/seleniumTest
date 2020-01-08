package test.demo02;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.ExpectedExceptions;
import org.testng.annotations.Test;

public class WaiTest {
	WebDriver chrome;
	@BeforeMethod
	public void openChrome() {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse\\TestWeb02\\Drive\\chromedriver.exe");
		chrome = new ChromeDriver();
		//全局等待
		//chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void wiaitTest() throws InterruptedException {
		chrome.get("file:///E:/qq/572097160/filerecv/mobilefile/index.html");
		
		chrome.findElement(By.xpath("//*[@id=\"wait\"]/input")).click();
		chrome.findElement(By.xpath("//*[@id=\"wait\"]/input")).click();
		//Thread.sleep(5000);
		
		//显示等待
		WebDriverWait wdw = new WebDriverWait(chrome, 10);
		wdw.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"display\"]/div")));
		String handlel = chrome.findElement(By.xpath("//*[@id=\"display\"]/div")).getText();
		
		Assert.assertEquals(handlel, "wait for display");
	}
	@AfterMethod
	public void closeBrowser() {
		chrome.quit();
	}
}
