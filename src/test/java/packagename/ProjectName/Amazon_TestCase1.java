package packagename.ProjectName;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(TestListener.class)
public class Amazon_TestCase1 extends Connections{
	@Test(dataProvider = "validdata",dataProviderClass = DataExcel.class,retryAnalyzer = RetryLogic.class)
	public void validCred(String username,String password)
	{
		//WebDriver driver;
		//ChromeDriver driver = new ChromeDriver();
		SoftAssert s = new SoftAssert(); 
		Amazom_HomePage HomePage= new Amazom_HomePage(driver);
		s.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		Reporter.log("HomePage");
		HomePage.account_signin(driver);
		HomePage.SignIn_Button();
		Amazom_LoginPage LoginPage = new Amazom_LoginPage(driver);
		Reporter.log("Username Page");
		LoginPage.Username(username);
		LoginPage.Continue_Button();
		s.assertEquals(driver.getTitle(), "Amazon Sign In");
		Reporter.log("Password Page");
		LoginPage.Password(password);
		LoginPage.SignInButton();
		s.assertAll();
		
	}
}
