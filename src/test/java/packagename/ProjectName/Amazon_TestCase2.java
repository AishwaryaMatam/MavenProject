package packagename.ProjectName;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestListener.class)
public class Amazon_TestCase2 extends Connections {
	@Test(dataProvider = "Invaliddata", dataProviderClass = DataExcel.class,retryAnalyzer = RetryLogic.class)
	public void InvalidCred(String validUsername,String Invalidpassword)
	{
		Amazom_HomePage HomePage= new Amazom_HomePage(driver);
		HomePage.account_signin(driver);
		HomePage.SignIn_Button();
		Amazom_LoginPage LoginPage = new Amazom_LoginPage(driver);
		LoginPage.Username(validUsername);
		LoginPage.Continue_Button();
		LoginPage.Password(Invalidpassword);
		LoginPage.SignInButton();
	}
}
