package org.amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\Rhombus Labs\\eclipse-workspace\\selenium\\Bharani\\btharan\\Amazon\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		WebElement btnbutton = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		btnbutton.click();

		WebElement Action = driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"));
		Actions acc = new Actions(driver);
		acc.moveToElement(Action).build().perform();
		Thread.sleep(2000);
		WebElement options = driver.findElement(By.xpath("//a[contains(text(),'iPhone SE')]"));
		options.click();
		Thread.sleep(2000);

		List<WebElement> count = driver.findElements(By.className("_3wU53n"));
		System.out.println(count.size());

		for (WebElement X : count) {
			String text = X.getText();
			System.out.println(text);

		}

	}
}