package com.sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RobotClass {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SElenium_Practice\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions cal = new Actions(driver);
		driver.get("http://www.amazon.in./");
		WebElement sel = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		cal.contextClick(sel).build().perform();
		Robot call=new Robot();
		call.keyPress(KeyEvent.VK_DOWN);
		call.keyRelease(KeyEvent.VK_DOWN);
		call.keyPress(KeyEvent.VK_ENTER);
		call.keyRelease(KeyEvent.VK_ENTER);


		
		
	
	}
}
