package com.sele;





import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultiSele {
	

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\ELCOT\\eclipse-workspace\\SElenium_Practice\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://form.jotform.com/211368042781454?");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		WebElement name = driver.findElement(By.id("first_1"));
	    name.sendKeys("Rekhaaswini"); 
	    WebElement ini = driver.findElement(By.id("last_1"));
	    ini.sendKeys("E");
	    WebElement cli = driver.findElement(By.xpath("//*[@id=\"input_65_1\"]"));
	    cli.click();		
	    WebElement email = driver.findElement(By.id("input_4"));
		email.sendKeys("rekaaswini12@gmail.com");
		WebElement lang = driver.findElement(By.id("input_77"));
		lang.sendKeys("Tamil");
		WebElement language = driver.findElement(By.id("input_68"));
		language.sendKeys("English");
		WebElement drop = driver.findElement(By.id("input_78"));
		Select a=new Select(drop);
		a.selectByVisibleText("Tamil Nadu");
		WebElement city = driver.findElement(By.id("input_79"));
		city.sendKeys("Chennai");
		WebElement pin = driver.findElement(By.id("input_72"));
		pin.sendKeys("600066");
		WebElement dob = driver.findElement(By.xpath("//*[@id=\"input_66_pick\"]"));
		dob.click();
		WebElement birt = driver.findElement(By.xpath("//*[@id=\"calendar_66\"]"));
		birt.click();
		WebElement pone = driver.findElement(By.id("input_15"));
		pone.sendKeys("9003125214");
		WebElement multi = driver.findElement(By.id("input_52"));
		Select b=new Select(multi);
		b.selectByVisibleText("M.Phil");
		WebElement special = driver.findElement(By.id("input_51"));
		Select c=new Select(special);
		c.selectByVisibleText("3-5 years");
		WebElement gradu = driver.findElement(By.id("input_73"));
		Select d=new Select(gradu);
		d.selectByVisibleText("PHD");
		WebElement college = driver.findElement(By.id("input_16"));
		college.sendKeys("Meenasi college");
		WebElement colick = driver.findElement(By.id("input_18_0"));
		colick.click();
		
		WebElement colick2 = driver.findElement(By.id("input_19_4"));
		colick2.click();
		
		WebElement colick3 = driver.findElement(By.id("input_74_0"));
		colick3.click();
		
		WebElement scool = driver.findElement(By.id("input_76"));
		scool.sendKeys("School");
		
		WebElement clic = driver.findElement(By.id("input_22_2"));
		clic.click();
		
		WebElement z = driver.findElement(By.id("input_20_1"));
		z.click();
		
		WebElement y = driver.findElement(By.id("input_20_4"));
		y.click();
		
		WebElement x = driver.findElement(By.id("input_53_0"));
		x.click();
		
	
		WebElement w = driver.findElement(By.id("input_28_0_0"));
	    Select jeb=new Select(w)	;
	    jeb.selectByValue("1");
	    
	    WebElement k = driver.findElement(By.id("input_28_1_0"));
	    Select lo=new Select(k);
	    lo.selectByValue("3");
	    
	    WebElement ko = driver.findElement(By.id("input_36_5"));
	    ko.click();
	    
	    WebElement kok = driver.findElement(By.id("month_48"));
	    kok.sendKeys("09");
	    
	    WebElement kokko = driver.findElement(By.id("day_48"));
	    kokko.sendKeys("12");
	    
	    WebElement yea = driver.findElement(By.id("year_48"));
	    yea.sendKeys("1991");  
	    
	    WebElement mobile = driver.findElement(By.xpath("//input[@id='input_41_3']"));
	    mobile.click();
	    
	    WebElement speed = driver.findElement(By.id("input_42_3"));
	    speed.click();
	    
	    WebElement speed2 = driver.findElement(By.id("input_62_3"));
	    speed2.click();
	   
	 
	    
	    
	    WebElement finali = driver.findElement(By.id("id_50"));
	    finali.click();
	    
	    
	    StringSelection sele=new StringSelection
("C:\\Users\\ELCOT\\Downloads\\20220121_131806.jpg.xls");
	   
	    Toolkit.getDefaultToolkit().getSystemClipboard().getContents(sele);
	    Robot ab=new Robot();
	    
	    ab.keyPress(KeyEvent.VK_CONTROL);
	    ab.keyPress(KeyEvent.VK_V);
	    ab.keyRelease(KeyEvent.VK_V);
	    ab.keyRelease(KeyEvent.VK_CONTROL);
	    ab.keyPress(KeyEvent.VK_ENTER);
	    ab.keyRelease(KeyEvent.VK_ENTER);
	    
	    
	    
	    WebDriverWait wai=new WebDriverWait(driver,Duration.ofSeconds(30));
	    
	    wai.until(ExpectedConditions.visibilityOf(finali));
	    
	    
	    
	    
	    
	    
	    
	   
	    
	   WebElement notfinal = driver.findElement(By.xpath("//*[@id=\"input_46_0\"]"));
	    notfinal.click();
	    
	    WebElement area = driver.findElement(By.xpath("//*[@id=\"input_43\"]"));
	    area.sendKeys("kavangarai");
	    
	    WebElement auto = driver.findElement(By.xpath("//*[@id=\"input_24\"]"));
	    auto.sendKeys("youtube");
	    
	     Thread.sleep(2000);

	    
	   WebElement fullfill = driver.findElement(By.xpath("/html/body/form/div/ul/li[36]/div"));	    		
	   
	    fullfill.click();
	    
	    //"C:\Users\ELCOT\OneDrive\Documents\donload.xls.pdf"
	    StringSelection filesl=new StringSelection
	    		("C:\\Users\\ELCOT\\Downloads\\49703.pdf.xls");
	   
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filesl, null);
	    
	    Robot r=new Robot();
	    
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_V);
	    r.keyRelease(KeyEvent.VK_V);
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	   
		
		
		
		
		
		 
		
		
		
		
	}

}
