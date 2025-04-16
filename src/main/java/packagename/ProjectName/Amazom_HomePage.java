package packagename.ProjectName;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazom_HomePage {
	ChromeDriver driver;
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement signin_hoverOver ;
	
	@FindBy(xpath = "//span[@class='nav-action-inner']")
	WebElement SignIn_Button ;
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement search;
	
	@FindBy(id = "nav-orders")
	WebElement orders;
	
	@FindBy(linkText="Sign Out")
	WebElement SignOut;
	public void account_signin(ChromeDriver driver)
	{
		Actions a = new Actions(driver);
		a.moveToElement(signin_hoverOver).perform();
	}
	public void SignIn_Button()
	{
		SignIn_Button.click();
	}
	public void Search_box(String SearchWord)
	{
		search.sendKeys(SearchWord + Keys.ENTER);
	}
	public void SignOut_Method()
	{
		SignOut.click();
	}
	public void Order_Returns()
	{
		orders.click();
	}
	public Amazom_HomePage(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
