package packagename.ProjectName;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

public class Amazon_TestCase6 extends Connections{
	@Test
	public void AddToCartNoLogin()
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
		LoginPage.Username("aishwaryamatam5@gmail.com");
		LoginPage.Continue_Button();
		LoginPage.Password("Shilp@me245");
		LoginPage.SignInButton();
		Amazon_PlaceOrder PlaceOrder = new Amazon_PlaceOrder(driver);
		PlaceOrder.Delivery_Address();
		
	}
}
