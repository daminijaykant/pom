package POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage 
{
	
	@FindBy(id="vipAddToCartButton")
	private WebElement addcart;
	
	@FindBy(xpath="//span[.='Add To Wishlist']")
	private WebElement addwish;
	
	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addbutton()
	{
		addcart.click();
	}
	
	public void addwishlist()
	{
		addwish.click();
	}
	
	

}
