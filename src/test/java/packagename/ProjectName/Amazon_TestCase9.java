package packagename.ProjectName;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

public class Amazon_TestCase9 extends Connections{
	@Test
	public void UpadtingCart()
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
		ProductPage.AddToCart();
		Amazon_ShoppingCart ShoppingCart = new Amazon_ShoppingCart(driver);
		ShoppingCart.Go_To_Cart();
		ShoppingCart.Increment_Button();
		ShoppingCart.Proceed_To_Buy();
		Amazon_PlaceOrder PlaceOrder = new Amazon_PlaceOrder(driver);
		PlaceOrder.Delivery_Address();
	}
}
