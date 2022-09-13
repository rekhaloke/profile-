package com.sele;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SElenium_Practice\\driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in/");
		WebElement mobil = driver.findElement(By.xpath("(//img[@onload='window.uet && uet.call && uet(\"af\");'])[2]"));
		mobil.click();
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
		w.until(ExpectedConditions.visibilityOf(mobil));
		
		
		
		
		
		
		
		
		
		
		
		Wait<WebDriver> wA=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(40))
				.pollingEvery(Duration.ofSeconds(10))
				.ignoring(NoSuchElementException.class);
		wA.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver t) {
				// TODO Auto-generated method stub
				return t.findElement(By.xpath("(//img[@onload='window.uet && uet.call && uet(\\\"af\\\")"));
			}}
			);
			
		}
		}
			
			
		

			
			
	


