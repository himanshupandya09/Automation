package automationframework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.*;

public class HRISAutomation {

	private static WebDriver driver=null;
	
	public static void main(String args[]) throws InterruptedException
	{
		
	
	System.setProperty("webdriver.chrome.driver","/home/himanshupandya/Downloads/chromedriver");
	
	driver=new ChromeDriver();
	driver.get("https://hris.qainfotech.com/login.php");
	driver.findElement(By.xpath("//i[@class='icon-lock']/following-sibling::span")).click();
	//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.findElement(By.cssSelector("[id='txtUserName']")).sendKeys("himanshupandya");
	driver.findElement(By.cssSelector("[id='txtPassword']")).sendKeys("Himanshu09@");
	driver.findElement(By.name("Submit")).click();
			
    Thread.sleep(1000);
    driver.findElement(By.cssSelector("[id='hamburger']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[@class='icon_size taskboard']/following-sibling::span")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[id='hamburger']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='icon_size dashboard']/following-sibling::span")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[id='hamburger']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='icon_size leave']/following-sibling::span")).click();
		Thread.sleep(1000);
		//driver.findElement(By.cssSelector("[id='hamburger']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='icon_size ear']/following-sibling::span")).click();
		Thread.sleep(1000);
		//driver.findElement(By.cssSelector("[id='hamburger']")).click();
		//Thread.sleep(1000);
		driver.get("https://hris.qainfotech.com/login.php");
		driver.findElement(By.xpath("//i[@class='icon-lock']/following-sibling::span")).click();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("[id='txtUserName']")).sendKeys("himanshupandya");
		driver.findElement(By.cssSelector("[id='txtPassword']")).sendKeys("Himanshu09@");
		driver.findElement(By.name("Submit")).click();
				
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("[id='hamburger']")).click();
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='icon_size support']/following-sibling::span")).click();
		Thread.sleep(1000);
		//driver.findElement(By.cssSelector("[id='hamburger']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='icon_size onsite']/following-sibling::span")).click();
		Thread.sleep(1000);
		//driver.findElement(By.cssSelector("[id='hamburger']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='icon_size HR']/following-sibling::span")).click();
		Thread.sleep(1000);
		//driver.findElement(By.cssSelector("[id='hamburger']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='icon_size feedback']/following-sibling::span/parent::a")).click();
		Thread.sleep(1000);
		//driver.findElement(By.cssSelector("[id='hamburger']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='icon_size assessment']/following-sibling::span/parent::a")).click();
		Thread.sleep(1000);
		//driver.findElement(By.cssSelector("[id='hamburger']")).click();
		//Thread.sleep(1000);
}
}