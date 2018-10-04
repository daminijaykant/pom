package POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlistpopup 
{
	
	@FindBy(xpath="//a[@data-tooltip='Remove Item']")
	private WebElement remove;
	
	@FindBy(xpath="(//a[@href='javascript://'])[1]")
	private WebElement close;
	
	@FindBy(xpath="//a[@data-tooltip='Add to Cart']")
	private WebElement addcart;
	
	public Wishlistpopup(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void removeitem()
	{
		remove.click();
	}
	
	public void closepopup()
	{
		close.click();
	}
	
	public void addtocart()
	{
		addcart.click();
	}

}
