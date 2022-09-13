package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\ELCOT\\eclipse-workspace\\SElenium_Practice\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/");
		
		WebElement radio =driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[6]"));
		radio.click();
		
		WebElement yes =driver.findElement(By.id("yes"));
		yes.click();
		
		WebElement defaul=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input[2]"));
		boolean selected = defaul.isSelected();
		System.out.println(selected);
		
		WebElement cli1=driver.findElement(By.xpath("(//input[@type='radio'])[7]"));
		cli1.click();
	}

}
