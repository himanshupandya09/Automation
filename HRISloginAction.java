import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HRISloginAction {


	WebDriver driver;

	public void initializeWebDriver() {		
		System.setProperty("webdriver.chrome.driver","/home/himanshupandya/Downloads/chromedriver");
		driver=new ChromeDriver();
	}	



	public  void LaunchUrl()
	{


		driver.navigate().to("https://hris.qainfotech.com/login.php");
		String url="https://hris.qainfotech.com/login.php";
	}
	public void InputUserName()
	{
		driver.findElement(By.cssSelector("[name='txtUserName']")).sendKeys("himanshupandya");
	}
	
	public void InputUserPassword()
	{
		driver.findElement(By.cssSelector("[name='txtPassword']")).sendKeys("Himanshu09@"); 
	}
	public void SubmitDetails()
	{
		driver.findElement(By.cssSelector("[name='Submit']")).click();
	}
	public void VerifyUserHasLoggedIn()
	{
		String url="https://hris.qainfotech.com:8086/time/timesheet";
		String actualurl=driver.getCurrentUrl();
		Assert.assertEquals(url, actualurl);
	}

}
