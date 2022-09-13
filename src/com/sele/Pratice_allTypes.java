package com.sele;


import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pratice_allTypes {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\ELCOT\\eclipse-workspace\\SElenium_Practice\\driver1\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("H");
		driver.navigate().to("kl");
		driver.navigate().forward(); //store history
		driver.navigate().back();
		driver.navigate().refresh();
		driver.close();  //close current browser
		driver.quit(); //close all browser
		Dimension d= new Dimension(500,500);  //minimize set size //class
		//driver.manage().window().setSize(d);
		Point p=new Point(800,700);           //move to respective place // class
		driver.manage().window().setPosition(p);
		driver.switchTo().alert().accept();  
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().sendKeys("lkl");
		driver.switchTo().frame("lk");
		WebElement driv=driver.findElement(By.className("Hhhhhhhhhhhhhhhhh'hhhhhhhhhhhhhhhhhh"));
		driver.switchTo().frame(driv);
		Actions mouse= new Actions(driver);
		mouse.doubleClick().build().perform();
		mouse.contextClick().build().perform();
		mouse.moveToElement(driv).build().perform();
		mouse.clickAndHold().build().perform();
		Robot r = new Robot(); // throw exception // class
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String wh = driver.getWindowHandle();
	    wh.codePoints();
	    Set<String> Windowhandles = driver.getWindowHandles();
	    for (String w : Windowhandles) {
	    	driver.switchTo().window(w).getTitle();
		}
	    Select s= new Select(driv);
	    
	    s.isMultiple();                                         //DropDown
	    s.selectByIndex(3);
	    s.selectByValue("HHHHHHH");
	    s.selectByVisibleText("H");
	    
	   List<WebElement> list = s.getOptions();
	   int i=list.size();
		for (WebElement all : list) {
			all.isDisplayed();
			all.isEnabled();
			all.isSelected();
			String text =all.getText();
			System.out.println(text);
			
			if (i==4) {
				System.out.println("H");
				
			}else
				System.out.println("Hnot done");
			
		}
		
driver.getTitle();
driver.getCurrentUrl();
driv.getAttribute("Hhh");


//implicity


    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
    
// Expicit
    
    WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
    wait.until(ExpectedConditions.invisibilityOf(driv));
    
// Fluency
    
    Wait<WebDriver> w= new FluentWait<WebDriver>(driver)
    		.withTimeout(Duration.ofSeconds(50))
    				.pollingEvery(Duration.ofSeconds(10))
    				.ignoring(NoSuchElementException.class);
    
    
    
//Screen shot (two type)
    
    TakesScreenshot ts=  (TakesScreenshot)driver;     //interface
    File source =ts.getScreenshotAs(OutputType.FILE);
    File destination = new File("lotion.reka.png");
    FileUtils.copyFile(source, destination);
    
    
    //-----------------//-----------------------//
    
    Robot ro = new Robot();
   Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
   Rectangle re= new Rectangle(screenSize);
   BufferedImage createScreenCapture = ro.createScreenCapture(re);
   File desti = new File("Hhhhhh");
   ImageIO.write(createScreenCapture, "png", desti);
   
// Scroll Up and Down
   
   
   JavascriptExecutor js = (JavascriptExecutor) driver;
   js.executeScript("window.scroll(0,2000))", " ");
   js.executeScript("argument[0].scrollIntoView(true)", "xpath wih refername");
   
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
		
	}

}
