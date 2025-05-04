package packagename.ProjectName;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_PlaceOrder {
	@FindBy(id = "deliver-to-address-text")
	WebElement adress;
	@FindBy(xpath ="//input[@value='SelectableAddCreditCard']")
	WebElement card;
	@FindBy(xpath = "(//img[@class='apx-add-pm-trigger-common-image'])[1]")
	WebElement PlusSym;
	@FindBy(xpath = "//input[@name='addCreditCardNumber']")
	WebElement cardNum;
	@FindBy(name = "ppw-widgetEvent:AddCreditCardEvent")
	WebElement Save;
	public void Delivery_Address() {
		String address = adress.getText();
		System.out.println(address);
	}
	public void Credit_Card() {
		card.click();
	}
	public void Click_Plus() {
		PlusSym.click();
	}
	public void card_Num(String number) {
		cardNum.sendKeys(number);
	}
	public void Click_Save() {
		Save.click();
	}
	public Amazon_PlaceOrder(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
