package POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArchitectandDesigners 
{
	@FindBy(id="architectDesignerName")
	private WebElement name;
	
	@FindBy(id="architectDesignerEmail")
	private WebElement email;
	
	@FindBy(id="architectDesignerPhone")
	private WebElement number;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit1;
	
	@FindBy(id="architectDesignerExperience")
	private WebElement experience;
	
	@FindBy(id="architectDesignerCity")
	private WebElement city;
	
	@FindBy(id="architectDesignerCTC")
	private WebElement ctc;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit2;
	
	
	public ArchitectandDesigners(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void name(String name1)
	{
		name.sendKeys(name1);
	}
	
	public void email(String email1)
	{
		email.sendKeys(email1);
	}
	
	public void number(String number1)
	{
		number.sendKeys(number1);
	}
	
	public void submit1()
	{
		submit1.click();
	}
	
	public void experience(String exp1)
	{
		experience.sendKeys(exp1);
	}
	
	public void city(String city1)
	{
		city.sendKeys(city1);
	}
	
	public void ctc(String ctc1)
	{
		ctc.sendKeys(ctc1);
	}
	
	public void submit2()
	{
		submit2.click();
	}
	

}
