package test.demo02;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.KeyEvent;

public class ActionsTest2 {
	
	WebDriver chrome;
	@BeforeMethod
	public void openChrome() {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse\\TestWeb02\\Drive\\chromedriver.exe");
		chrome = new ChromeDriver();
	}
	
	@Test
	public void contextClickTest() throws InterruptedException {
		chrome.get("https://www.baidu.com/");

		WebElement buttonBaidu = chrome.findElement(By.id("su"));
		Actions actions = new Actions(chrome);
		actions.contextClick(buttonBaidu).perform();
		Thread.sleep(5000);
	}
	
	@Test
	public void doubleClickTest() throws InterruptedException {
		chrome.get("https://www.baidu.com/");

		WebElement buttonBaidu = chrome.findElement(By.id("su"));
		Actions actions = new Actions(chrome);
		actions.doubleClick(buttonBaidu).perform();
		Thread.sleep(5000);
	}
	
	@Test
	public void moveTest() throws InterruptedException {
		chrome.get("file:///E:/qq/572097160/filerecv/mobilefile/index.html");

		WebElement buttonBaidu = chrome.findElement(By.xpath("//*[@id=\"action\"]/input"));
		Actions actions = new Actions(chrome);
		actions.moveToElement(buttonBaidu).perform();
		Thread.sleep(5000);
	}
	
	@Test
	public void moreSelectTest() throws InterruptedException, AWTException {
		chrome.get("https://www.baidu.com/");
		Robot ro = new Robot();
		ro.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
		ro.keyPress(java.awt.event.KeyEvent.VK_S);
		Thread.sleep(5000);
	}
	
	@Test
	public void savaHtml() throws InterruptedException {
		chrome.get("file:///E:/qq/572097160/filerecv/mobilefile/index.html");

		WebElement buttonBaidu = chrome.findElement(By.xpath("//*[@id=\"selectWithMultipleEqualsMultiple\"]/option[1]"));
		WebElement buttonBaidu2 = chrome.findElement(By.xpath("//*[@id=\"selectWithMultipleEqualsMultiple\"]/option[3]"));
		Actions actions = new Actions(chrome);
		actions.keyDown(Keys.SHIFT).click(buttonBaidu).click(buttonBaidu2).keyUp(Keys.SHIFT).perform();
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void closeBrowser() {
		chrome.quit();
	}
}
