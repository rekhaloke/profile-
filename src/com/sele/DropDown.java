package com.sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\ELCOT\\eclipse-workspace\\SElenium_Practice\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/");
		
		WebElement drop= driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[5]"));
		drop.click();
		
		WebElement first=driver.findElement(By.id("dropdown1"));
		Select a=new Select(first);
		a.selectByIndex(3);
		
		
		WebElement second = driver.findElement(By.name("dropdown2"));
		Select b=new Select(second);
		b.selectByVisibleText("Loadrunner");
		
		                                                     
		WebElement third=driver.findElement(By.id("dropdown3"));
		Select c=new Select(third);
		c.selectByValue("3");
		
		WebElement four=driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select d=new Select(four);
		List<WebElement> options = d.getOptions();
		int size = options.size();
		System.out.println(size);
		
		WebElement fift=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
		fift.sendKeys("Selenium");    
		
		
		
		WebElement call = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]"));		
		Select v=new Select(call);
	List<WebElement> vv = v.getOptions();
	System.out.println(vv);
	int vvv = vv.size();
	System.out.println(vvv);
	for (int i = 0; i <=vvv; i++) {
		if (vvv==2) {
			System.out.println(i);
			
		}
		
	}
	}
		
	}	
		
	


