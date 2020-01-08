package test.demo03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {


	WebDriver chrome;
	@BeforeMethod
	public void openChrome() {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse\\TestWeb02\\Drive\\chromedriver.exe");
		chrome = new ChromeDriver();
	}
	
	
	@Test
	public void loginTest() throws InterruptedException {
		chrome.get("https://mail.163.com/");
		WebDriverWait wait = new WebDriverWait(chrome, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"switchAccountLogin\"]")));
		chrome.findElement(By .xpath("//*[@id=\"switchAccountLogin\"]")).click();
		try {
			chrome.findElement(By .xpath("//*[@id=\"normalLoginFormMask\"]/div/p/a")).click();			
		} catch (Exception e) {
			
		}	
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"idInput\"]")));
		
		chrome.findElement(By.xpath("//*[@id=\"idInput\"]")).sendKeys("18856220020");

		//for(String Handler:chrome.getWindowHandles()) {
		//	if(!Handler.equals(chrome.getWindowHandle())) {
		//		chrome.switchTo().window(Handler);
		//	}
		//}
		chrome.findElement(By.xpath("//*[@id=\"pwdInput\"]")).sendKeys("yang19961108");
		chrome.findElement(By.xpath("//*[@id=\"loginBtn\"]")).click();
		//Thread.sleep(5000);
		String check = chrome.findElement(By.xpath("//*[@id=\"_mail_component_124_124\"]/a")).getText();
		Assert.assertEquals(check, "退出");
		
		//Assert.assertEquals("系统未收到短信，请检查手机号是否正确或重新发送短信", m);;
		chrome.quit();
	}
}
