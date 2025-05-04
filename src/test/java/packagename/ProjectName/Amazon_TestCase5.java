package packagename.ProjectName;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestListener.class)
public class Amazon_TestCase5 extends Connections{
	@Test(dataProvider = "validdata",dataProviderClass = DataExcel.class,retryAnalyzer = RetryLogic.class)
	public void SortSearch(String username,String password)
	{
		Amazom_HomePage HomePage= new Amazom_HomePage(driver);
		HomePage.account_signin(driver);
		HomePage.SignIn_Button();
		Amazom_LoginPage LoginPage = new Amazom_LoginPage(driver);
		LoginPage.Username(username);
		LoginPage.Continue_Button();
		LoginPage.Password(password);
		LoginPage.SignInButton();
		Amazon_SearchPage SearchPage = new Amazon_SearchPage(driver);
		SearchPage.Search_box("Shirts");
		SearchPage.Sort_By();
		SearchPage.New_Arrivals();
		
		
	}
}
