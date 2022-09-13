package com.sele;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnterValue {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\ELCOT\\eclipse-workspace\\Sel\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
		name.sendKeys("lokesairam");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("srisairam");
		//WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		//login.click();
		
		WebElement searc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		searc.click();
     
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(searc));
		
		
		
		
		
		WebElement name1 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		name1.sendKeys("reka");
		WebElement sur = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		sur.sendKeys("E");
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		email.sendKeys("9003125521");
		WebElement pass1 = driver.findElement(By.xpath("(// input[@type='password'])[2]"));
		pass1.sendKeys("rekaaswini");
		WebElement day = driver.findElement(By.xpath("// select[@id='day']"));
		day.sendKeys("12");
		WebElement mont = driver.findElement(By.xpath("// select[@id='month']"));
		mont.sendKeys("sep");
		WebElement year = driver.findElement(By.xpath("// select[@id='year']"));
		year.sendKeys("1991");
		WebElement female = driver.findElement(By.xpath("// label[@class='_58mt']"));
		female.click();
		WebElement click = driver.findElement(By.xpath("(// button[@type='submit'])[2]"));
		click.click();
				
		
		
		
	}

}
