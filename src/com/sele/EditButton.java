package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditButton {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SElenium_Practice\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/");
		WebElement Edit = driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[1]"));
		Edit.click();
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("rekaaswinigmil.com");
		
		WebElement append=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		append.sendKeys("goodwork");
		
		WebElement defaul=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		String s=defaul.getAttribute("value");
		System.out.println(s);
		
		WebElement cle=driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		cle.clear();
		
		WebElement dis=driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		boolean disab= dis.isEnabled();
		System.out.println(disab);
		
	}

}
