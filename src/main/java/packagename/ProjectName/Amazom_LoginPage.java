package packagename.ProjectName;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazom_LoginPage {
	@FindBy(xpath = "//input[@autocomplete='username']")
	WebElement username;
	
	@FindBy(xpath = "//input[@class='a-button-input']")
	WebElement continue_button;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement password;
	
	@FindBy(id = "signInSubmit")
	WebElement SignIn_Button;
	
	public void Username(String UserEmail)
	{
		username.sendKeys(UserEmail);
	}
	public void Continue_Button()
	{
		continue_button.click();
	}
	public void Password(String UserPassword)
	{
		password.sendKeys(UserPassword);
	}
	public void SignInButton()
	{
		SignIn_Button.click();
	}
	
	public Amazom_LoginPage(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
