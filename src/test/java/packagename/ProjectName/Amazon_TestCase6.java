package packagename.ProjectName;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestListener.class)
public class Amazon_TestCase6 extends Connections{
	@Test(dataProvider = "validdata",dataProviderClass = DataExcel.class,retryAnalyzer = RetryLogic.class)
	public void AddToCartNoLogin(String username,String password)
	{
		Amazon_SearchPage SearchPage = new Amazon_SearchPage(driver);
		SearchPage.Search_box("Shoes");
		SearchPage.First_Product();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> i= windows.iterator();
		String parentwindow = i.next();
		String Childwindow = i.next();
		driver.switchTo().window(Childwindow);
		Amazon_ProductPage ProductPage = new Amazon_ProductPage(driver);
		ProductPage.AddToCart();
		Amazon_ShoppingCart ShoppingCart = new Amazon_ShoppingCart(driver);
		ShoppingCart.Proceed_To_Buy();
		Amazom_LoginPage LoginPage = new Amazom_LoginPage(driver);
		LoginPage.Username(username);
		LoginPage.Continue_Button();
		LoginPage.Password(password);
		LoginPage.SignInButton();
		Amazon_PlaceOrder PlaceOrder = new Amazon_PlaceOrder(driver);
		PlaceOrder.Delivery_Address();
		PlaceOrder.Credit_Card();
		PlaceOrder.Click_Plus();
		PlaceOrder.card_Num("123456767");
		PlaceOrder.Click_Save();	
	}
}
