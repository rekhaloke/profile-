package com.sele;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenSot {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\ELCOT\\eclipse-workspace\\SElenium_Practice\\driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.google.com");
		/*TakesScreenshot take=(TakesScreenshot)driver;
		File SOURCE = take.getScreenshotAs(OutputType.FILE);
		File desti=new File("C:\\Users\\ELCOT\\eclipse-workspace\\SElenium_Practice\\screensot\\facebook.png");
		FileUtils.copyFile(SOURCE, desti);*/
		
		//Using Robot Class 
		Robot r= new Robot();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rec=new Rectangle(screenSize);
		BufferedImage createScreenCapture = r.createScreenCapture(rec);
		File destination=new File("C:\\Users\\ELCOT\\eclipse-workspace\\SElenium_Practice\\screensot\\facebook.png");

		ImageIO.write(createScreenCapture, "png", destination);

		WebElement sign = driver.findElement(By.xpath("//a[@class='gb_1 gb_2 gb_8d gb_8c']"));
		sign.click();
		 WebElement create = driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[3]"));
	     create.click();
	driver.close();
	}
	
	
	
}
