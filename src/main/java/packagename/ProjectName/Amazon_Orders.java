package packagename.ProjectName;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Orders {
	@FindBy (xpath = "//span[@class='num-orders']")
	WebElement ordersCount;
	
	public void Order_Count()
	{
		String Count = ordersCount.getText();
		System.out.println(Count);
	}
	public Amazon_Orders(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}

