package POM1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchlist1 
{
	@FindBy(xpath="a[contains(text(),'Classic XXXL Bean Bag with Beans in Brown Colour')]")
	private WebElement hoveritem;
	
	@FindBy(id="productClickSearch_1509272")
	private WebElement additem;
	
	
	Actions a=null;
	WebDriver driver=null;
	
	public Searchlist1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.a= new Actions(driver);
		this.driver=driver;
	}
	
	
	
	public void hoveritem()
	{
		a.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Classic XXXL Bean Bag with Beans in Brown Colour')]"))).perform();
	}
	
	public void clickitem()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Classic XXXL Bean Bag with Beans in Brown Colour')]")).click();
	}
	
	public void additem()
	{
		additem.click();
	}

}
