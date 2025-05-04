package packagename.ProjectName;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestListener.class)
public class Amazon_TestCase4 extends Connections{
	@Test(dataProvider = "validdata",dataProviderClass = DataExcel.class,retryAnalyzer = RetryLogic.class)
	public void validCred(String username,String password)
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
		SearchPage.search_Category();
		SearchPage.First_Product();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> i= windows.iterator();
		String parentwindow = i.next();
		String Childwindow = i.next();
		driver.switchTo().window(Childwindow);
		Amazon_ProductPage ProductPage = new Amazon_ProductPage(driver);
		ProductPage.Product_Details();
		
		
		
	}
}
