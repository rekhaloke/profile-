package com.sele;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import graphql.execution.instrumentation.ChainedInstrumentation;

public class Frame_work {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SElenium_Practice\\driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		Actions call=new Actions(driver);

		
		//SINGLE FRAME
		
		/*WebElement SingleFrame = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(SingleFrame);
		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("This is Single Frame_Work");
		driver.switchTo().defaultContent();

		// MULTIPLE FRAME
		
		WebElement Multi = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		Multi.click();
		WebElement MultiFrame = driver
				.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
		driver.switchTo().frame(MultiFrame);
		WebElement MultiSmall = driver
				.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		driver.switchTo().frame(MultiSmall);
		WebElement test = driver.findElement(By.xpath("//input[@type='text']"));
		test.sendKeys("This is Multiple Frame_Work");
		driver.switchTo().defaultContent();
		
		
		WebElement inter = driver.findElement(By.xpath("//a[text()='Interactions ']"));
		inter.click();
		WebElement drop = driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[4]"));
		drop.click();
		WebElement staticv = driver.findElement(By.xpath("//a[@href='Static.html']"));
		staticv.click();*/
		
		driver.navigate().to("http://www.leafground.com/pages/drop.html");
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dropi = driver.findElement(By.xpath("//div[@id='droppable']"));
		call.dragAndDrop(drag, dropi).build().perform();
		
		
		
		//REGISTER IN AUTOMATION
		
		/*driver.navigate().to("http://demo.automationtesting.in/Register.html");
		
		WebElement register = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[2]/a"));
		register.click();

		WebElement First = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		First.sendKeys("Rekaaswini");

		WebElement last = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		last.sendKeys("E");

		WebElement address = driver.findElement(By.xpath("//textarea[@rows='3']"));
		address.sendKeys("No 1 maaveer garden kavangarai puzal cennai-600696");

		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("rekaaswin12881@gmail.com");

		WebElement pone = driver.findElement(By.xpath("//input[@type='tel']"));
		pone.sendKeys("9003125215");

		WebElement female = driver.findElement(By.xpath("//input[@value='FeMale']"));
		female.click();

		WebElement movies = driver.findElement(By.id("checkbox2"));
		movies.click();

		WebElement lang = driver.findElement(By.xpath("//div[@id='msdd']"));
		lang.click();
		WebElement eng = driver.findElement(By.xpath("(//a[@style='text-decoration:none'])[8]"));
		eng.click();
		
		WebElement seletionSkill = driver.findElement(By.id("Skills"));
		Select sc = new Select(seletionSkill);	
		sc.selectByVisibleText("CSS");

		WebElement contry = driver.findElement(By.id("countries"));
		contry.click();
		WebElement con = driver.findElement(By.xpath("//option[text()='Select Country']"));
		con.click();
		
		
		WebElement selectIndia = driver.findElement(By.xpath("//span[@role='combobox']"));
		selectIndia.click();
		
		WebElement in = driver.findElement(By.xpath("//li[text()='India']"));
		in.click();
		
		WebElement year = driver.findElement(By.id("yearbox"));
		Select ye=new Select(year) ;
		ye.selectByValue("1991");
		 
		WebElement mon = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select mont=new Select(mon)	;
		mont.selectByValue("September");
		
		WebElement day = driver.findElement(By.xpath("//select[@placeholder='Day']"));
		Select da=new Select(day);
		da.selectByValue("12");
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='firstpassword']"));
		pass.sendKeys("rekaaswini12@12");
		
		
		WebElement cpass = driver.findElement(By.xpath("//input[@id='secondpassword']"));
		cpass.sendKeys("rekaaswini12@12");
		
		WebElement submit = driver.findElement(By.xpath("//button[@id='submitbtn']"));
	    submit.click();*/
	}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*WebElement frame = driver.findElement(By.xpath("//*[@id=\"wrapframe\"]/iframe"));
		driver.switchTo().frame(frame);
		
		WebElement click = driver.findElement(By.id("Click"));
		click.click();
		String text = click.getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		WebElement firstFrame = driver.findElement(By.xpath(" //iframe[@src='page.html']"));
	driver.switchTo().frame(firstFrame);
	WebElement insideframe = driver.findElement(By.xpath(" //iframe[@name='frame2']"));
	driver.switchTo().frame(insideframe)	;
	WebElement SEcClick = driver.findElement(By.id("Click1"));
	SEcClick.click();
	String text2 = SEcClick.getText();
	System.out.println(text2);
	driver.switchTo().parentFrame();
	driver.switchTo().parentFrame();
	
		
	
	List<WebElement> siz = driver.findElements(By.tagName("iframe"));
	int size1 = siz.size();
	System.out.println(size1);*/
    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
