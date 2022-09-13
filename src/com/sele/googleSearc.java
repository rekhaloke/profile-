package com.sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearc {
	public static void main(String[] args) throws Throwable {
		//// div[@class='UUbT9']
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SElenium_Practice\\driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.google.com");
		WebElement googleSearc = driver.findElement(By.name("q"));
		googleSearc.sendKeys("heros names in tamil");
		// driver.switchTo().activeElement().sendKeys("types of testing");

		List<WebElement> list = driver.findElements(By.xpath("//div[@class='MG7lrf']//preceding-sibling::div[1]"));

		for (WebElement webElement : list) {
			String text = webElement.getText();
			System.out.println(text);
			if (!text.contains("kgf")) {
				webElement.click();
				System.out.println("done");

			} else {
				System.out.println("not done");

			}
			break;

		}

	}

}
