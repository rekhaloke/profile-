package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Css_pratice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SElenium_Practice\\driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rte.tnschools.gov.in/reg-personal");
		WebElement stname = driver.findElement(By.cssSelector("[formcontrolname='student_name']"));
		stname.sendKeys("Raskilatra");
		WebElement mi = driver.findElement(By.cssSelector("[class^='ng-tns-c4-1 ui-']"));
		mi.click();
		
		WebElement findElement = driver.findElement(By.cssSelector("[aria-label='Female']"));
		findElement.click();
		
		WebElement la = driver.findElement(By.cssSelector("[placeholder='date']"));
		la.sendKeys("12-04-2017");
	    WebElement cl = driver.findElement(By.cssSelector("[formcontrolname='password']"));
	    cl.sendKeys("tyuoir456$");
	    WebElement cli = driver.findElement(By.cssSelector("[formcontrolname='confirmpassword']"));
	    cli.sendKeys("tyuoir456$");
	    WebElement sele = driver.findElement(By.xpath("//label[text()='Select a religion']"));
	    sele.click();
	    
	    
	   WebElement selele = driver.findElement(By.cssSelector("[aria-label='Hindu']"));
	   selele.click();
	   
	   WebElement comm = driver.findElement(By.cssSelector("[class$='ng-tns-c4-3 ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder ng-star-inserted']"));
	   comm.click();
	   
	   WebElement bc = driver.findElement(By.cssSelector("[aria-label='BC-Others']"));
	   bc.click();
	   
	   WebElement mob = driver.findElement(By.cssSelector("[formcontrolname='mobile']"));
	   mob.sendKeys("90004675384");
	   
	   WebElement clcl = driver.findElement(By.cssSelector("[class='ng-tns-c4-4 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted']"));
	   clcl.click();
	   
	   
	   WebElement email = driver.findElement(By.cssSelector("[formcontrolname='email']"));
	  email.sendKeys("rekaaswini12@gmail.com"); 
	}

}
