package com.webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodsOfWebElement {
	@Test
	public void launchCrome() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/");
		driver.findElement(By.xpath("//a[@href=\"/assignments\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href=\"/notes\"]")).click();
		}

}