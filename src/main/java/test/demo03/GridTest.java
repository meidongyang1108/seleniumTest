package test.demo03;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.regexp.recompile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GridTest {

	@DataProvider(name="data4")
	public Object[][] test1(){
		return new Object[][] {
			{"firefox"},
			{"chrome"}};
	}
	
	@Test
	public void chromeTest() throws InterruptedException, MalformedURLException {
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		WebDriver chrome = new RemoteWebDriver(new URL("http://192.168.0.103:4444/wd/hub"),dc);
		chrome.get("https://www.baidu.com/");
		Thread.sleep(50000);
		chrome.quit();
		
	}
	@Test(dataProvider = "data4")
	public void gridTest(String browser) throws InterruptedException, MalformedURLException {
		DesiredCapabilities dc = null;
		if(browser.equals("firefox")) {
			dc = DesiredCapabilities.firefox();
		}else if(browser.equals("chrome")) {
			dc = DesiredCapabilities.chrome();
		}
		WebDriver chrome = new RemoteWebDriver(new URL("http://192.168.0.103:4444/wd/hub"),dc);
		chrome.get("https://www.baidu.com/");
		Thread.sleep(50000);
		chrome.quit();
		
	}
	
	
}
