package com.sele;

import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleOpen {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\ELCOT\\eclipse-workspace\\SElenium_Practice\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https:www.google.com");
		WebElement searc = driver.findElement(By.xpath("//*[@id=\'input\']"));
		searc.sendKeys("list of district in tamilnadu"  +KeyEvent.VK_ENTER);
		
	}

}
