package test.demo03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterTest {

	WebDriver chrome;
	@BeforeMethod
	public void openChrome() {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse\\TestWeb02\\Drive\\chromedriver.exe");
		chrome = new ChromeDriver();
	}
	
	
	@Test
	public void regTest() throws InterruptedException {
		chrome.get("https://mail.163.com/");
		chrome.findElement(By.xpath("//*[@id=\"commonOperation\"]/a[2]")).click();
		for(String Handler:chrome.getWindowHandles()) {
			if(!Handler.equals(chrome.getWindowHandle())) {
				chrome.switchTo().window(Handler);
			}
		}
		chrome.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("mei18554646");
		chrome.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mei18856220020");
		chrome.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("18856220020");
		chrome.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[4]/span")).click();
		chrome.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[5]/a[1]")).click();
		chrome.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[5]/a[1]")).click();
		Thread.sleep(5000);
		 String m = chrome.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[3]/div[2]")).getText();;
		 System.out.println(m);
		Thread.sleep(5000);

		//Assert.assertEquals("系统未收到短信，请检查手机号是否正确或重新发送短信", m);;
		chrome.quit();
	}
}
