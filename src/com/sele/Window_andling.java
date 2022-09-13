package com.sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_andling {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SElenium_Practice\\driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in/");
		Actions a=new Actions(driver);
		Robot r=new Robot();

		
		WebElement mob = driver.findElement(By.xpath("(//a[text()='Mobiles'])[1]"));
		a.contextClick(mob).build().perform();
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Set<String> windowHandles2 = driver.getWindowHandles();
		for (String string2 : windowHandles2) {
			driver.switchTo().window(string2);
		}
		WebElement mobil = driver.findElement(By.xpath("(//img[@onload='window.uet && uet.call && uet(\"af\");'])[2]"));
		mobil.click();
		
		WebElement tab2 = driver.findElement(By.xpath("(//span[@class='nav-a-content'])[4]"));
		a.contextClick(tab2).build().perform();
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			driver.switchTo().window(string);
		
			
		}

		
		
		
		
		
		
		/*WebElement bestdseller = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
		a.contextClick(bestdseller).build().perform();
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		/*WebElement cs = driver.findElement(By.xpath("(//a[text()='Customer Service'])[1]"));
		a.contextClick(cs).build().perform();
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);*/
		
		/*String trie = driver.getWindowHandle();
		WebElement today = driver.findElement(By.xpath("(//a[@data-csa-c-type='link'])[5]"));
		a.contextClick(today).build().perform();
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Set<String> windowHandles = driver.getWindowHandles();
        for (String string : windowHandles) {
			driver.switchTo().window(string);
		}
	    System.out.println(windowHandles);*/
	    
	    
		/*WebElement fas = driver.findElement(By.xpath("(//a[@data-csa-c-type='link'])[6]"));
		a.contextClick(fas).build().perform();
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);*/
	
		/*Set<String> windowHandles = driver.getWindowHandles();
		for (String tab : windowHandles) {
			String title = driver.switchTo().window(tab).getTitle();
			System.out.println(title);
			break;
		}
			
			for (String now : windowHandles) {
				if (driver.switchTo().window(now).getTitle().equals("Amazon.in Bestsellers: The most popular items on Amazon")) {
					break;
				}
				
			}*/
		}

}
