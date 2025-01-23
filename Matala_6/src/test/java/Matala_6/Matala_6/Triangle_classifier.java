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

public class Triangle_classifier {
	
	static WebDriver  browser;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Tomer\\OneDrive\\שולחן העבודה\\geckodriver.exe");
		browser = new FirefoxDriver();
		browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		String url="https://testpages.eviltester.com/styled/apps/calculator.html";
		browser.get(url);
    
	}
	
	@Test
	public void testCase_1() {
		WebElement element = browser.findElement(By.id("side1"));
		element.sendKeys("3");
		element = browser.findElement(By.id("side2"));
		element.sendKeys("4");
		element = browser.findElement(By.id("side3"));
		element.sendKeys("5");
		browser.findElement(By.id("identify-triangle-action")).click();
		String answer = element.findElement(By.id("triangle-type")).toString();
		String expected = "Scalene";
		assertEquals(expected,answer);
	}
	
	@Test
	public void testCase_2() {
		WebElement element = browser.findElement(By.id("side1"));
		element.sendKeys("5");
		element = browser.findElement(By.id("side2"));
		element.sendKeys("5");
		element = browser.findElement(By.id("side3"));
		element.sendKeys("5");
		browser.findElement(By.id("identify-triangle-action")).click();
		String answer = element.findElement(By.id("triangle-type")).toString();
		String expected = "Equilateral";
		assertEquals(expected,answer);
	}
	
	@Test
	public void testCase_3() {
		WebElement element = browser.findElement(By.id("side1"));
		element.sendKeys("4");
		element = browser.findElement(By.id("side2"));
		element.sendKeys("4");
		element = browser.findElement(By.id("side3"));
		element.sendKeys("6");
		browser.findElement(By.id("identify-triangle-action")).click();
		String answer = element.findElement(By.id("triangle-type")).toString();
		String expected = "Isosceles";
		assertEquals(expected,answer);
	}
	
	@Test
	public void testCase_4() {
		WebElement element = browser.findElement(By.id("side1"));
		element.sendKeys("2");
		element = browser.findElement(By.id("side2"));
		element.sendKeys("4");
		element = browser.findElement(By.id("side3"));
		element.sendKeys("6");
		browser.findElement(By.id("identify-triangle-action")).click();
		String answer = element.findElement(By.id("triangle-type")).toString();
		String expected = "Not a triangle";
		assertEquals(expected,answer);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
