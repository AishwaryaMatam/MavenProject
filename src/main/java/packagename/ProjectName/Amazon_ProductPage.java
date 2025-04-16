package packagename.ProjectName;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_ProductPage {
	@FindBy(id ="add-to-cart-button")
	WebElement AddCart;
	
	@FindBy(xpath = "//ul[@class='a-nostyle']/li")
	List<WebElement> productDetails;
	
	public void AddToCart()
	{
		AddCart.click();
	}
	
	public void Product_Details()
	{
		int count = productDetails.size();
		for(int i = 0;i<count;i++)
		{
			WebElement Detail = productDetails.get(i);
			String Value = Detail.getText();
			System.out.println(Value);
		}
	}
	public Amazon_ProductPage(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
