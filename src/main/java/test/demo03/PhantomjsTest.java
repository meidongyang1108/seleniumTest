package test.demo03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class PhantomjsTest {

	@Test
	public void pjsTest() throws InterruptedException {
		System.setProperty("phantomjs.binary.path", "F:\\eclipse\\TestWeb02\\Drive\\phantomjs.exe");;
		WebDriver driver = new PhantomJSDriver();
		
		driver.get("https://www.baidu.com/");

		driver.findElement(By.id("kw")).sendKeys("phantomJs");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
