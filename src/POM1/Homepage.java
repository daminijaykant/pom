package POM1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	Actions a=null;
	WebDriver driver=null;
	
	@FindBy(id="search")
	private WebElement searchbox;
	
	@FindBy(id="searchButton")
	private WebElement searchbutton;
	
	@FindBy(xpath="(//a[@href='javascript:void(0)'])[3]")
	private WebElement cart;
	
	@FindBy(xpath="(//a[@href='javascript:void(0)'])[2]")
	private WebElement wishlist;
	
	@FindBy(xpath="//a[@rel='nav_department']")
	private WebElement hoverdept;
	
	@FindBy(linkText="Wall Art")
	private WebElement wallart;
	
	@FindBy(linkText="Bar Posters")
	private WebElement barposter;
	
	@FindBy(xpath="(//div/ul/li/a)[2]")
	private WebElement architect;
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.a= new Actions(driver);
		this.driver=driver;
	}
	
	public void search(String name)
	{
		searchbox.click();
		searchbox.sendKeys(name);
	}
	
	public void searchbutton()
	{
		searchbutton.click();
	}
	
	public void cartlogo()
	{
		cart.click();
	}
	
	public void wishlistlogo()
	{
		wishlist.click();
	}
	
	public void hoverdepartment()
	{
		//a.moveToElement(hoverdept).perform();
		hoverdept.click();
	}
	
	public void hoverwallart()
	{
		a.moveToElement(wallart).perform();
	}
	
	public void barposters()
	{
		barposter.click();
	}
	
	public void architectanddesigners()
	{
		//architect.click();
		System.out.println(driver.findElement(By.linkText("Architects & Designers")).isDisplayed());
		driver.findElement(By.linkText("Architects & Designers")).click();
	}
}
