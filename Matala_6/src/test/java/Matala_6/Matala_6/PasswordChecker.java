package Matala_6.Matala_6;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PasswordChecker {
	
	static WebDriver  browser;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Tomer\\OneDrive\\שולחן העבודה\\geckodriver.exe");
		browser = new FirefoxDriver();
		browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		String url="https://testpages.eviltester.com/styled/apps/7charval/simple7charvalidation.html";
		browser.get(url);
    
	}
	
	@Test
	public void TestCase_1() {
		WebElement element = browser.findElement(By.name("characters"));
		element.sendKeys("Tomer12");
		element.findElement(By.name("validate")).click();
		String answer = element.findElement(By.name("validation_message")).toString();
		String expected = "Valid Value";
		assertEquals(answer, expected);
		
	}
	
	@Test
	public void TestCase_2() {
		WebElement element = browser.findElement(By.name("characters"));
		element.sendKeys("Tomer5");
		element.findElement(By.name("validate")).click();
		String answer = element.findElement(By.name("validation_message")).toString();
		String expected = "Invalid Value";
		assertEquals(answer, expected);
		
	}
	
	@Test
	public void TestCase_3() {
		WebElement element = browser.findElement(By.name("characters"));
		element.sendKeys("Tomer123");
		element.findElement(By.name("validate")).click();
		String answer = element.findElement(By.name("validation_message")).toString();
		String expected = "Invalid Value";
		assertEquals(answer, expected);
		
	}

}
