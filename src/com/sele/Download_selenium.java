package com.sele;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download_selenium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SElenium_Practice\\driver1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/download.html");
		
		WebElement download = driver.findElement(By.xpath("//a[text()='Download Excel']"));
	
	   download.click();
	   
	   File f=new File("C:\\Users\\ELCOT\\Downloads");
	   
	   File[] listFiles = f.listFiles();
	   
	   for (File file : listFiles) {
		    if(file.getName().equals("download.xls"));
		    System.out.println("Download completed");
		    break;
		
	}
	
	
	
	
	
	}

}
