package org.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HalfEbayPage {

	WebDriver driver;

	@BeforeMethod

	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rhombus Labs\\eclipse-workspace\\selenium\\Bharani\\btharan\\Amazon\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	}

	/*
	 * @AfterMethod public void tearDown() { driver.quit();
	 * 
	 * }
	 */

	@Test
	public void btnbutton() {
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	}
	@Test
	public void loginbtn() {
		driver.findElement(By.xpath("//a[@class='_3Ep39l']")).click();
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("sbarani46@gmail.com");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
