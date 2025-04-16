package packagename.ProjectName;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_SearchPage {
	
	@FindBy(xpath = "(//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal'])[1]")
	WebElement firstProduct;
	
	@FindBy(xpath="//ul[@id='filter-n']/span/span/li")
	List<WebElement> CategoryList;
	
	@FindBy(id="filter-p_123")
	WebElement fresh;
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement search;
	
	@FindBy(xpath = "//span[@class='a-button a-button-dropdown a-button-small']")
	WebElement SortBy;
	
	@FindBy(xpath="(//a[@id='s-result-sort-select_4'])[5]")
	WebElement newArrivals;
	
	public void search_Category()
	{
		int count = CategoryList.size();
		//for(WebElement Category: CategoryList)
		for(int i=0;i<count;i++)
		{
			WebElement Category = CategoryList.get(i);
			String value = Category.getDomAttribute("class");
			//System.out.println(value);
		}
		
	}
	public void Search_box(String SearchWord)
	{
		search.sendKeys(SearchWord + Keys.ENTER);
	}
	public void First_Product()
	{
		firstProduct.click();
	}
	public void Sort_By()
	{
		SortBy.click();
	}
	public void New_Arrivals()
	{
		newArrivals.click();
	}
	public Amazon_SearchPage(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
