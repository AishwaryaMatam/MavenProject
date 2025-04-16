package packagename.ProjectName;

import org.testng.annotations.Test;

public class Amazon_TestCase8 extends Connections{
	@Test
	public void Orders()
	{
		Amazom_HomePage HomePage= new Amazom_HomePage(driver);
		HomePage.account_signin(driver);
		HomePage.SignIn_Button();
		Amazom_LoginPage LoginPage = new Amazom_LoginPage(driver);
		LoginPage.Username("aishwaryamatam5@gmail.com");
		LoginPage.Continue_Button();
		LoginPage.Password("Shilp@me245");
		LoginPage.SignInButton();
		HomePage.Order_Returns();
		Amazon_Orders orders = new Amazon_Orders(driver);
		orders.Order_Count();
	}
}
