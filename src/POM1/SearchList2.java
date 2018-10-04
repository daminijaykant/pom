package POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchList2 
{
	@FindBy(xpath="(//a[@data-tooltip='Add to Wishlist'])[2]")
	private WebElement wishlisticon;
	
	@FindBy(linkText="Rico Accent Rocking Chair")
	private WebElement chair;
	
	public SearchList2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addwishlist()
	{
		wishlisticon.click();
	}
	
	public void rockingchair()
	{
		chair.click();
	}

}
