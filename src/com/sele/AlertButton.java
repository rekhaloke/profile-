package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertButton {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\ELCOT\\eclipse-workspace\\SElenium_Practice\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		WebElement SimpleAlert = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		SimpleAlert.click();
		driver.switchTo().alert().accept();
		
		WebElement com = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		com.click();
		WebElement ConformAlert = driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));
	    ConformAlert.click();
	    driver.switchTo().alert().dismiss();
	    
	    WebElement PromptAlert = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
	    PromptAlert.click();
	    WebElement Prom = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
	    Prom.click();
	    driver.switchTo().alert().sendKeys("Hi I am Rekaaswini");
		driver.switchTo().alert().accept();

		
		
		
		
		
		
		

		/*driver.get("http://www.leafground.com/");
	WebElement alret = driver.findElement(By.xpath("//img[@alt='Alert']"));
	alret.click();
	
	WebElement alert = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
	alert.click();
	
	driver.switchTo().alert().accept();
	
	WebElement conform = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
	conform.click();
	
	driver.switchTo().alert().dismiss();
	
	WebElement prompt = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
	prompt.click();
	
	Thread.sleep(2000);
	
	driver.switchTo().alert().sendKeys("i ow Are You");
	
	driver.switchTo().alert().accept();*/
				
		
	}

}
