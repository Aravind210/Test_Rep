package com.selfbase.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {
	
	public static WebDriver driver;
	
	public static WebDriver Getbrowser(String type) {
		
		
		if (type.equalsIgnoreCase("chrome")) {
			
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			
			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + ".\\Driver\\chromedriver.exe");
			
			// driver=new ChromeDriver();

				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");
			
			
				 driver=new ChromeDriver();
				 
			 
			 
		}
		
		else if (type.equalsIgnoreCase("firefox")) {
			
			//System.setProperty("webdriver.firefox.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Driver\\geckodriver.exe");
			
			System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir") +  ".\\Driver\\geckodriver.exe");
			
			
		    driver=new FirefoxDriver();
			 
			
		}
		
			
	 driver.manage().window().maximize();
	 
	 return driver;
	 
	}
	
	
	// Driver Methods
	
	public static void Startlink(String link) {
		
		driver.get(link);	
	}
	
	public static void Currentlink() {
		
		driver.getCurrentUrl();
		
	}
	
	public static void Caption() {
		
		driver.getTitle();
		
	}
	
	public static void Transferto(String tlink) {
		
		driver.navigate().to(tlink);
		
	}
	
	public static void Transferback() {
		
		driver.navigate().back();
		
	}
	
	public static void Transferfwd() {
		
		driver.navigate().forward();
		
	}
	
	public static void Revive() {
		
		driver.navigate().refresh();
		
	}
	
	//Alert
	
	public static void Sialert() {
		
		Alert simalert = driver.switchTo().alert();
		
		simalert.accept();	
		
	}
	
	public static void Coalert() {
		
		Alert conalert = driver.switchTo().alert();
		
		conalert.accept();
		
	}
	
	public static void Pralert() {
		
		Alert prmalert = driver.switchTo().alert();
		
		prmalert.accept();
		
	}
	
	//Actions
	
	public static void Acclick(WebElement element) {
		
		Actions a=new Actions(driver);
		
		a.click(element).build().perform();
		
	}
	
	public static void Acconclick(WebElement element) {
		
		Actions a=new Actions(driver);
		
		a.contextClick(element).build().perform();
			
	}
	
	public static void Acdclick(WebElement element) {
		
		Actions a=new Actions(driver);
		
		a.doubleClick(element).build().perform();
			
	}
	
	public static void Acdragdrap(WebElement selement,WebElement telement) {
		
		Actions a=new Actions(driver);
		
		a.dragAndDrop(selement, telement).build().perform();
		
		
	}
	
	public static void Acmoveto(WebElement target) {
		
		Actions a=new Actions(driver);
		
		a.moveToElement(target).build().perform();
			
	}
	
	//Frames
	
	public static void Imount(WebElement inframe) {
		
		inframe.click();
		
		driver.switchTo().frame(0);
		
	}
	
	
	public static void Dmount(WebElement dframe) {
		
		dframe.click();
		
		driver.switchTo().defaultContent();
				
	}
	
	//Robot
	
	public static void Botdown() throws AWTException {
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		
	}
	
	public static void Botenter() throws AWTException {
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
			
	}
	
	
	// Window Handle
	
	public static void Getwindowcontrol() {
		
		driver.getWindowHandle();
		
	}
	
	
	public static void Getwindowcontrols() {
		
		driver.getWindowHandles();
		
	}
	
	
	// Dropdown
	
	public static void Ddgetoptions(WebElement element) {
		
		Select s=new Select(element);
		
		List<WebElement> options = s.getOptions();
		
		for (WebElement alloptions : options) {
			
			String text = alloptions.getText();
			
			System.out.println(text);
			
		}
		
	}
	
	
	public static void Ddenable(WebElement element) {
		
		element.isEnabled();
			
	}
	
	public static void Ddselect(WebElement element) {
		
		element.isSelected();
		
	}
	
	public static void Dddisplay(WebElement element) {
		
		element.isDisplayed();
		
	}
	
	public static void Ddmultiple(WebElement element) {
		
		Select s=new Select(element);
		
		s.isMultiple();
			
	}
	
	
	public static void Ddallselected(WebElement element) {
		
		Select s=new Select(element);
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		
		for (WebElement allselect : allSelectedOptions) {
			
			String text = allselect.getText();
			
			System.out.println(text);
			
		}
			
	}
	
	public static void Ddfirstselect(WebElement element) {
		
		Select s=new Select(element);
		
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		
		String text = firstSelectedOption.getText();
		
		System.out.println(text);
		
	}
	
	public static void Ddgetattribute(By bysearch) {
		
		WebElement element = driver.findElement(bysearch);
		
		System.out.println(element);
			
	}

	
	public static void Ddselectivt(WebElement element,String options,String input) {
		
		Select s=new Select(element);
		
		if (options.equalsIgnoreCase("index")) {
			
			int parseInt = Integer.parseInt(input);
			
			s.selectByIndex(parseInt);
			
		}
		
		else if (options.equalsIgnoreCase("value")) {
			
			s.selectByValue(input);
				
		}
		
		else if (options.equalsIgnoreCase("text")) {
			
			s.selectByVisibleText(input);
			
		}
			
	}
	
	
	public static void Impliciteresponse() {
		
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}
	
	public static void Expliciteresponse(WebElement element) {
		
		WebDriverWait wait=new WebDriverWait(driver, 60);
		
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	
	public static void Fluentresponse(WebElement element) {
		
		
		Wait wait =new FluentWait(driver).withTimeout(60, TimeUnit.SECONDS).pollingEvery(15, TimeUnit.SECONDS).ignoring(null);
		
	}
	
	//Screenshot
	
	public static void snapshot() throws IOException {
		
		TakesScreenshot t=(TakesScreenshot) driver;
		
		File source = t.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Screenshot\\snapshot.png");
		
		FileUtils.copyDirectory(source, dest);	
		
	}
	
	//Scrollupdown
	
	
	public static void Godown() {
		
		JavascriptExecutor j=(JavascriptExecutor) driver;
		
		j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			
	}
	
	public static void Gopixel() {
		
		JavascriptExecutor j=(JavascriptExecutor) driver;
		
		j.executeScript("window.scrollBy(0,5000)");
	
	}
	
	public static void Godowntoup(WebElement head,WebElement tail) {
		
		JavascriptExecutor j=(JavascriptExecutor) driver;
		
		j.executeScript("arguments[0].scrollIntoView();", tail);
		
		j.executeScript("arguments[0].scrollIntoView();", head);
		
	}
	
	public static void Passvalues(WebElement element,String s) {
		
		element.sendKeys(s);	
		
	}
	
	public static void Tapon(WebElement element) {
		
		element.click();
		
	}
	
	public static void Enquire(WebElement element) {
		
		element.click();
		
	}
	
	public static void Shutdown() {
		
		driver.close();
		
	}
	
	public static void Terminate() {
		
		driver.quit();
		
	}
	
	
}
