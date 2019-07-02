import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class HRISLoginTest {

	HRISloginAction obj;

	@BeforeClass
	public void initiateSession() {
		obj=new HRISloginAction();
		obj.initializeWebDriver();

		obj.LaunchUrl();
	}


	@Test public void VerifyUserLogin() {
		obj.InputUserName(); 
		obj.InputUserPassword(); 
		obj.SubmitDetails(); 
		obj.VerifyUserHasLoggedIn();

	}


}
