package com.sele;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpat {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\ELCOT\\eclipse-workspace\\SElenium_Practice\\driver1\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.meesho.com/jewellery-sets-women/pl/lkioo");
	List<WebElement> today = driver.findElements(By.xpath("//p[@font-size='16px']//preceding-sibling::h5"));
	for (int i = 0; i < today.size(); i++) {
		String text = today.get(i).getText().replace("?", "1");
		System.out.println(text);
		//int parseInt = Integer.parseInt(text);
		//System.out.println(parseInt);
		
	}
	
	}
}
