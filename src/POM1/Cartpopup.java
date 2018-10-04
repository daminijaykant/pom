package POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpopup 
{
	@FindBy(xpath="//a[@class='gb-close pf-icon pf-icon-close']")
	private WebElement closecart;
	
	@FindBy(xpath="//a[@data-tooltip='Remove Item']")
	private WebElement remove;
	
	@FindBy(xpath="(//a[@class='move-wishlist'])[1]")
	private WebElement movewishlist;
	
	public Cartpopup(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void closecartpopup()
	{
		closecart.click();
	}
	
	public void removeitem()
	{
		remove.click();
	}
	
	public void movetowishlist()
	{
		movewishlist.click();
	}

}
