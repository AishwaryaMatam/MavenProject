package packagename.ProjectName;

import org.testng.annotations.Test;

public class Amazon_TestCase3 extends Connections{
	@Test
	public void SearchProduct()
	{
		Amazom_HomePage HomePage= new Amazom_HomePage(driver);
		HomePage.account_signin(driver);
		HomePage.SignIn_Button();
		Amazom_LoginPage LoginPage = new Amazom_LoginPage(driver);
		LoginPage.Username("aishwaryamatam5@gmail.com");
		LoginPage.Continue_Button();
		LoginPage.Password("Shilp@me245");
		LoginPage.SignInButton();
		Amazon_SearchPage SearchPage = new Amazon_SearchPage(driver);
		SearchPage.Search_box("Vegetables");
		SearchPage.search_Category();
		
	}
}
