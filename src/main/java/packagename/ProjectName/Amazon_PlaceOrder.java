package packagename.ProjectName;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_PlaceOrder {
	@FindBy(id = "deliver-to-address-text")
	WebElement adress;
	public void Delivery_Address() {
		String address = adress.getText();
		System.out.println(address);
	}
	public Amazon_PlaceOrder(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
