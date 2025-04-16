package packagename.ProjectName;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_ShoppingCart {
	@FindBy(name = "proceedToRetailCheckout")
	WebElement ProceedBuy;
	
	@FindBy(xpath ="//a[@href='/cart?ref_=sw_gtc']")
	WebElement cart;
	
	@FindBy(xpath = "//span[@data-a-selector='increment-icon']")
	WebElement increment;
	
	
	public void Proceed_To_Buy()
	{
		ProceedBuy.click();
	}
	public void Go_To_Cart()
	{
		cart.click();
	}
	
	public void Increment_Button()
	{
		increment.click();
	}
	
	
	public Amazon_ShoppingCart(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
