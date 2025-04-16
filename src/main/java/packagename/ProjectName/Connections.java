package packagename.ProjectName;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Connections {
	//WebDriver driver;
	ChromeDriver driver = new ChromeDriver();
	@BeforeMethod
	public void connection()
	{
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.navigate().refresh();
	}
	
	@AfterMethod
	public void quit()
	{
		/*Amazom_HomePage HomePage= new Amazom_HomePage(driver);
		HomePage.account_signin(driver);
		HomePage.SignOut_Method();
		*/
		driver.quit();
	}
}
