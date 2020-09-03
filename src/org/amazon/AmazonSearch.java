package org.amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonSearch {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\Rhombus Labs\\eclipse-workspace\\selenium\\Bharani\\btharan\\Amazon\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		WebElement Action = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/div/span"));
		Actions acc = new Actions(driver);
		acc.moveToElement(Action).build().perform();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sbarani46@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Barani@20");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("handkerchief for men cotton");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		/*
		 * WebElement Actions =
		 * driver.findElement(By.xpath("//a[contains(text(),'Mobiles & Electronics')]"))
		 * ; Actions acc = new Actions(driver);
		 * acc.moveToElement(Actions).build().perform(); Thread.sleep(2000); //
		 * WebElement SmartPhone =
		 * driver.findElement(By.xpath("//*[@id=\"column_1\"]/ul/li[3]/a")); //
		 * SmartPhone.click();
		 */

	}
}