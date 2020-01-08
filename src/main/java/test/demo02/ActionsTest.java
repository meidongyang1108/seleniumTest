package test.demo02;

import static org.testng.Assert.assertEquals;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.eclipse.jetty.util.thread.Scheduler.Task;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsTest {

	WebDriver chrome;
	@BeforeMethod
	public void openChrome() {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse\\TestWeb02\\Drive\\chromedriver.exe");
		chrome = new ChromeDriver();
	}
	
	@Test
	public void operationTest() throws InterruptedException {
		chrome.get("https://www.baidu.com/");
		WebElement keyField = chrome.findElement(By.id("kw"));
		keyField.sendKeys("235");
		WebElement search = chrome.findElement(By.id("su"));
		search.click();
		Thread.sleep(5000);
	}
	
	@Test
	public void getTagNameTest() throws InterruptedException {
		chrome.get("https://www.baidu.com/");
		String keyField = chrome.findElement(By.id("kw")).getTagName();
		Assert.assertEquals(keyField, "input");
		Thread.sleep(5000);
	}
	
	@Test
	public void getAttributeTest() throws InterruptedException {
		chrome.get("https://www.baidu.com/");
		String keyField = chrome.findElement(By.id("kw")).getAttribute("id");
		//Assert.assertEquals(keyField, "input");
		System.out.println(keyField);
		Thread.sleep(5000);
	}
	
	/**
	 * 是否显示
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void isDisplayTest() throws InterruptedException {
		chrome.get("https://www.baidu.com/");
		boolean keyField = chrome.findElement(By.id("kw")).isDisplayed();
		Assert.assertTrue(keyField);
		Thread.sleep(5000);
	}
	
	/**
	 * 是否选中
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void isSelectedTest() throws InterruptedException {
		chrome.get("http://www.hd-163.com/login.html");
		boolean keyField = chrome.findElement(By.xpath("//*[@id=\"content\"]/ul/div[3]/label/input")).isSelected();
		Thread.sleep(5000);
		Assert.assertFalse(keyField);
	}
	
	/**
	 * 是否激活
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void isEnabledTest() throws InterruptedException {
		chrome.get("http://www.hd-163.com/login.html");
		boolean keyField = chrome.findElement(By.xpath("//*[@id=\"content\"]/ul/div[3]/label/input")).isEnabled();
		Thread.sleep(5000);
		Assert.assertFalse(keyField);
	}
	
	/**
	 * 截图
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void shotTest() {
		chrome.get("http://www.hd-163.com/login.html");
		
		File file = ((TakesScreenshot)chrome).getScreenshotAs(OutputType.FILE);
		try {			
			FileUtils.copyFile(file, new File("E:\\test1.png"));
		} catch (Exception e) {
		}
	}
	
	@AfterMethod
	public void closeBrowser() {
		chrome.quit();
	}
}
