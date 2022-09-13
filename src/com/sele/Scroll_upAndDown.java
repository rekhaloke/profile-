package com.sele;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_upAndDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SElenium_Practice\\driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,2000)", "");
		WebElement down = driver.findElement(By.id("icp-touch-link-language"));
		js.executeScript("arguments[0].scrollIntoView(true);", down);
	}

}
