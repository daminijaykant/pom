package POM1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout 
{
	@FindBy(linkText="Hi Daminee")
	private WebElement profiledropdownmenu;
	
	@FindBy(linkText="")
	private WebElement logoutbutton;
	
	Actions a=null;
	WebDriver driver=null;
	
	public Logout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.a= new Actions(driver);
		this.driver=driver;
	}
	
	public void profiledropdown()
	{
		a.moveToElement(driver.findElement(By.linkText("Hi Daminee"))).perform();
	}
	public void logout()
	{
		driver.findElement(By.linkText("Logout")).click();
	}

}
