package POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BarPosters1 
{
	
	@FindBy(xpath="//a[contains(.,'College Where Leaders')][1]")
	private WebElement collegeposter;
	
	public BarPosters1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void poster()
	{
		collegeposter.click();
	}

}
