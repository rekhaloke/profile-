package com.sele;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tring_element {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\ELCOT\\eclipse-workspace\\SElenium_Practice\\driver1\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement sign = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		sign.click();
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("9003125215");
		WebElement cli = driver.findElement(By.xpath("//input[@id='continue']"));
		cli.click();
		WebElement pas = driver.findElement(By.xpath("//a[@id='auth-fpp-link-bottom']"));
		pas.click();
		//Thread.sleep(2000);
TakesScreenshot take=(TakesScreenshot)driver;
File SOURCE = take.getScreenshotAs(OutputType.FILE);
File desti=new File("C:\\Users\\ELCOT\\eclipse-workspace\\SElenium_Practice\\screensot\\facebook.png");
FileUtils.copyFile(SOURCE, desti);


		WebElement cli1 = driver.findElement(By.xpath("//input[@id='continue']"));
		cli1.click();
		Thread.sleep(5000);

		WebElement p = driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]"));
		p.click();
		
	}

}
