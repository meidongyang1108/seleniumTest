package test.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	
	@org.testng.annotations.Test
	public void openChrome() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse\\TestWeb02\\Drive\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://www.baidu.com/");
		Thread.sleep(5000);
	}
	
	
	@org.testng.annotations.Test
	public void openChrome2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse\\TestWeb02\\Drive\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://www.baidu.com/");
		Thread.sleep(5000);
	}
	
	@org.testng.annotations.Test
	public void testCase1() {
		System.out.println("@Testע�⣬case1");
	}
	@org.testng.annotations.Test
	public void testCase2() {
		System.out.println("@Testע�⣬case2");
	}
	
	@org.testng.annotations.Test
	public void openChrome3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse\\TestWeb02\\Drive\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://www.baidu.com/");
		Thread.sleep(5000);
	}
}
